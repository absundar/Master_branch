package practice;

public class OneDArray {

	public static void main(String[] args) {
//datatype arrayname[] = new datatype[size]  //array syntax
		
		int student_id[] = new int[5];
		
		 student_id[0]= 543;
		 student_id[1]=5432;
		 student_id[2]=87;
		 student_id[3]=9809;
		 student_id[4]=9892;
		 int array_size= student_id.length;
		 System.out.println("get the size of the array " +array_size);
		 for(int i=0;i < array_size; i++) {
			 System.out.println("get the element "+student_id[i]);
		 }
		
	}

}
