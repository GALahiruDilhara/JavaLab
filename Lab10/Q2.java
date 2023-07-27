public class Q2 {

    public static void main(String[] args) {
        
        int array[] = {1,2,4,5,7,8};


        try{
            System.out.println(array[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index was not found");
        }
        finally{
            for(int i = 0 ; i < 6 ; i++)System.out.println(array[i]);
        }
    }
    
}
