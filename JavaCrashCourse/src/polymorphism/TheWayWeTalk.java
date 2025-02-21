package polymorphism;

public class TheWayWeTalk {

	public void talk(Parents StyleOfTalking) {
		System.out.println("respectful");
	}
	public void talk(Partner StyleOfTalking) {   //method overloading
		System.out.println("Romantic");
	}
	public void talk(Boss StyleOfTalking) {   //method overloading  there should be some change in arguments atleast the order but method name should be same
		System.out.println("nothing personal strictly business");
	}
	public static void main(String[] args) {
		TheWayWeTalk talk= new TheWayWeTalk();
		Parents parents = new Parents();
		Partner partner = new Partner();
		Boss boss = new Boss();
		talk.talk(parents);    //early binding we got to know where it combines earlier
		talk.talk(partner);
		talk.talk(boss);
	}

}


//overloading happens in same class
//overriding happens in is-a relationship with parents and child with inheritance