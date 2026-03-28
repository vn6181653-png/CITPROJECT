public class Prime {
    public static void main(String[] args) {
        int fcount=0;
        int n=5;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fcount++;
            }
        }
        if(fcount==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime ");
        }
    }
    
}
