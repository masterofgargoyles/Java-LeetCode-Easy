import java.util.Scanner;

public class ProductandSum {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int n =sc.nextInt();

        System.out.println(subtractProductandSum(n));

        sc.close();
    }

    public static int subtractProductandSum(int number){
        int n_copy1 = number; //making a copy for addition.
        int n_copy2 = number; //making a copy for product.

        int addition = 0;
        int product = 1; // initializing for product so cannot multiply by 0.
        

        while(n_copy1>0){
            int remainder_addition = n_copy1%10;
            addition = addition + remainder_addition;
            n_copy1 = n_copy1/10;
        }

        while(n_copy2>0){
            int remainder_product = n_copy2%10;
            product = product * remainder_product;
            n_copy2 = n_copy2/10;
        }

        return (product - addition);

    }
}
