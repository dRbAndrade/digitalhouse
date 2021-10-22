package aula0927;

import java.util.ArrayList;
import java.util.List;

public class FiguraComplexa implements Forma{

    private List<Forma> formas = new ArrayList<>();

    @Override
    public double calcularArea() {

        return formas.stream()
                .map(e->e.calcularArea())
                .reduce((acc,current)->acc+current)
                .get();

    }

    public List<Forma> getFormas() {
        return formas;
    }

    public void setFormas(List<Forma> formas) {
        this.formas = formas;
    }
}
