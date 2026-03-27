import java.util.Scanner;

public class Firstdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        while(num>=10){
            num=num/10;
        }
        System.out.println("First digit is" +num);
    }
    
}
