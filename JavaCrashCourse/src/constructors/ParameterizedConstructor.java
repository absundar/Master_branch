package constructors;

public class ParameterizedConstructor {
String animal_name;
String animal_type;

ParameterizedConstructor(String name, String type){
	animal_name= name;
	animal_type=type;
}
public void sayAboutAnimal() {
	System.out.println("Animal name is "+ animal_name + "animal type is" +animal_type);
}
	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor("lion", "wild");
		pc.sayAboutAnimal();
	}

}
