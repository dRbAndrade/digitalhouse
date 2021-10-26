package main.java.aula1020.assincrona;

import main.java.util.Generator;

import javax.swing.*;

public class Minister extends DocumentHandler{
    public Minister(DocumentHandler handler, String name) {
        super(handler, name);
        this.levelOfAccess=2;
    }

    public static Minister generateRandomMinister() {
        return new Minister(
                President.generateRandomPresident(),
                Generator.generateRandomGibberish(8)
        );
    }

    @Override
    void readDocument(Document doc, int levelOfAccess) {
        String msg;
        if(DocumentType.getTypeAsInt(doc.getType())<=levelOfAccess){
            msg = String.format("""
                    Leitura do documento autorizada
                    
                    Conteúdo: %s""",doc.getContent());
        }else{
            msg = "Leitura do documento não autorizada";
        }
        JOptionPane.showMessageDialog(null, String.format("""
                    Leitor: Ministro(a) %s
                    Documento: %s
                    %s""",
                getName(),doc.getType(),msg));

        if(getHandler()!=null)getHandler().readDocument(doc,getHandler().levelOfAccess);
    }
}
