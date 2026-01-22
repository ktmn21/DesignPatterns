import java.util.ArrayList;
import java.util.List;

public class LightOperationExecutor {
    private List<LightOperation> lightOperationList = new ArrayList<>();

    public void queueOperation(LightOperation lightOperation){
        lightOperationList.add(lightOperation);
    }

    public void doOperations(){
        lightOperationList.forEach(LightOperation::execute);
        lightOperationList.clear();
    }


}
