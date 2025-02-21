package constructors;

public class NoArgumentConstructor {
int employee_id;
String employee_name;
 
NoArgumentConstructor(){
	employee_id = 1327365;
	employee_name= "abhi";
	System.out.println("employee data is created");
}

	public static void main(String[] args) {
		NoArgumentConstructor nac = new NoArgumentConstructor();
	}

}
