package aula1018.sincrona.templatemethod;

import javax.swing.*;

public class SalaryPayer extends Payer{
    @Override
    protected void deposit(Employee e, Double amount) {
        SalaryEmployee employee = (SalaryEmployee)e;
        JOptionPane.showMessageDialog(null,String.format("""
                Funcionário: %s
                Tipo: Efetivo
                Salário base: %.2f
                Descontos: %.2f
                Bonificações: %.2f
                Total a receber: %.2f
                Numero da conta: %s
                
                        %s""",
                employee,
                employee.getGrossIncome(),
                employee.getDiscount(),
                employee.getBonus(),
                amount,
                employee.getAccountNumber(),
                employee.getPrintType()));
    }

    @Override
    protected void print(Employee e) {
        e.setPrintType("Documento impresso");
    }

    @Override
    protected Double calculateSalary(Employee e) {
        SalaryEmployee employee = (SalaryEmployee) e;
        return employee.getGrossIncome()-employee.getDiscount()+ employee.getBonus();
    }
}
