import java.util.*;
public class Sequence{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the length of the array");
        int array_length = sc.nextInt();

        System.out.println("Enter the value for K: ");
        int K = sc.nextInt();
        
        int [] array =  new int[array_length];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<array_length;i++){
            array[i] = sc.nextInt();
        }

        //logic starts here
        int sequence_count =0; //variable to count the number of sequence
        for(int itr_1 = 0; itr_1<array_length-2;itr_1++){
            for(int itr_2 = itr_1+1; itr_2<array_length-1;itr_2++){
                for(int itr_3 =itr_2+1; itr_3<array_length;itr_3++){ //nested loop to traverse the array with 3 different sequence points.

                    // Condition 1: No need to check condition 1 as it a nested loop, outer iterator cannot be smaller than the inner iterator.

                    //Condition 2: A[y] = K*A[x]
                    if(array[itr_2] == (K*(array[itr_1]))){
                        // if the conditon is true then only we agree to go forward to the 3rd conditon.
                        //Conditon 3: A[z] = A[y]/K
                        int store_div = K/(array[itr_2]);
                        if(array[itr_3] == store_div)
                        {
                            sequence_count++;
                        }
                    }

                }
            }
        }

        System.out.print(sequence_count);
        sc.close();
    }
}