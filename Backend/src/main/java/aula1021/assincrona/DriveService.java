package aula1021.assincrona;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DriveService implements Drive {

    private static List<Document> documents = new ArrayList<>();

    public DriveService() {

        for(int i = 0;i<10;i++){
            documents.add(Document.generateRandomDocument());
        }

    }

    @Override
    public void accessDocument(String url, String email) {
        Document doc = documents.stream().filter(e-> e.getUrl().equals(url)).findAny().get();
        JOptionPane.showMessageDialog(null,String.format("""
                Documento: %s
                URL: %s
                Email de acesso: %s
                Conteúdo: %s""",
                doc.getId(),
                doc.getUrl(),
                email,
                doc.getContent()));
    }

    public static List<Document> getDocuments() {
        return documents;
    }

    public static void setDocuments(List<Document> documents) {
        DriveService.documents = documents;
    }
}
