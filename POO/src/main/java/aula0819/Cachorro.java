package aula0819;

import java.time.LocalDate;

//Imagine uma instituição que adota cachorros,e para a adoção é obrigatório que os cachorros tenham:
//se está para adoção ou não, raca, ano aproximado de nascimento,
//peso, possuem chip ou não, estejam feridos ou não e atribuído o primeiro nome para eles naO instituição.
//Devemos saber a idade de um cachorro e se é um cachorro que pode ser perdido
//Compreendendo que aqueles que têm um chip são os que não podem ser perdidos.
//Por outro lado, um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg

public class Cachorro {

    boolean disponivel;
    String raca;
    LocalDate dataNascimento;
    double peso;
    boolean chip;
    boolean ferido;
    String nome;

    public Cachorro(boolean disponivel, String raca, LocalDate dataNascimento, double peso, boolean chip, boolean ferido, String nome) {
        this.disponivel = disponivel;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    public Cachorro(String nome, LocalDate dataNascimento, double peso) {
        this(false, "SRD", dataNascimento, peso, false, false, nome);
    }

    public boolean podeAdotar() {
        return !ferido && peso >= 5;
    }

    public int[] calcularIdade() {
        int anos;
        int meses;
        LocalDate ld = LocalDate.now();
        meses = 12 * (ld.getYear() - dataNascimento.getYear()) + ld.getMonthValue() - dataNascimento.getMonthValue();
        anos = meses / 12;
        meses = meses % 12;
        return new int[]{anos, meses};

    }

    public void showInfo() {
        String racaString;
        if (raca.equals("SRD")) racaString = "cão sem raca definida";
        else racaString = raca;
        int[] idade = calcularIdade();
        String chipString;
        if (chip) chipString = "possui";
        else chipString = "não possui";
        String feridoString;
        if (ferido) feridoString = "está";
        else feridoString = "não está";
        String disponivelString;
        if(podeAdotar()) disponivelString = "está";
        else disponivelString = "não está";
        System.out.printf("""
                        %s é um %s de %s anos e %s meses, pesa %s kg e %s chip. \
                        %s %s ferido(a). %s %s disponível para adoção.%n""",
                nome, racaString,idade[0],idade[1],peso,
                chipString,nome,feridoString,nome,disponivelString);
    }

}
