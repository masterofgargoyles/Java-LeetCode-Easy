import java.util.*;
import java.lang.Math;
public class ManhattanDistance {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of points : ");
        int number_of_points = sc.nextInt();

        int[][] points = new int [number_of_points][2];

        System.out.println("Enter the points : ");
        for(int i=0;i<number_of_points;i++){
            for(int j=0;j<2;j++){
                points[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the x coordinate to find the Manhattan Distance : ");
        int x_coordinate = sc.nextInt();

        System.out.println("Enter the y coordinate to find the Manhattan Distance : ");
        int y_coordinate =sc.nextInt();

        System.out.println(nearestValidPoint(x_coordinate, y_coordinate, points));

        sc.close();
    }

    public static int nearestValidPoint(int x, int y , int[][]points){
        int min = 999999999;
        int distance = 0;
        int min_ind = 0;
        boolean problem = false;

        for(int i=0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
                problem = true; // problem will be true whenever there is an element which has x or y coordinate equal to the user input.
                // System.out.println("Boolean True");
                distance = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]); // calculating the manhattan distance.
    
                if(distance<min){
                    min = distance;
                    min_ind = i; // recording the index.
                }
            }
        }


        if(problem){
            return min_ind;
        }

        else{
            return -1;
        }
        
    }
}
