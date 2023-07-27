public class GreenLightThread extends Thread{

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10000);
                System.out.println("Green Light");
            } catch (InterruptedException e) {
                System.out.println("The thread is not working correctly");
            }
        }
    }
}