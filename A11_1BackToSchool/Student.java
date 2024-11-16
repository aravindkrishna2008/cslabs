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
public class Student
    extends Person
{
    private String myIdNum; // Student Id Number
    private double myGPA;   // grade point average

    /**
     * @param name
     * @param age
     * @param gender
     * @param idNum
     * @param gpa
     */
    public Student(String name, int age, String gender, String idNum, double gpa)
    {
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }


    /**
     * @return
     */
    public String getIdNum()
    {
        return myIdNum;
    }


    /**
     * @return
     */
    public double getGPA()
    {
        return myGPA;
    }


    /**
     * @param idNum
     */
    public void setIdNum(String idNum)
    {
        myIdNum = idNum;
    }


    /**
     * @param gpa
     */
    public void setGPA(double gpa)
    {
        myGPA = gpa;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}
