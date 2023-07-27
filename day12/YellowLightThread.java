public class YellowLightThread extends Thread{

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(2000);
                System.out.println("Yello Light");
            } catch (InterruptedException e) {
                System.out.println("Thread is not working correctly");
            }
        }
    }

}