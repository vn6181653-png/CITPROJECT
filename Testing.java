public class Testing {
    public static void main(String []a) {
        Testing t =new Testing();
        t.adder(3,4,5,6,7,8);
        t.adder(3,4,5);
    }
    void adder(int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
