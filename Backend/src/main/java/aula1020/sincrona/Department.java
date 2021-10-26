package main.java.aula1020.sincrona;

public abstract class Department extends EmailHandler{

    private Department nextDepartment;
    private String emailAddress;



    public Department(Department nextDepartment) {
        this.nextDepartment = nextDepartment;
    }

    public Department getNextDepartment() {
        return nextDepartment;
    }

    public void setNextDepartment(Department nextDepartment) {
        this.nextDepartment = nextDepartment;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
