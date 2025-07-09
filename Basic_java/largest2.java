import java.util.Arrays;
public class largest2 {
        public static void main(String[] args) {

            int[] arr = {25, 3, 89, 47, 15, 63, 1};
            Arrays.sort(arr);

            System.out.println("Smallest two numbers: " + arr[0] + " and " + arr[1]);

            int n = arr.length;
            System.out.println("Largest two numbers: " + arr[n - 2] + " and " + arr[n - 1]);
        }
    }


