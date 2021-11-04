package aula1020.sincrona.mesadetrabalho;

import javax.swing.*;

public class WeightControl extends QualityControl{

    WeightControl(QualityControl next) {
        super(next);
    }

    void handleProduct(Product p) {
        if (p.getWeight() < 1200 || p.getWeight() > 1300) {
            JOptionPane.showMessageDialog(null, String.format("""
                            Produto: %s
                            Lote: %d
                            Embalagem: %s
                            O produto foi rejeitado.""",
                    p.getName(),
                    p.getBatch(),
                    p.getPackaging()));
        } else {
            if (getNext() != null) getNext().handleProduct(p);
            else {
                JOptionPane.showMessageDialog(null, String.format("""
                        Produto: %s
                        Lote: %d
                        Embalagem: %s
                        O foi produto foi aceito.""",
                        p.getName(),
                        p.getBatch(),
                        p.getPackaging()));
            }
        }
    }
}
