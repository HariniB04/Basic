public class odd {
    public static void main(String[] args) {
            System.out.println("Prime numbers between 10 and 99:");

            for (int num = 10; num <= 99; num++) {
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.print(num + " ");
                }
            }


    }
}
