package main.java.aula1022;

public class SeriesStreamingImpl implements SeriesStreaming {

    @Override
    public String getSeries(String name) {
        return "www."+name+".com.br";
    }

}
