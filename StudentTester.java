
public class StudentTester {

	public static void main(String[] args) {
		
		Student[] theStudents = new Student[5];
		
		theStudents[0] = new Student("Sally", "Studier", 1234);
		theStudents[1] = new Student("Pete", "Procrastinator", 5264);
		theStudents[2] = new Student("Alan", "Asksalot", 3671);
		
		Student g1 = new GradStudent("Greg", "Grad", 1672, "Popular Culture");
		GradStudent g2 = new GradStudent("Uma", "Uncertain", 8941);
		
		theStudents[3] = g1;
		theStudents[4] = g2;
		
		//System.out.println(g1.getThesisTopic());- COMPILER ERROR because the DECLARED type of g1 is Student
		System.out.println(g2.getThesisTopic());
		
		//Student s4 = new Student("Sally", "Studier", 1234);
	
		Course c = new Course("Intro to Java", 5);
		c.enrollStudent(theStudents[0]);
		c.enrollStudent(theStudents[1]);
		c.enrollStudent(theStudents[2]);
		c.enrollStudent(g1);
		c.enrollStudent(g2);
		
		c.printRoster();
		
		

	}

}
