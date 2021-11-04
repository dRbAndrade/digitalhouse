package aula1020.assincrona;

import util.Generator;

import javax.swing.*;

public class Congressperson extends DocumentHandler{


    public Congressperson(DocumentHandler handler, String name) {
        super(handler, name);
        this.levelOfAccess=1;
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
                    Leitor: Deputado(a) %s
                    Documento: %s
                    %s""",
                getName(),doc.getType(),msg));

        if(getHandler()!=null)getHandler().readDocument(doc,getHandler().levelOfAccess);
    }

    public static Congressperson generateRandomCongressPerson(){
        return new Congressperson(
                Minister.generateRandomMinister(),
                Generator.generateRandomGibberish(6)
        );

    }
}
