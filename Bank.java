public class Bank {
   float balance=1000;
        void   deposite (int amount)
    {
        balance = balance + amount;
        System.out.println( amount +" is deposited ");
        System.out.println(" Total balance " +balance);
    }    
     public static void main(String[] args) {  
        Bank b= new Bank();
        b.deposite(200); 
}
    
}
