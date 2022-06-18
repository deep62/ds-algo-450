/*
class ArmstrongNumber {
        static String armstrongNumber(int n){
            // code here
            // while number is greater than 10
            // mod the number to get digits
            // calculate cube of digits and store in sum var
            // divide the number by 10
            // check if number equal itself
            double sum = 0 ;
            while(n !=0){
                int remainder = n%10;
                sum = Math.pow(remainder, 3);
                n = n/10;
            }
            if(sum == n)
                return "Yes";
            else{
                return "No";
            }


        }
    }
}
*/
