package polymorphism;

public class Addition {

	int add(int n1, int n2) {
		return n1+n2;
		
	}
	int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	float add(float n1, float n2)
	{
		return n1+n2;
		
	}
	public static void main(String[] args) {
		Addition object = new Addition();
		System.out.println("The additon is "+ object.add(20,21));
		System.out.println("the sum is " + object.add(324, 352, 23));
		//System.out.println("The float additon is " + object.add(45.54, 89.98));
	}

}
