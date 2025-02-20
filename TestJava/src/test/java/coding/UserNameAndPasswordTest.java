package coding;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import DB.TestJava.User;

public class UserNameAndPasswordTest {

	@Test
	public void userHasDefaultUsernameAndPassword() {
//		User user = new User(); //constructor without arguments
//		user.username ="abhi";
//		user.password ="test";
//		assertEquals("abhi", user.getUsername());
//		System.out.println("abhi");
//		assertEquals("test", user.getPassword());
//		System.out.println("test");
		
 //another method
		
//		User user = new User("abhi", "test");
//		assertEquals("abhi", user.username);
//		assertEquals("test", user.password);
//		
		//another method
		User user = new User();
		user.setUsername("Leela");
		user.setPassword("Ragav");
		assertEquals("Leela", user.getUsername());
		//assertEquals("Ragav", user.getPassword());
	}
}
