package conditionalStatements;

public class IfElseIf {
String hero= "Ashwanth ragav";

	public void myHero() {
		if(hero.equals("Leela")) {
			System.out.println("the myhero is Leela");
		}
		else if(hero.equalsIgnoreCase("Ashwanth Ragav")) {
			System.out.println("the my hero is Ragav");
		}
		else if(hero.equals("Abhi")) {
			System.out.println("the my hero is Abhi");
		}
		else {
			System.out.println("i dont know about it");
		}
	}
	
	public static void main(String[] args) {
		IfElseIf iei = new IfElseIf();
		iei.myHero();
	}

}
