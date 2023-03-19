import java.util.Arrays;

public class MoveNegativeNumbersToStart
{
    public static void main (String [] args)
    {
        int [] arr = {-1,2,3,-4,-7,8};
        moveNegativeNumbersTOStart(arr);
    }

    private static void moveNegativeNumbersTOStart(int [] arr) {
        int[] tempArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                //System.out.print(arr[i]);
                tempArr[counter] = arr[i];
                counter++;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
            {
                tempArr[counter] = arr[i];
                counter++;
            }
        }

        System.out.print(Arrays.toString(tempArr));
    }
}
