import java.util.Arrays;
public class sort {
        public static void main(String[] args) {
            int[] arr = {45, 12, 89, 33, 7, 21};
            Arrays.sort(arr);
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
