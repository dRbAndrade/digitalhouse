package aula1118.mesadetrabalho;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class PortfolioDTO {

    private long id;
    private String name;
    private String description;
    private String link;
    private String code;

    public PortfolioDTO(int id, String name, String description, String link, String code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.code = code;
    }

    public PortfolioDTO() {
    }

    public PortfolioDTO(Portfolio entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.link = entity.getLink();
        this.code = entity.getCode();
    }

}
