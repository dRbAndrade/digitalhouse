package main.java.aula1020.assincrona;

public class Main {

    public static void main(String[] args) {

        DocumentHandler congressPerson = Congressperson.generateRandomCongressPerson();
        Document doc = Document.generateRandomDocument();
        congressPerson.readDocument(doc, congressPerson.levelOfAccess);

    }

}
