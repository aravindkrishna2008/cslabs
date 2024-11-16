import java.util.*;

public class ListIteratorTesting
{
    public static void main(String[] args)
    {
        Stack<String> a = new Stack<>();
        a.push("a");
        a.push("b");
        a.push("c");
        System.out.println(a);
        a.pop();
        System.out.println(a);
    }
}
