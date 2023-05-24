package Lab10_Compsoite;

public class Main {
    public static void main(String[] args) {

        InputField inputField = new InputField("name");
        SelectField selectField = new SelectField("gender");

        FieldSet fieldSet = new FieldSet("personalInfo");
        fieldSet.add(inputField);
        fieldSet.add(selectField);

        System.out.println(fieldSet.render());
    }
}

