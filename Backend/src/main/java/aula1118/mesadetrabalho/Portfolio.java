package aula1118.mesadetrabalho;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String link;
    private String code;

    public Portfolio(int id, String name, String description, String link, String code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.code = code;
    }

    public Portfolio() {
    }
}
