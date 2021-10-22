package main.java.aula1019;

import main.java.util.Generator;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Salesperson{

    private List<Affiliate> affiliateList;
    private int workedYears;

    public Employee(String name, int workedYears) {
        super(name);
        this.workedYears = workedYears;
        this.affiliateList = new ArrayList<>();
    }

    @Override
    protected void calculateScore() {
        setScore(
                getSales() * 5 +
                workedYears * 5 +
                affiliateList.size() * 10
        );
    }

    public void addAffiliate(Affiliate a){
        affiliateList.add(a);
    }

    public static Employee generateRandomEmployee(){
        Employee employee = new Employee(
                Generator.generateRandomGibberish(6),
                (int)(Math.random()*10)
        );
        for (int i = 0; i<(int)(Math.random()*10);i++){
            employee.affiliateList.add(new Affiliate(Generator.generateRandomGibberish(6)));
        }
        return employee;
    }

    public List<Affiliate> getAffiliateList() {
        return affiliateList;
    }

    public void setAffiliateList(List<Affiliate> affiliateList) {
        this.affiliateList = affiliateList;
    }

    public int getWorkedYears() {
        return workedYears;
    }

    public void setWorkedYears(int workedYears) {
        this.workedYears = workedYears;
    }

    @Override
    public String toString() {
        final String[] affiliateString = {""};
        affiliateList.forEach(e-> affiliateString[0]+=String.format("%4s%s%n","",e.getName()));
        if (affiliateString[0].equals(""))affiliateString[0]=String.format("%4sNenhum afiliado","");

        return String.format("""
                Vendedor: %s
                Tipo: Funcionário
                Anos de trabalho: %d
                Afiliados:
                %s""",
                getName(),
                getWorkedYears(),
                affiliateString[0]);
    }

}
