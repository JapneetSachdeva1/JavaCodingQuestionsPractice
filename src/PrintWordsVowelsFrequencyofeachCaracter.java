import java.util.HashMap;
import java.util.Map;

public class PrintWordsVowelsFrequencyofeachCaracter
{
    public static void main (String [] args)
    {
        String str =    "Learn with Japneet Sachdeva";
        printAllCharacters(str);
    }

    private static void printAllCharacters(String str)
    {
        //TODO: WordCount
        String [] strArray = str.split(" ");
        int wordCount = strArray.length;
        System.out.println(wordCount);

        //TODO: Print Vowels

        int vowelCount = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i'
            || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U')
            {
                vowelCount++;
            }
        }

        System.out.println("Vowel count is: "+vowelCount);

        //Todo: Frequency of each character

        Map<Character, Integer> freqMap = new HashMap<>();

        for(int i =0; i<str.length(); i++)
        {

            if(freqMap.containsKey(str.charAt(i)))
            {
                freqMap.put(str.charAt(i), freqMap.get(str.charAt(i))+1);
            }

            else
            {
                freqMap.put(str.charAt(i),1);
            }
        }

        //TODO: printing map

        for(Map.Entry<Character, Integer> entry: freqMap.entrySet())
        {
            System.out.print(" Character: "+entry.getKey()+ " Frequency: "+entry.getValue());
        }


    }
}
