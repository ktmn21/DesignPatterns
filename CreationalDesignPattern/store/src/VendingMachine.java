import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static{
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Drinks", Drinks::new);
    }

    Snack getSnack(String snack){
        if(snackMap.get(snack) != null){
            return snackMap.get(snack).get();
        }
        else{
            throw new IllegalArgumentException("There is no such snack");
        }
    }

}
