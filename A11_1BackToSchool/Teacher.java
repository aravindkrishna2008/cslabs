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
public class Teacher
    extends Person
{
    private String mySubject = "";
    private double mySalary  = 0.0;

    /**
     * @param name
     *            name of teacher
     * @param age
     *            age of teacher
     * @param gender
     *            gender of teacher
     * @param subject
     *            subject of teacher
     * @param salary
     *            salary of teacher
     */
    public Teacher(
        String name,
        int age,
        String gender,

        String subject,
        double salary)
    {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }


    /**
     * @param subject
     *            the subject to set
     */
    public void setSubject(String subject)
    {
        this.mySubject = subject;
    }


    /**
     * @return mySubject
     */
    public String getSubject()
    {
        return mySubject;
    }


    /**
     * @param salary
     *            the salary to set
     */
    public void setSalary(double salary)
    {
        this.mySalary = salary;
    }


    /**
     * @return mySalary
     */
    public double getSalary()
    {
        return mySalary;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject + 
            ", salary: " + mySalary;
    }
}
