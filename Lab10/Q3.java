import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Q3 {

    public static void main(String[] args) {
        File ob = new File("hello.txt");

        try{
            Scanner scanner = new Scanner(ob);
            System.out.println(scanner.nextLine());
        }
        catch(FileNotFoundException e){
            System.out.println("The file not found");
        }
    }
    
}
