
public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private int course1;
	private int course2;
	private int course3;
	private String course1Name;
	private String course2Name;
	private String course3Name;
	private String course1Letter;
	private String course2Letter;
	private String course3Letter;
	
	public Student (String f, String l, double g, int c1, int c2, int c3, String c1N, String c2N, String c3N, String c1L, String c2L, String c3L)
	{
		firstName = f;
		lastName = l;
		gpa = g;
		course1 = c1;
		course2 = c2;
		course3 = c3;
		course1Name = c1N;
		course2Name = c2N;
		course3Name = c3N;
		course1Letter = c1L;
		course2Letter = c2L;
		course3Letter = c3L;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getGpa()
	{
		return gpa;
	}
	public int getCourse1()
	{
		return course1;
	}
	public int getCourse2()
	{
		return course2;
	}
	public int getCourse3()
	{
		return course3;
	}
	public String getCourse1Name()
	{
		return course1Name;
	}
	public String getCourse2Name()
	{
		return course2Name;
	}
	public String getCourse3Name()
	{
		return course3Name;
	}
	public String getCourse1Letter()
	{
		return course1Letter;
	}
	public String getCourse2Letter()
	{
		return course2Letter;
	}
	public String getCourse3Letter()
	{
		return course3Letter;
	}

	
// TESTING FOR HOMEWORK 

	
}
