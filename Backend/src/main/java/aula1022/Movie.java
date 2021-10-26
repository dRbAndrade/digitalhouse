package main.java.aula1022;

import main.java.util.Generator;

public class Movie {

    private String name;
    private String url;
    private String country;

    public Movie(String name, String url, String country) {
        this.name = name;
        this.url = url;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static Movie generateRandomMovie(){
        return new Movie(
                Generator.generateRandomGibberish((int)(Math.random()*97)+3),
                "www.dRbflix.com.br/"+Generator.generateRandomGibberish((int)(Math.random()*5)+3),
                Generator.generateRandomGibberish((int)(Math.random()*10)+5));
    }
}
