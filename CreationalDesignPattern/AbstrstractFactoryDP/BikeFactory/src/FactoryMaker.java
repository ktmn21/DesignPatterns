import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<BikeFactory>> factoryMap = new HashMap<>();

    static{
        factoryMap.put("road", RoudBikeFactory::new);
        factoryMap.put("mountain", MountainBikeFactory::new);
    }

    public static BikeFactory makeFactory(String factName){
        factName = factName.toLowerCase();
        if(factoryMap.get(factName) != null){
            return factoryMap.get(factName).get();
        }else{
            throw new IllegalArgumentException("there is no such type of bike! " + factName);
        }
    }

}
