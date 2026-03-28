import java.util.Scanner;
public class ACar {
    String brand;
    String model; 
    int speed =0;
    void accelerate(){
        speed=speed+5;
        System.out.println(" Accelerating speed is " +speed);
    }
    void breake(){
        speed=speed-5;
        System.out.println( brand + " Slowing down " +speed);
    }
     ACar(){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the car brand");
        brand=sc.nextLine();
        System.out.println("ENter the car model");
        model=sc.nextLine();
        System.out.println(brand +" " +model +"is a created model");
    }
    public static void main(String []a) {
        ACar c1 =new ACar();
        // c1.brand= "bmw";
       // ACar c2 =new ACar();
     //   c2.brand="prosche";
    //     System.out.println(c1.brand);
    //          System.out.println(c2.brand);
        
    //     c1.accelerate();
    //     c2.accelerate();
    //    c1.breake();
    //    c2.breake();
       //c1.setter();
}
}