import java.util.Scanner;
public class LargestPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int [] triangles = new int [size];

        System.out.println("Enter the points of the triangle : ");
        for(int i=0;i<size;i++){
            triangles[i] = sc.nextInt();
        }

        System.out.println(largestPerimeter(triangles));

        sc.close();

    }

    public static int largestPerimeter(int [] nums){
        int max = 0; // initializing a variable max to make a condition of statement that sum of 2 sides is larger than the third.
        int perimeter =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(i!=max){
                // System.out.println("i : "+i);
                // System.out.println("max : "+max);
                perimeter = perimeter + nums[i];
                // System.out.println("Perimeter : "+perimeter);
                if((count == 2) && nums.length==4){
                    return perimeter*2;
                }
                count++;
            }
            // else{
                
            // }
        }

        
        
        if(perimeter > nums[max]){
            return (perimeter + nums[max]);
        }

        else{
            return 0;
        }
    }
}
