import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        char ch=sc.next().toUpperCase().charAt(0);
        switch (ch){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Output: Green");
                break;
            case 'Y':
                System.out.println("Output: Yellow");
                break;
            case 'O':
                System.out.println("Output: Orange");
                break;
            case 'W':
                System.out.println("Output: White");
                break;
            default:
                System.out.println("Output: Invalid code");
                break;
        }
    }
}
