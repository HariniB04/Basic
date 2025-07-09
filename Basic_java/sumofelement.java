public class sumofelement{
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 6) {
                i++;
                while (i < arr.length && arr[i] != 7) {
                    i++;
                }
                i++;
            } else {
                sum += arr[i];
                i++;
            }
        }
        System.out.println("Sum = " + sum);
    }
}