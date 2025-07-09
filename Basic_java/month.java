import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Output:January");
                break;
            case 2:
                System.out.println(" Output: Febuary");
                break;
            case 3:
                System.out.println("Output:March");
                break;
            case 4:
                System.out.println("Output: April");
                break;
            case 5:
                System.out.println("Output: May");
                break;
            case 6:
                System.out.println("Output: June");
                break;
            case 7:
                System.out.println("Output: July");
                break;
            case 8:
                System.out.println("Output: August");
                break;
            case 9:
                System.out.println("Output: September");
                break;
            case 10:
                System.out.println("Output: October");
                break;
            case 11:
                System.out.println("Output: November");
                break;
            case 12:
                System.out.println("Output: December");
                break;
            default:
                System.out.println("Output: Invalid");
                break;
        }
    }
}

