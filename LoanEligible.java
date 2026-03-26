import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        float salary;
        System.out.println("Enter Age: " ) ;
        age= sc.nextInt();
            System.out.println("Enter Salary: " ) ;
         salary = sc.nextInt();
        if(age>=20 && salary>=21000)
             
            System.out.println("Eligible to take loan" );
        else
            System.out.println("Not eligible");
        sc.close();
    }
    
}
