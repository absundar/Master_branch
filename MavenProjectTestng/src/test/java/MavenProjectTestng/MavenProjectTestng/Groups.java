package MavenProjectTestng.MavenProjectTestng;

import org.testng.annotations.Test;

public class Groups {
@Test(groups = {"Software Company"})
public void Infosys() {
	System.out.println("Infy");
}
@Test(dependsOnGroups = {"Software Company"})
public void justdial() {
	System.out.println("Justdial");
}
@Test(groups = {"Software Company"})
public void Cognizant() {
	System.out.println("Cognizant");
}

}
