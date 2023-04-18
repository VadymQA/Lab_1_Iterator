package Lab6_Visitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> devTeam = Arrays.asList(
                new Employee("Тестувальник", 3000),
                new Employee("Аналітик", 3500),
                new Employee("Розробник", 4000)
        );

        List<Employee> adminTeam = Arrays.asList(
                new Employee("Адміністратор", 2500),
                new Employee("Менеджер", 2000)
        );

        List<Department> departments = Arrays.asList(
                new Department(devTeam),
                new Department(adminTeam)
        );

        Company company = new Company(departments);

        SalaryReportVisitor devTeamReport = new SalaryReportVisitor();
        departments.get(0).accept(devTeamReport);
        System.out.println(devTeamReport.getReport());

        SalaryReportVisitor adminTeamReport = new SalaryReportVisitor();
        departments.get(1).accept(adminTeamReport);
        System.out.println(adminTeamReport.getReport());

        SalaryReportVisitor companyReport = new SalaryReportVisitor();
        company.accept(companyReport);
        System.out.println(companyReport.getReport());
    }
}

