
public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        light.turnOnLight();
        light.isOn();
        light.turnOffLight();
        light.isOn();
        System.out.println("After implementing the Command pattern");
        LightOperationExecutor lightOperationExecutor = new LightOperationExecutor();
        lightOperationExecutor.queueOperation(new IsOnOperation(light));
        lightOperationExecutor.queueOperation(new TurnOnLightOperation(light));
        lightOperationExecutor.queueOperation(new IsOnOperation(light));
        lightOperationExecutor.queueOperation(new TurnOffLightOperation(light));
        lightOperationExecutor.queueOperation(new IsOnOperation(light));

        lightOperationExecutor.doOperations();
    }

}
