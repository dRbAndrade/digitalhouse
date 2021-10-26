package main.java.aula1020.assincrona;

public abstract class DocumentHandler {

    private DocumentHandler handler;

    private String name;
    protected int levelOfAccess;

    public DocumentHandler(DocumentHandler handler, String name) {
        this.handler = handler;
        this.name = name;
    }

    abstract void readDocument(Document doc, int levelOfAccess);

    public DocumentHandler getHandler() {
        return handler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelOfAccess() {
        return levelOfAccess;
    }

    public void setHandler(DocumentHandler handler) {
        this.handler = handler;
    }

}
