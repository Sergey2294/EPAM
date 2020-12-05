import java.util.Arrays;

public class Part6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        int counter = 0;
        int start = 2;
        boolean isPrime;
        while (counter < n) {
            int i = 0;
            isPrime = true;
            while (isPrime && i < counter) {
                if (start % arr[i] == 0) {
                    isPrime = false;
                }
                i++;
            }
            if (isPrime) {
                arr[counter] = start;
                counter++;
            }
            start++;
        }
        for (int l : arr) {
            s.append(l).append(" ");
        }
        System.out.print(String.valueOf(s).trim());
    }
}


