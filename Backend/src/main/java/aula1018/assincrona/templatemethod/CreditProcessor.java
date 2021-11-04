package aula1018.assincrona.templatemethod;

import javax.swing.*;

public class CreditProcessor extends Processor{
    @Override
    protected void processPayment(Card card, Double value) {
        CreditCard creditCard = (CreditCard) card;

        if(!creditCard.pay(value)){
            JOptionPane.showMessageDialog(null,String.format("""
                    Cartão: %s
                    
                    Crédito disponível insuficiente.
                    Valor solicitado: %.2f
                    Limite disponível atual: %.2f""",
                    creditCard.getCensoredNumber(),
                    value,
                    creditCard.getAvailableCredit()),
                    "Pagamento com cartão de Crédito",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null,String.format("""
                Cartão: %s
                
                Pagamento realizado com sucesso!!
                Valor pago: %.2f
                Novo limite disponível: %.2f""",
                creditCard.getCensoredNumber(),
                value,
                creditCard.getAvailableCredit()),
                "Pagamento com cartão de Crédito",
                JOptionPane.PLAIN_MESSAGE);
    }
}
