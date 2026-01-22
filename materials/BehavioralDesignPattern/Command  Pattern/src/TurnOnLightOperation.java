public class TurnOnLightOperation implements  LightOperation{

    private final Light light;

     public TurnOnLightOperation(Light light){
         this.light = light;
     }

     @Override
    public void execute(){
         light.turnOnLight();
     }


}
