# Normalize declared package and only output entries where expected is real and differs
$root = 'C:\Users\DELL\git\Master_branch'
$out = Join-Path $root 'scripts\to_fix.txt'
if (!(Test-Path (Split-Path $out))) { New-Item -ItemType Directory -Path (Split-Path $out) | Out-Null }
'' | Set-Content -Path $out -Encoding UTF8
Get-ChildItem -Path $root -Recurse -Filter *.java | ForEach-Object {
    $path = $_.FullName
    if ($path -like '*module-info.java') { return }
    $content = Get-Content -Path $path -TotalCount 60 -ErrorAction SilentlyContinue
    $decl = '(none)'
    foreach ($line in $content) { if ($line -match '^\s*package\s+([A-Za-z0-9_.]+)\s*;') { $decl = $matches[1]; break } }
    $declNorm = $decl
    if ($declNorm -eq '(none)') { $declNorm = '(default)' }
    $rel = $path.Substring($root.Length + 1)
    $idx = $rel.IndexOf('\src\')
    if ($idx -ge 0) { $after = $rel.Substring($idx + 5) } else { $after = $rel }
    $parts = $after -split '[\\/]'
    $filtered = @()
    foreach ($p in $parts) {
        if ($p -in @('main','java','test','resources','src')) { continue }
        if ($p -match '\.java$') { continue }
        $filtered += $p
    }
    if ($filtered.Count -ge 1) { $expected = ($filtered -join '.') }
    else { $expected = '(default)' }
    if ($expected -ne '(default)' -and $expected -ne '(unknown)' -and $declNorm -ne $expected) { "$path|$decl|$expected" | Add-Content -Path $out }
}
Write-Host "Wrote to $out"