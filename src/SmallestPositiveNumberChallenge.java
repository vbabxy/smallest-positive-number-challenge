
import java.util.Scanner;

public class SmallestPositiveNumberChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements you want initialize in the array");
        int number = scan.nextInt();

        int[] array = new int[number];

        System.out.println("\n\n***Initializing Array***");
        System.out.println("Enter "+ array.length +" integer values");

        for(int i=0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("***Initialization completed***\n");

        int smallestPositiveNumber = smallestPositiveNumber(array);
        System.out.println(smallestPositiveNumber);
    }

    private static int smallestPositiveNumber(int[] array) {
        int n = array.length;
        int [] counter = new int[n+1];
        for(int i : array)
            if(i > 0 && i <= n)
                counter[i]++;
       for (int i = 1; i < n + 1; i++)
           if(counter[i] == 0)
               return i;

       return n+1;
    }
}
