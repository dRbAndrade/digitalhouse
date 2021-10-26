package main.java.aula1021.assincrona;

import javax.swing.*;
import java.util.NoSuchElementException;

public class DriveProxy implements Drive{

    private DriveService service;

    public DriveProxy(DriveService service) {
        this.service = service;
    }

    @Override
    public void accessDocument(String url, String email) {
        Document doc;

        try {
            doc = DriveService.getDocuments().stream().filter(e-> e.getUrl().equals(url)).findAny().get();
        }catch (NoSuchElementException ex){
            JOptionPane.showMessageDialog(null, """
                    Documento não encontrado""");
            return;
        }
        if(!doc.getAuthorizedUsers().stream().filter(e->e.getEmail().equals(email)).toList().isEmpty()){

                JOptionPane.showMessageDialog(null, "Usuário autorizado.");
                service.accessDocument(url,email);

        }else JOptionPane.showMessageDialog(null,"Usuário não autorizado.");

    }
}
