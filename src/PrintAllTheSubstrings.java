public class PrintAllTheSubstrings
{
    public static void main (String [] args)

    {
        String str = "abc";
        printSubstrings(str);
    }

    private static void printSubstrings(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            for (int j=i+1; j<=str.length(); j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
