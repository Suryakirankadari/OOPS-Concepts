package assignments;

public class StudentGrades {	

	  public static void main(String[] args) {
	    Student student1 = new Student(1,"Surya",60,70,80);
	    String result1 = Result.resultCalculator(student1);
	    System.out.println("Student 1: " + student1.toString() + ", Result: " + result1);

	    Student student2 = new Student(2,"Varun",39,70,80);
	    String result2 = Result.resultCalculator(student2);
	    System.out.println("Student 2: " + student2.toString() + ", Result: " + result2);
	  }

	}



