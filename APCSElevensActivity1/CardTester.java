/**
 * Card.java <code>Card</code> represents a playing card.
 *
 * @author Aravuind
 * @version Sep 14
 * @author Period: 1
 * @author Assignment: APCS Elevens Lab Activity 1
 * @author Sources: N/A
 */
public class CardTester
{
    /**
     * The main method in this class checks the Card operations for consistency.
     * 
     * @param args
     *            is not used.
     */
    public static void main(String[] args)
    {
        Card aceClubs1 = new Card("ace", "clubs", 1);
        Card aceClubs2 = new Card("ace", "clubs", 1);
        Card sixHeats1 = new Card("6", "hearts", 6);

        System.out.println("**** ace of clubs #1 Tests ****");
        System.out.println("  rank: " + aceClubs1.rank());
        System.out.println("  suit: " + aceClubs1.suit());
        System.out.println("  pointValue: " + aceClubs1.pointValue());
        System.out.println("  toString: " + aceClubs1.toString());
        System.out.println();

        System.out.println("**** ace of clubs #2 Tests ****");
        System.out.println("  rank: " + aceClubs2.rank());
        System.out.println("  suit: " + aceClubs2.suit());
        System.out.println("  pointValue: " + aceClubs2.pointValue());
        System.out.println("  toString: " + aceClubs2.toString());
        System.out.println();

        System.out.println("**** six of hearts Tests ****");
        System.out.println("  rank: " + sixHeats1.rank());
        System.out.println("  suit: " + sixHeats1.suit());
        System.out.println("  pointValue: " + sixHeats1.pointValue());
        System.out.println("  toString: " + sixHeats1.toString());
        System.out.println();

        System.out.println("**** matches Tests ****");
        System.out.println("  matching: " + aceClubs1.matches(aceClubs2));
        System.out.println("  not matching: " + aceClubs1.matches(sixHeats1));
    }
}
/*
 **** ace of clubs #1 Tests **** rank: ace suit: clubs pointValue: 1 toString: ace
 * of clubs (point value = 1) ace of clubs #2 Tests **** rank: ace suit: clubs
 * pointValue: 1 toString: ace of clubs (point value = 1) six of hearts Tests
 * **** rank: 6 suit: hearts pointValue: 6 toString: 6 of hearts (point value =
 * 6) matches Tests **** matching: true not matching: false
 */
