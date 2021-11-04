package aula1104;

import java.io.Serializable;

public class Pages implements Serializable {

    private String url;

    public Pages(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "url='" + url + '\'' +
                '}';
    }
}
