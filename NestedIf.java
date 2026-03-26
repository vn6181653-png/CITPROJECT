public class NestedIf {
    public static void main(String[] args) {
        int age=65;
        if(age>=18){
        if(age>=65){
            System.out.println("Eligible to vote and avail government fund");
        } else
        System.out.println("we are not eligible to vote and avail government");
        }else
            System.out.println("We are not eligible to vote");
    }
}
