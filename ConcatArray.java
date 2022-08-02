import java.util.*;
public class ConcatArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array :");
        int array_length = sc.nextInt();

        int [] array = new int [array_length];

        System.out.println("Enter the elments of the array : ");
        for(int  i =0;i<array_length;i++){
            array[i] = sc.nextInt();
        }

        sc.close();
        // System.out.println(get(array));
        get(array);
    }

    public static int[] get(int [] nums){
        int i = 0;
        int counter = 1;
        int k =0;
        int []nums_copy = new int [nums.length+nums.length]; // making a duplicate array with same elements to have a double length size.
        while(counter < 3){     //i
            counter ++;
            for(i=0;i<nums.length;i++){
                nums_copy[k] = nums[i];
                k++;
            }

            i=0;
        }
        // for(int j=0;j<nums_copy.length;j++){
        //     System.out.println(nums_copy[j]);
        // }
        return nums_copy;
        
    }
}
