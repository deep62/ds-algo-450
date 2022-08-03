package utkarsh;

public class PatternPrinting {
    public static void main(String[] args) {

        print_pattern(5);
        //print_pattern2(5);

    }
    /*
    *
    *
    * 12345
      1234
      123
      12
1*/
    public static void print_pattern(int n){
        if(n==0){
            return;
        }
        for(int i=1 ; i <= n ; i++){
            System.out.print(i);
        }
        System.out.println();

        print_pattern(n-1);

    }

    public static void print_pattern2(int n){
        if(n==0){
            return;
        }

        print_pattern2(n-1);

        for(int i=1; i <=n ; i++){
            System.out.print(i);
        }
        System.out.println();
    }
}
