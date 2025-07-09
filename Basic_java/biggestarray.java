public class biggestarray {
        public static void main(String[] args) {
            if (args.length != 9) {
                System.out.println("Input: ");
                return;
            }

            int[][] arr = new int[3][3];
            int index = 0;
            int max = -2147483648;

            System.out.println("The given array is :");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char[] ch = args[index].toCharArray();
                    int num = 0;
                    int sign = 1;
                    int k = 0;

                    if (ch[0] == '-') {
                        sign = -1;
                        k = 1;
                    }

                    while (k < ch.length) {
                        num = num * 10 + (ch[k] - '0');
                        k++;
                    }

                    num = num * sign;

                    arr[i][j] = num;

                    System.out.print(arr[i][j] + " ");

                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }

                    index++;
                }
                System.out.println();
            }

            System.out.println("The biggest number in the given array is " + max);
        }

}
