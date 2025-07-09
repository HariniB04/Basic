import java.util.Scanner;
public class age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter gender(Male/Female");
       String gender =sc.next();
       System.out.println("Enter the age");
       int age=sc.nextInt();
       boolean a=false;
       if(gender.equalsIgnoreCase("Female")){
           if(age>=1 && age<=58){
               System.out.println("Interest:8.2%");
           }
           else if(age>=59 && age<=100){
               System.out.println("Interest:9.2%");
           }
           else{
               System.out.println("Invalid age input");
           }
       }
        else if(gender.equalsIgnoreCase("Male")){
            if(age>=1 && age<=58){
                a=true;
                System.out.println("Interest:8.4%");

            }
            else if(age>=59 && age<=100){
                System.out.println("Interest:10.5%");

            }
            else if(a==false){
                System.out.println("Invalid age input");
            }

       }
       else  {
           System.out.println("Invalid gender input");
       }
    }
}