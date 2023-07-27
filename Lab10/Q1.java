import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter number1 : ");
            int number1 = scanner.nextInt();

            System.out.print("Enter number2 : ");
            int number2 = scanner.nextInt();

            System.out.println("The Answer is : "+(number1/number2));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by zero");
        }
        catch(Exception e){
            System.out.println("Enter valid number");
        }
        

    }
    
}
