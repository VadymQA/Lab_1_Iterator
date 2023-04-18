package Lab6_Visitor;

import java.util.List;

class Department {
    private List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }
}
