import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements
{
    public static void main (String[] args)
    {
        int [] arr = {4,2,3,5,1,2,4};
        printRepeatingElements(arr);
    }

    private static void printRepeatingElements(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();



        for(int i = 0; i<arr.length; i++)
        {
            Integer mapValue = map.get(arr[i]);

            if(mapValue==null)
            {
                map.put(arr[i], 1);
            }

            else
            {
                map.put(arr[i], mapValue+1);
            }
        }

        System.out.println(map);

        //Now we need to retrieve only keys which are greater than value = 1

        for(Map.Entry<Integer, Integer> mapEntry : map.entrySet())
        {
            if(mapEntry.getValue()>1)
            {
                System.out.println("Key: "+mapEntry.getKey()+" Value:"+mapEntry.getValue());
            }
        }
    }

}
