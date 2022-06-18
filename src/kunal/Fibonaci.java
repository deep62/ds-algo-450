package kunal;

public class Fibonaci{

    public static void main(String[] args) {
        int output = fibo(5);
        System.out.print("output "+output);
    }
    static int fibo(int n){
       if(n<2){
           return n;
       }
       return fibo(n-1)+fibo(n-2);
    }
}
