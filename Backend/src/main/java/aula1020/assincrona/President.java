package aula1020.assincrona;

import util.Generator;

import javax.swing.*;

public class President extends DocumentHandler{

    public President(DocumentHandler handler, String name) {
        super(handler, name);
        this.levelOfAccess=3;
    }

    public static President generateRandomPresident() {
        return new President(
                null,
                Generator.generateRandomGibberish(10)
        );
    }

    @Override
    void readDocument(Document doc, int levelOfAccess) {
        String msg = String.format("""
                    Leitura do documento autorizada
                    
                    Conteúdo: %s""",doc.getContent());
        JOptionPane.showMessageDialog(null, String.format("""
                    Leitor: Presidente %s
                    Documento: %s
                    %s""",
                    getName(),doc.getType(),msg));

        if(getHandler()!=null)getHandler().readDocument(doc,getHandler().levelOfAccess);
    }
}
