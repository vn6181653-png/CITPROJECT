public class Car {
    int speed =0;
    void accelerate(){
        speed=speed+5;
        System.out.println("Accelerating speed is " +speed);
    }
    public static void main(String[] args) {
        Car c1 =new Car();
        Car c2 =new Car();
        c1.accelerate();
        c2.accelerate();
        c2.accelerate();
}
}