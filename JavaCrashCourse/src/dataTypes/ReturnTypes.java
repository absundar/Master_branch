package dataTypes;

public class ReturnTypes {
public Integer collectAmount =1900;

public Integer collectAmountAndGiveItToMe() {
	System.out.println("Collected amount is " + collectAmount);
	return collectAmount;
	
}

	public static void main(String[] args) {
		ReturnTypes rt = new ReturnTypes();
	Integer amount=	rt.collectAmountAndGiveItToMe();
		System.out.println("give it to me" + amount);
	}

}
