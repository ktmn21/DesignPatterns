import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UIFactoryMaker {

    private static final Map<String, Supplier<UIFactory>> factMap = new HashMap<>();

    static{
        factMap.put("red", RedUIFactory::new);
        factMap.put("blue", BlueUIFactory::new);
    }

    public static UIFactory make(String color){
        color = color.toLowerCase();
        if(factMap.get(color) != null){
            return factMap.get(color).get();
        }else{
            throw new IllegalArgumentException("There is no such type of factory");
        }
    }

}
