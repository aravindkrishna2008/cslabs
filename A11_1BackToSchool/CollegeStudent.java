/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class CollegeStudent
    extends Student
{
    private String myMajor = "";
    private int    myYear  = 0;

    /**
     * @param name
     *            name of student
     * @param age
     *            age of student
     * @param gender
     *            gender of student
     * @param idNumber
     *            id number of student
     * @param gpa
     *            gpa of student
     * @param year
     *            year of student
     * @param major
     *            major of student
     */
    public CollegeStudent(
        String name,
        int age,
        String gender,
        String idNumber,
        double gpa,
        int year,
        String major)
    {
        super(name, age, gender, idNumber, gpa);
        myMajor = major;
        myYear = year;

    }


    // setter and getter for major and year
    /**
     * @return String
     */
    public String getMajor()
    {
        return myMajor;
    }


    /**
     * @return int
     */
    public int getYear()
    {
        return myYear;
    }


    /**
     * @param major
     *            major of student
     */
    public void setMajor(String major)
    {
        myMajor = major;
    }


    /**
     * @param year
     *            year of student
     */
    public void setYear(int year)
    {
        myYear = year;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
