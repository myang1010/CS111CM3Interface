import java.util.ArrayList;
import java.util.Collections;


/**
 * Represents a college-level course with limited enrollment.
 * 
 * @author Jessica Masters
 *
 */
public class Course {

	private String courseName;
	private int maxEnrollment;
	private ArrayList<Student> students;

	
	/**
	 * 
	 * Creates an object described by the name and the maximum enrollment.
	 * 
	 * @param courseName the name of this course
	 * @param maxEnrollment the maximum number of students that can enroll in the course
	 */
	public Course(String courseName, int maxEnrollment) {
		this.courseName = courseName;
		this.maxEnrollment = maxEnrollment;
		students = new ArrayList<Student>();
	}

	/**
	 * 
	 * Adds a student to the course (if there is room) and updates the number of students enrolled.
	 * 
	 * @param s the student to be added to this course
	 * @return true if there is room for the student and the student is successfully added and false otherwise
	 */
	public boolean enrollStudent(Student s) {
		if (students.size() < maxEnrollment) {
			return students.add(s);
		} else {
			return false;
		}
	}

	/**
	 * 
	 * Determines whether a student is enrolled in this course.
	 * 
	 * @param s the student who might be enrolled
	 * @return true if the student is enrolled and false otherwise
	 */
	public boolean isStudentEnrolled(Student s) {
		return students.contains(s);
	}

	/**
	 * Removes a student from this course and updates the number enrolled.
	 * 
	 * @param s the student to be dropped
	 * @return true if the student was enrolled and successfully droped and false otherwise
	 */
	public boolean dropStudent(Student s) {
		if (isStudentEnrolled(s)) {
			return students.remove(s);
		} else {
			return false;
		}
	}

	/**
	 * Sorts the student roster and prints the student information to the console.
	 * 
	 */
	public void printRoster() {
		Collections.sort(students);
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			System.out.println(s.toString());
		}
	}

	/**
	 * Retrieves the name of the course.
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Updates the name of the course
	 * @param courseName the new name of the course
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Retrieves the number of students enrolled in the course
	 * @return the number enrolled
	 */
	public int getNumberEnrolled() {
		return students.size();
	}


	/**
	 * Retrieves the maximum number of students that the course allows.
	 * @return the maximum enrollment
	 */
	public int getMaxEnrollment() {
		return maxEnrollment;
	}

	/**
	 * Updates the maximum number of students allowed in the course if that value is positive
	 * @param maxEnrollment the new maximum number of students allowed in the course
	 */
	public void setMaxEnrollment(int maxEnrollment) {
		if (maxEnrollment >= 1) {
			this.maxEnrollment = maxEnrollment;
		}
	}

	/**
	 * Retrieve a list of students enrolled in this class.
	 * @return an ArrayList of enrolled students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}


	/**
	 * Retrieve a text representation of this course
	 * @return the text representation, which includes the name, number of students enrolled, and the maximum enrollment
	 */
	@Override
	public String toString() {
		return courseName + " (" + students.size() + " out of " + maxEnrollment
				+ " spots filled)";
	}

}
