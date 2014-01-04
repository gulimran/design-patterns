package imran.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String name;
    private final List<Component> componentList;

    public Composite(String name) {
        this.componentList = new ArrayList<Component>();
        this.name = name;
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public String getName() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(name);

        for (Component component : componentList) {
            buffer.append(component.getName());
        }

        return buffer.toString();
    }
}
