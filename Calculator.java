public class Calculator {
    String brand;
    String model;
    int a=40;
    int b=20;
    void add (){
        System.out.println("addition=" +(a+b));
    }
    void Sub(){
        System.out.println("Substraction=" +(a-b));
    }
    void mul(){
        System.out.println("Multiplicatiuon=" +(a*b));
    }
    void div(){
        System.out.println("Division =" +(a/b) );


    }
    public static  void main(String []a){
        Calculator c1 =new Calculator();
        c1.add();
        c1.Sub();
        c1.mul();
        c1.div();

    }
}
