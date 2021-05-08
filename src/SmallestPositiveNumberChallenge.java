public class SmallestPositiveNumberChallenge {

    public static void main(String[] args) {
        int [] array = {-1,-3};
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
