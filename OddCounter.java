import java.util.*;

public class OddCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the low = ");
        int low = sc.nextInt();

        System.out.println("Enter the high =");
        int high =sc.nextInt();

        sc.close();

        System.out.print(countOdds(low,high));

    }

    public static int countOdds(int low, int high){
        // int []odd_array = new int[high-low+1];
        // int array_itr =0;
        int odd_count =0;
        // for(int itr = low; itr<=high; itr++){
        //     if(itr==0){
        //         continue;
        //     }
        //     else if(itr==1){ // expecting 1 to be a odd number.
        //         // odd_array[array_itr] = 1;
        //         // array_itr++;
        //         odd_count++;
        //     }
        //     else if(itr%2!=0){ // Checking logic for odd array.
        //         // odd_array[array_itr] = itr;
        //         // array_itr++;
        //         odd_count++; // Counting
        //     }
        // }
        
        odd_count = (high-low)/2;

        if(high%2!=0 || low%2!=0){
            odd_count++;
        }



        return odd_count;
        
    }

    
}
