import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest
{

    public static int kthDataValue(ArrayList tally, int k)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < tally.size(); i++)
        {
            int currCount = (int)tally.get(i);
            for (int f = 0; f < currCount; f++)
            {
                answer.add(i);
            }
        }

        return answer.get(k-1);
    }


    public static void main(String[] args)
    {
        // 0 0 10 5 10 0 7 1 0 6 0 10 3 0 0 1
        ArrayList<Integer> tally = new ArrayList<Integer>(
            Arrays.asList(0, 0, 10, 5, 10, 0, 7, 1, 0, 6, 0, 10, 3, 0, 0, 1));
        System.out.println(kthDataValue(tally, 16));
    }
}
