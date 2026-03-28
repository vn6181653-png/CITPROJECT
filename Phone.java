public class Phone {
    String brand="iphone";
    String model="16 pro max";
    void call(){
        System.out.println("Calling  from  " +model);
    }
    void message(){
        System.out.println("Message from iphone");
    }
public static void main(String[] args) {
    Phone p1= new Phone();
    Phone p2=new Phone();
    Phone p3=new Phone();
    Phone p4=new Phone();
    p1.call();
    p2.call();
    p3.call();
    p4.call();
    p1.message();
    p2.message();
    p3.message();
    p4.message();
}
    
}
