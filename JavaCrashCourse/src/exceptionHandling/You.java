package exceptionHandling;

public class You {
public void makeYourGirlLaugh() {
try {
	throw new MachanInterruptedException("Machan is coming to hit you");
}catch(MachanInterruptedException e) {
	//e.printStackTrace();
System.out.println("Your friend: Machan give this pose da");
System.out.println("this is instagram post");
}
}
	public static void main(String[] args) {
You u= new You();
u.makeYourGirlLaugh();
	}

}
