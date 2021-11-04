package aula1018.assincrona.templatemethod;

import javax.swing.*;

public class DebitProcessor extends Processor{
    @Override
    protected void processPayment(Card card, Double value) {

        DebitCard debitCard = (DebitCard) card;

        if(!debitCard.pay(value)){
            JOptionPane.showMessageDialog(null,String.format("""
                    Cartão: %s
                    
                    Crédito disponível insuficiente.
                    Valor solicitado: %.2f
                    Saldo disponível atual: %.2f""",
                    debitCard.getCensoredNumber(),
                    value,
                    debitCard.getBalance()),
                    "Pagamento com cartão de Débito",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,String.format("""
                Cartão: %s
                
                Pagamento realizado com sucesso!!
                Valor pago: %.2f
                Novo Saldo disponível: %.2f""",
                debitCard.getCensoredNumber(),
                value,
                debitCard.getBalance()),
                "Pagamento com cartão de Débito",
                JOptionPane.PLAIN_MESSAGE);
    }
}
