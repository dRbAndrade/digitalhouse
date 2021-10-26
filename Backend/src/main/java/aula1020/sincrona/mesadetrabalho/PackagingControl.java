package main.java.aula1020.sincrona.mesadetrabalho;

import javax.swing.*;

public class PackagingControl extends QualityControl{
    PackagingControl(QualityControl next) {
        super(next);
    }

    void handleProduct(Product p) {
        if (!p.getPackaging().equalsIgnoreCase("Saudável")||
                !p.getPackaging().equalsIgnoreCase("Quase saudável")) {
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
                                O produto foi aceito.""",
                        p.getName(),
                        p.getBatch(),
                        p.getPackaging()));
            }
        }
    }
}
