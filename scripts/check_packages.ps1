# Replace previous output logic with a robust CSV-style audit written to C:\temp\package_audit.txt
$root = 'C:\Users\DELL\git\Master_branch'
$results = @()
Get-ChildItem -Path $root -Recurse -Filter *.java | ForEach-Object {
    $path = $_.FullName
    $content = Get-Content -Path $path -TotalCount 40 -ErrorAction SilentlyContinue
    $pkg = '(none)'
    foreach ($line in $content) {
        if ($line -match '^\s*package\s+([A-Za-z0-9_.]+)\s*;') { $pkg = $matches[1]; break }
    }
    $rel = $path.Substring($root.Length + 1)
    $idx = $rel.IndexOf('\\src\\')
    if ($idx -ge 0) {
        $after = $rel.Substring($idx + 5)
        $after = $after -replace '^(main\\java|test\\java)\\',''
        $dir = Split-Path $after -Parent
        if ([string]::IsNullOrEmpty($dir)) { $expected='(default)'} else { $expected = $dir -replace '\\','.' }
    } else {
        $expected='(unknown)'
    }
    $results += "$path|$pkg|$expected"
}
if (!(Test-Path 'C:\temp')) { New-Item -Path 'C:\temp' -ItemType Directory | Out-Null }
$dest = 'C:\temp\package_audit.txt'
$results | Set-Content -Path $dest -Encoding UTF8
Write-Host "Wrote $($results.Count) entries to $dest`nMismatches (Declared != Expected):`n"
Get-Content $dest | ForEach-Object {
    $parts = $_ -split '\|'
    if ($parts.Count -ge 3) {
        $file=$parts[0]; $decl=$parts[1]; $exp=$parts[2]
        if ($decl -ne $exp) { Write-Host "$file -> Declared: $decl ; Expected: $exp" }
    }
}