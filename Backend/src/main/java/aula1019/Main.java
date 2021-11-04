package aula1019;

public class Main {
    public static void main(String[] args) {
        Salesperson employee = Employee.generateRandomEmployee();
        Salesperson affiliate = Affiliate.generateRandomAffiliate();
        Salesperson intern = Intern.generateRandomIntern();

        employee.sell();
        affiliate.sell();
        intern.sell();

        employee.showRank();
        affiliate.showRank();
        intern.showRank();

    }
}
