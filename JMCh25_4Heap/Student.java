/**
   Student.java

   Stores the following information about students
      grade
      name (first and last)
      Lynbrook id

 */
public class Student implements Comparable
{
    private String lynbrookId;
    private String firstName;
    private String lastName;
    private int grade;

    public Student( String id, String fName, String lName, int g )
    {
        lynbrookId = id;
        firstName = fName;
        lastName = lName;
        grade = g;
    }

    public Student()
    {
        this( "", "", "", 0 );
    }

    /**
     * TODO Write your method description here.
     * 
     * @param obj
     * @return
     */
    public int compareTo( Object obj )
    {
        if (obj == null)
        {
            return 1;
        }
        Student a = (Student)obj;
        if (grade > a.getGrade())
        {
            return 1;
        }
        else if (grade < a.getGrade())
        {
            return -1;
        }
        else
        {
            return lynbrookId.compareTo(a.getLynbrookId());
        }
    }

    public Object clone()
    {
        return new Student( lynbrookId, firstName, lastName, grade );
    }

    public String toString()
    {
        return lynbrookId + " " + firstName + " " + lastName + " " + grade;
    }

    public String getLynbrookId()
    {
        return lynbrookId;
    }

    public void setLynbrookId(String lynbrookId)
    {
        this.lynbrookId = lynbrookId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
}
