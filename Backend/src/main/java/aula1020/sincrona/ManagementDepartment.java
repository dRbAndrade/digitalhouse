package main.java.aula1020.sincrona;

import javax.swing.*;

public class ManagementDepartment extends Department{

    public ManagementDepartment(Department nextDepartment) {
        super(nextDepartment);
        this.setEmailAddress("gerencia@colmeia.com");
    }

    @Override
    public void handleEmail(Email email) {
        if(email.getRecipient().equals(getEmailAddress())||
            email.getSubject().equals("Gerência")){
            JOptionPane.showMessageDialog(null, String.format("""
                    Origem: %s
                    Assunto: %s
                    Destinatário: %s
                    
                    Email encaminhado para a gerência.""",
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
