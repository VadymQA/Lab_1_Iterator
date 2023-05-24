package Lab10_Compsoite;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class FieldSet extends HTMLFormComponent {
    private final List<HTMLFormComponent> components = new ArrayList<>();
    private String name;

    public FieldSet(String name) {
        this.name = name;
    }

    @Override
    public void add(HTMLFormComponent component) {
        components.add(component);
    }

    @Override
    public void remove(HTMLFormComponent component) {
        components.remove(component);
    }

    @Override
    public String render() {
        StringBuilder result = new StringBuilder("Rendering FieldSet: " + name + "\n");
        for (HTMLFormComponent component : components) {
            result.append(component.render()).append("\n");
        }

        return result.toString();
    }


}
