public class ProperSequenceOrder extends Thread {

    @Override
    public void run(){
        while(true){
            try{
            System.out.println("Red Light");
            Thread.sleep(5000);
            System.out.println("Yellow Light");
            Thread.sleep(2000);
            System.out.println("Green Light");
            Thread.sleep(10000);
            System.out.println("Yellow Light");
            Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println("The Sleep method not working correctly");
            }
        }
    }
    
}
