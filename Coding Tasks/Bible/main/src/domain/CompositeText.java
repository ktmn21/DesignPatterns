package domain;

import java.util.List;

public abstract class CompositeText implements Text{

    public abstract List<Text> getChildren();
}
