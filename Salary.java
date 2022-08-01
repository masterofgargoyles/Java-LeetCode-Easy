import java.util.*;
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of salaries to be imported :");
        int nofsalary = sc.nextInt();

        System.out.println("Enter the salaries : ");
        double []salary = new double[nofsalary];
        for(int i=0;i<nofsalary;i++){
            salary[i] = sc.nextDouble();
        }

        sc.close();

        System.out.format("%4f",average(salary));
    }

    public static double average (double [] salary){
        int max = 0;
        int min = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<salary[min]){
                min = i;
            }
            else if (salary[max]<salary[i]){
                max = i;
            }
        }
        double addition=0;
        double countofsalary = 0;
        
        for(int i=0;i<salary.length;i++){
            // System.out.println("max :"+max+" min :"+min);
            if(i==min || i==max){ // skipping the max and min indexes.
                continue;
            }
            else{
                addition = addition+salary[i];
                // System.out.println("adding "+salary[i]);
                // System.out.println("final sum is "+addition);
                countofsalary++;
                // System.out.println("counter is "+countofsalary);
            }
        }
        return (addition/countofsalary);
    }
}
