package aula0910;

import java.time.LocalDate;

public abstract class Embarcacao {

    protected Capitao capitao;
    protected Double precoBase;
    protected Double valorAdicional;
    protected LocalDate date;
    protected Integer comprimento;

    abstract public Double calcularAluguel();

}
