package aula1020.sincrona;

import javax.swing.*;

public class ComercialDepartment extends  Department {

    public ComercialDepartment(Department nextDepartment ) {
        super(nextDepartment);
        this.setEmailAddress("comercial@colmeia.com");
    }

    @Override
    public void handleEmail(Email email) {
        if(email.getRecipient().equals(getEmailAddress())||
                email.getSubject().equals("Comercial")){
            JOptionPane.showMessageDialog(null, String.format("""
                    Origem: %s
                    Assunto: %s
                    Destinatário: %s
                    
                    Email encaminhado para a área comercial.""",
                    email.getOrigin(),
                    email.getSubject(),
                    email.getRecipient()));
        }else{
            if(getNextDepartment()!=null)getNextDepartment().handleEmail(email);
            else{
                JOptionPane.showMessageDialog(null, String.format("""
                    Origem: %s
                    Assunto: %s
                    Destinatário: %s
                    
                    Email marcado como span.""",
                    email.getOrigin(),
                    email.getSubject(),
                    email.getRecipient()));
            }
        }
    }
}
