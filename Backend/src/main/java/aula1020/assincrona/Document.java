package main.java.aula1020.assincrona;

import main.java.util.Generator;

public class Document {

    private String content;
    private DocumentType type;

    public Document(String content, DocumentType type) {
        this.content = content;
        this.type = type;
    }

    public static Document generateRandomDocument(){
        return new Document(
                Generator.generateRandomGibberish(100),
                DocumentType.getTypeAsEnum((int) (Math.random()*3)+1)
        );

    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }
}
