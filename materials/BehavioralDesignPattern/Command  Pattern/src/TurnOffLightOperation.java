public class TurnOffLightOperation implements LightOperation{

    private final Light light;

    public TurnOffLightOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        light.turnOffLight();
    }
}
