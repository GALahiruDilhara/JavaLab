public class Q5a{
    public static void main(String[] args) {
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You Passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invaild grade");
        }
        System.out.println("Your grade is "+grade);
    }
    // if removet the 6th line break statment. when the grade  equal to A both "Excellent" and "You passed" will be executed.
}