package Lab10_Compsoite;

public class SelectField extends HTMLFormComponent {
    private String name;

    public SelectField(String name) {
        this.name = name;
    }
    @Override
    public String render() {
        return "Rendering SelectField: " + name;
    }
}
