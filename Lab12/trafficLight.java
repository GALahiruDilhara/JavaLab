public class trafficLight {

    public static void main(String args[]){
        RedLightThread redlight = new RedLightThread();
        GreenLightThread greenLight = new GreenLightThread();
        YellowLightThread yelloLight = new YellowLightThread();

        // redlight.start();
        // greenLight.start();
        // yelloLight.start();

        ProperSequenceOrder properOrder = new ProperSequenceOrder();
        properOrder.start();

    }
    
}
