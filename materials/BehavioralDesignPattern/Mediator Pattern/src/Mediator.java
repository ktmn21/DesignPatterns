public class Mediator {
    private PedestrianCrossingLight pedestrianCrossingLight;
    private TrafficLight trafficLight;

    public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight) {
        this.pedestrianCrossingLight = pedestrianCrossingLight;
        this.trafficLight = trafficLight;
    }

    public void changeTrafficToRed(){
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficToGreen(){
        trafficLight.changeToGreen();
        pedestrianCrossingLight.changeToRed();
    }

    public void changeTrafficToAmber(){
        trafficLight.changeToAmber();
    }
}
