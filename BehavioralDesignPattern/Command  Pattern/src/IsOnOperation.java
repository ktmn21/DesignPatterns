public class IsOnOperation implements LightOperation{

    private final Light light;

    public IsOnOperation(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.isOn();
    }

}
