package abstraction;

public class BMW extends Car implements UpcomingProjects {
@Override
public void engine() {
	System.out.println("Bmw engine");
}
@Override
public void vault() {
	System.out.println("Bmw vault");
}
	public static void main(String[] args) {
Car car = new BMW();
car.engine();
car.vault();
	}
	@Override
	public void employee() {   //when upcomingprojects is implemented the other methods which are not abstract in upcoming projects gets implemented
		// TODO Auto-generated method stub
		
	}

}
