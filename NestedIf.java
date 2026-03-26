import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the age "); 
       int age =sc.nextInt();
        if(age>=18){
        if(age>=65){
            System.out.println("Eligible to vote and avail government fund");//65git 
        } else
        System.out.println("we are eligible to vote and not eligible to avail government");//18
        }else
            System.out.println("We are not eligible to vote");
    }
}
