public class Mediator {
    private PedestrianCrossingLight pedestrianCrossingLight;
    private TrafficLight trafficLight;

    public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight) {
        this.pedestrianCrossingLight = pedestrianCrossingLight;
        this.trafficLight = trafficLight;
    }

    public void changeToRed(){
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeToGreen(){
        trafficLight.changeToGreen();
        pedestrianCrossingLight.changeToRed();
    }
}
