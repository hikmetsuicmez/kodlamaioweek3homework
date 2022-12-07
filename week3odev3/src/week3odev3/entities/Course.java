package week3odev3.entities;

public class Course {

	// constructor
	public Course(String courseName, String category, String instructor, double coursePrice) {
		super();
		this.courseName = courseName;
		this.category = category;
		this.instructor = instructor;
		this.coursePrice = coursePrice;
	}

	// field
	private String courseName;
	private String category;
	private String instructor;
	private double coursePrice;

	// getter - setter
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}
