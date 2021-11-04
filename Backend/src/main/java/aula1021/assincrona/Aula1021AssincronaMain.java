package aula1021.assincrona;

public class Aula1021AssincronaMain {

    public static void main(String[] args) {
        Document randomDoc = Document.generateRandomDocument();
        User user = User.generateRandomUser();
        Drive driveProxy = new DriveProxy(new DriveService());

        Document preDeterminedDoc = DriveService.getDocuments().get((int)(Math.random()*10));
        driveProxy.accessDocument(randomDoc.getUrl(),user.getEmail());
        driveProxy.accessDocument(preDeterminedDoc.getUrl(),user.getEmail());
        driveProxy.accessDocument(preDeterminedDoc.getUrl(),preDeterminedDoc.getAuthorizedUsers().get(0).getEmail());

    }

}
