public class ReverseEachWord
{
    public static void main (String [] args)
    {
        String str = "Hello World";
        printEachWordReverse(str);

    }

    private static void printEachWordReverse(String str)
    {
        //TODO: Also we can use Stacks for this programming question

        String [] arr = str.split(" ");
        String reverse = "";
        String reverseString = "";

        for(int i=0; i<arr.length; i++)
        {
            int lengthOfEachWord = arr[i].length();

            for (int j=lengthOfEachWord-1; j>=0; j--)
            {
                reverse = String.valueOf(arr[i].charAt(j));
                System.out.print(reverse);
                reverseString += reverse;
            }

            System.out.print(" ");
        }

    }
}
