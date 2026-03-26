import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units: ");
        int units;
        double bill;
        System.out.println("ENter the units from user");
        units = sc.nextInt();
        if (units <= 150)
            bill = units * 1.5;
        else
            bill = units * 3;
        System.out.println("Final electric bill=" + bill);
        sc.close();

    }

}
