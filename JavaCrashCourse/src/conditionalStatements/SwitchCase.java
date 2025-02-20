package conditionalStatements;

public class SwitchCase {
String hero = "Leela";
public void myHero() {
	switch(hero) {
	case "Ragav":
		System.out.println("the my hero is Ragav");
		break;
		
	case "Leela":
		System.out.println("the my hero is Leela");
		break;
		
	case "Abhi":
		System.out.println("the my hero is Abhi");
		break;
		
	default:
		System.out.println("Sorry i cannot guess");
}
}
	public static void main(String[] args) {
		SwitchCase mh = new SwitchCase();
		mh.myHero();
	}

}
