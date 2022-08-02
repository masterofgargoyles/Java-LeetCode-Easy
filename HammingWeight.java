import java.util.*;
// import java.io.*;
public class HammingWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to be checked : ");
        int n =sc.nextInt();

        sc.close();

        System.out.println(hammingweight(n));
    }

    public static int hammingweight(int n){
        // String s = String.valueOf(n);
        int weight = 0;

        // // for(int i =0;i<s.length();i++){
        // //     if(s.charAt(i) == '1'){
        // //         weight++;
        // //     }
        // // }
        
        // while(n>0){
        //     // int remainder = n%10; // individually checking the digits.
        //     // if(remainder>0){
        //     //     weight++;
        //     // }
            
        //     weight = weight + n&1;
        //     n = n >> 1;
        // }

        for (int i = 0; i < 32; ++i) {
            if (((n >>> i) & 1) == 1) {
                ++weight;
            }
        }

        return weight;
    }
}
