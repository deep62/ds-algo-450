package algoexpert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        int[][] input =
                new int[][] {
                        {1, 2, 3},
                        {12, 13, 4},
                        {11, 14, 5},
                        {10, 15, 6},
                        {9, 8, 7}
                        /*,
                        {10, 9, 8, 7},*/
                };
        System.out.println(spiralTraverse(input));
    }
        public static List<Integer> spiralTraverse(int[][] array) {
            if(array.length ==0) return new ArrayList<Integer>();
            System.out.println(Arrays.toString(array));

            int Sr = 0;
            int Er = array.length-1;
            int Sc = 0;
            int Ec = array[1].length-1;
            ArrayList<Integer> result = new ArrayList<Integer>();

            while( Sr <= Er && Sc <= Ec){
                for(int col = Sc; col <=Ec ;col++){
                    result.add(array[Sr][col]);
                }
                for(int row = Sr+1 ; row <=Er; row++){
                    result.add(array[row][Ec]);
                }
                for(int col = Ec-1; col >= Sc ; col--){
                    if(Sr == Er) break;
                    result.add(array[Er][col]);
                }
                for(int row = Er-1; row > Sr ; row--){
                    if(Sc == Ec) break;
                    result.add(array[row][Sc]);
                }
                Sc = Sc+1;
                Ec = Ec-1;
                Sr = Sr+1;
                Er = Er-1;

            }
            return result;
        }

    }

