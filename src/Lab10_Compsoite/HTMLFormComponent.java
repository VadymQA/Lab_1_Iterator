package Lab10_Compsoite;

public abstract class HTMLFormComponent {
    public void add(HTMLFormComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(HTMLFormComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract String render();
}
