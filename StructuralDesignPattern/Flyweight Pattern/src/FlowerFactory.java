import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<String, Flower> factoryMap = new HashMap();

    public static Flower createFlower(String name){
//        if(factoryMap.containsKey(name)){
//            return factoryMap.get(name);
//        }else{
//            Flower flower = new Flower(name);
//            factoryMap.put(name, flower);
//            return flower;
//
//        }

        return factoryMap.computeIfAbsent(name, Flower::new);
    }



}
