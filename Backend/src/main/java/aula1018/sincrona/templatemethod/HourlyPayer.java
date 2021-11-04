package aula1018.sincrona.templatemethod;

import javax.swing.*;

public class HourlyPayer extends  Payer{

    @Override
    protected void deposit(Employee e, Double amount) {
        HourlyEmployee employee = (HourlyEmployee)e;
        JOptionPane.showMessageDialog(null,String.format("""
                Funcionário: %s
                Tipo: Contratado
                Horas trabalhadas: %d
                Valor da hora: %.2f
                Total a receber: %.2f
                Numero da conta: %s
                
                        %s""",
                employee,
                employee.getWorkedHours(),
                employee.getHourValue(),
                amount,
                employee.getAccountNumber(),
                employee.getPrintType()));
    }

    @Override
    protected void print(Employee e) {
        e.setPrintType("Documento digital.");
    }

    @Override
    protected Double calculateSalary(Employee e) {
        HourlyEmployee employee = (HourlyEmployee) e;
        return employee.getHourValue()*employee.getWorkedHours();

    }
}
