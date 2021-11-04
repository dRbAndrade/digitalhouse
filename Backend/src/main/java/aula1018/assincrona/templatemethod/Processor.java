package aula1018.assincrona.templatemethod;

import javax.swing.*;
import java.time.LocalDate;

public abstract class Processor {

    public void validateAndProcessPayment(Card card, Double value){

        if(!validateDate(card)) {
            JOptionPane.showMessageDialog(null, "Cartão vencido.");
            return;
        }

        processPayment(card,value);

    }

    protected abstract void processPayment(Card card,Double value);

    private boolean validateDate(Card card) {
        LocalDate today = LocalDate.now();
        if(card.getExpirationDate().isBefore(today))return false;
        return true;
    }

}
