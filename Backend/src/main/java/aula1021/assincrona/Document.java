package aula1021.assincrona;

import util.Generator;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private int id;
    private String url;
    private String content;
    private List<User> authorizedUsers;

    public Document(int id, String url, String content, List<User> authorizedUsers) {
        this.id = id;
        this.url = url;
        this.content = content;
        this.authorizedUsers = authorizedUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<User> getAuthorizedUsers() {
        return authorizedUsers;
    }

    public void setAuthorizedUsers(List<User> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
    }

    public static Document generateRandomDocument(){
        List<User> authorizedUsers = new ArrayList<>();
        for (int i = 0;i<10;i++){
            authorizedUsers.add(User.generateRandomUser());
        }
        return new Document(
                (int) (Math.random()*1000),
                "www.drbdrive.com.br/"+Generator.generateRandomGibberish((int) (Math.random()*50-Math.random()*10)+10),
                Generator.generateRandomGibberish((int) (Math.random()*150-Math.random()*50)+50),
                authorizedUsers
        );
    }
}
