
public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();

        var mediator = new Mediator(pedestrianCrossingLight ,trafficLight);

        mediator.changeTrafficToAmber();
        mediator.changeTrafficToGreen();
        mediator.changeTrafficToAmber();
        mediator.changeTrafficToRed();


    }

}
