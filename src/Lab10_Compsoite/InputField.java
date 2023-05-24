package Lab10_Compsoite;

public class InputField extends HTMLFormComponent{
    private String name;

    public InputField(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return "Renderin InputField: " + name;
    }
}
