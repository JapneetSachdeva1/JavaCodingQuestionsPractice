import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateWordsFromSentence
{
    public static void main (String [] args)
    {
        String str = "Hello I am Japneet Japneet am";
        printSentenceWithoutDuplicates(str);
    }

    private static void printSentenceWithoutDuplicates(String str)
    {
        String [] strSplit = str.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        int counter = 1;

        for(int i=0; i<strSplit.length; i++)
        {
            if(map.containsKey(strSplit[i]))
            {
                map.put(strSplit[i], map.get(strSplit[i])+1);
            }
            else
            {
                map.put(strSplit[i], counter);
            }
        }

        for(Map.Entry<String,Integer> entryMap: map.entrySet())
        {
            if(entryMap.getValue()>1)
            {
                System.out.print(entryMap.getKey()+" ");
            }
        }
    }
}
