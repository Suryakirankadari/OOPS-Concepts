package assignments;

public class Result {

	    public static String resultCalculator(Student student) {
	    int totalMarks = student.getMarks1() + student.getMarks2() + student.getMarks3();
	    double percentage = totalMarks / 3.0;

	    if(student.getMarks1() < 40 || student.getMarks2() < 40 || student.getMarks3() < 40) {
	      return "Fail";
	}

	    if(percentage >= 70) {
	      return "A";
	    } else if(percentage >= 55) {
	      return "B";
	    } else {
	      return "C";
	}
	}
	}



