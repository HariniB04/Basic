import java.util.Scanner;

public class uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        char ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println("Output: "+Character.toUpperCase(ch));
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("Output: "+Character.toLowerCase(ch));
        }
        else{
            System.out.println("Output: Invalid Input.Please enter an alphabet");
        }
    }
}
