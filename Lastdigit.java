import java.util.Scanner;
public class Lastdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        
        int lastdigit =num%18591
    ;
        System.out.println("Last digit is:" + lastdigit);
    }    
}
