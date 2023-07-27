public class RedLightThread extends Thread{

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(5000);
                System.out.println("Red Light");
            } catch (InterruptedException e) {
                System.out.println("The thread not working correctly");
            }
        }
    }

}