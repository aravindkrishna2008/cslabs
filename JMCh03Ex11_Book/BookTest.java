/**
 *  This is a class that tests the Book class.
 *
 *  @author  TODO your name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: TODO list collaborators
 */
public class BookTest
{
    /**
     * The main method in this class checks the Book operations for
     * consistency.
     * @param args is not used.
     */
    public static void main( String[] args )
    {
        Book ThreePageBook = new Book(3);
        System.out.println(ThreePageBook.getNumPages());
        System.out.println(ThreePageBook.getCurrentPage());
        ThreePageBook.nextPage();
        System.out.println(ThreePageBook.getCurrentPage());
        ThreePageBook.nextPage();
        System.out.println(ThreePageBook.getCurrentPage());
        ThreePageBook.nextPage();
        System.out.println(ThreePageBook.getCurrentPage());

    }
}
