package main.java.aula1020.sincrona.mesadetrabalho;

import javax.swing.*;

public class BatchControl extends QualityControl{


    BatchControl(QualityControl next) {
        super(next);
    }

    @Override
    void handleProduct(Product p) {
        if(p.getBatch()<1000||p.getBatch()>2000){
            JOptionPane.showMessageDialog(null, String.format("""
                    Produto: %s
                    Lote: %d
                    Embalagem: %s
                    O produto foi rejeitado.""",
                    p.getName(),
                    p.getBatch(),
                    p.getPackaging()));
        }else{
            if(getNext()!=null)getNext().handleProduct(p);
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
