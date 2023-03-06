package assignments;

public class Student {
	 private static int nextID;
	    private int id;
	    private String name;
	    private int marks1;
	    private int marks2;
	    private int marks3;

	    public Student() {
	    nextID++;
	    id = nextID;
	    name = "";
	    marks1 = 0;
	    marks2 = 0;
	    marks3 = 0;
	    }

	    public Student(int id, String name, int marks1, int marks2, int marks3) {
	    this.id = id;
	    this.name = name;
	    this.marks1 = marks1;
	    this.marks2 = marks2;
	    this.marks3 = marks3;
	    }

	    public void setId(int id) {
	    this.id = id;
	    }

	    public int getId() {
	    return id;
	    }

	    public void setName(String name) {
	    this.name = name;
	    }

	    public String getName() {
	    return name;
	    }

	    public void setMarks1(int marks1) {
	    this.marks1 = marks1;
	    }

	    public int getMarks1() {
	    return marks1;
	    }

	    public void setMarks2(int marks2) {
	    this.marks2 = marks2;
	    }

	    public int getMarks2() {
	    return marks2;
	    }

	    public void setMarks3(int marks3) {
	    this.marks3 = marks3;
	    }

	    public int getMarks3() {
	    return marks3;
	    }

	    public String toString() {
	    return "ID: " + id + ", Name: " + name + ", Marks1: " + marks1 + ", Marks2: " + marks2 + ", Marks3: " + marks3;
	    }
	}



