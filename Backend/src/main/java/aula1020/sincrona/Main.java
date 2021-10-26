package main.java.aula1020.sincrona;

public class Main {

    public static void main(String[] args) {
        Department management = new ManagementDepartment(new ComercialDepartment(new TechnicalDepartment(null)));
        Email email = Email.generateRandomEmail();

        management.handleEmail(email);

    }

}
