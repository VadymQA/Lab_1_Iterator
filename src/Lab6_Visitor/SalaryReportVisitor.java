package Lab6_Visitor;

class SalaryReportVisitor implements Visitor {
    private int totalSalary = 0;

    @Override
    public void visitCompany(Company company) {
        for (Department department : company.getDepartments()) {
            department.accept(this);
        }
    }

    @Override
    public void visitDepartment(Department department) {
        for (Employee employee : department.getEmployees()) {
            employee.accept(this);
        }
    }

    @Override
    public void visitEmployee(Employee employee) {
        totalSalary += employee.getSalary();
    }

    public String getReport() {
        return "Загальна зарплатня відомість: " + totalSalary;
    }
}
