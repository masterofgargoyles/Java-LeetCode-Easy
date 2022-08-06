import java.util.*;
public class HappyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        sc.close();

        System.out.println(isHappy(n));
        
    }

    public static boolean isHappy(int n){
        // if(n>1){
        //     int remainder = 0;
            
        //     int flag = 1;
        //     while(flag == 1){
        //         int sumofproduct = 0;
        //         while(n>0){ // when the number becomes 0 we end the loop.
        //             remainder = n%10;
        //             sumofproduct = sumofproduct + (remainder*remainder); // taking out the product of the reaminder and adding it.
        //             System.out.println(sumofproduct);
        //             n = n/10;
        //         }
        //         if(sumofproduct > 9){ // if the sumofproduct is greater than 9 than store in the n and run loop again.
        //             n = sumofproduct;
        //         }
        //         else if (sumofproduct == 1){
        //             return true;
        //         }
        //         else if(sumofproduct<9 && sumofproduct >1){
        //             n = sumofproduct;
        //         }
        //         else{ // if sumofproduct is greater than 9 and not equal to 1 then flag = 0  and end the loop.
        //             flag = 0;
        //         }
                
                
        //     }
        // }
        // else if(n==1){
        //     return true;
        // }
        // else{
            
        //     return false;
            
        // }
        // // System.out.println("Returning Here");
        // return false;

        HashSet<Integer> seen= new HashSet<> ();
        while(n!=1){
            int copy = n ;
            int sum = 0;
            while(copy>0){
                int remainder = copy%10;
                sum = sum + (remainder * remainder);
                copy = copy/10;
            }

            if(seen.contains(sum)){
                return false;
            }

            seen.add(sum);
            n = sum;
        }
        return true;
    }
}
