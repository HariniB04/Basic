
import java.util.Scanner;
public class positive {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0){
        System.out.println("Positive Number");
    }
    else if(num<0){
        System.out.println("Negative Number");
    }
    else if(num==0){
        System.out.println("Zero");
    }
    else{
        System.out.println("Invalid Number");
    }
}
}
