import java.util.Scanner;

public class initialize {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        double average=(double) sum / arr.length;
        System.out.println("sum:" +sum);
        System.out.println("Average: "+average);

    }
}
