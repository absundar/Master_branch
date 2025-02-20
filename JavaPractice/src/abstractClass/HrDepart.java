package abstractClass;

public class HrDepart extends ITDepart{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepart obj1 = new HrDepart();
		obj1.goodies();
		obj1.salary();
		obj1.work();
		obj1.bonus();    //can be called as the method and obj are created for the class
		
		//ITDepart obj2= new ITDepart(); //not possible as the class reference and class are different
		
		ITDepart obj3= new HrDepart();
		obj3.goodies();
		obj3.salary();
		obj3.work();   // additional method bonus cant be called as bonus is created in Hrdepart
		
	//	HrDepart obj4= new ITDepart();  //not possible to create for ITDepart as the class is HRDepart
		
		//HrDepart obj5 = new Emp();//cant create object for interface
		
		//Emp obj6 = new ITDepart();  //not possible
		
		
		//if the class is not fully implemented then it will not allow to create object

	}
public void bonus()   //just an extra method
{
	System.out.println("diwali bonus");
}
	public void salary() {
System.out.println("5 LPA");		
	}

//	@Override
//	public void salary() {
//		// TODO Auto-generated method stub
//		
//	}

}
