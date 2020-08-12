package practicas.bootcamp;

class StudentDetails {

	public void studentAge(){
		
	int age = 0;
	age = age + 5;
	
	System.out.println("La edad del estudiantes es de " + age);
}
	public static void main(String args []) {	
		
		StudentDetails StudentsName = new StudentDetails ();
		StudentsName.studentAge();
		
}
}