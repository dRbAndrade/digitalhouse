package randomstudies;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String cpf;
    private Integer irmaos;

    public Pessoa(){}
    public Pessoa(String nome, String cpf, Integer irmaos) {
        this.nome = nome;
        this.cpf = cpf;
        this.irmaos = irmaos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIrmaos() {
        return irmaos;
    }

    public void setIrmaos(Integer irmaos) {
        this.irmaos = irmaos;
    }

    public String validate() throws NoSuchFieldException {
        String msg = "Ok";
        String[] propNames = {"nome","cpf","irmaos"};
        List<Field> fields = new ArrayList<>();
        for(String propName : propNames) {
            fields.add(getClass().getField(propName));
        }
        return msg;
    }

}

