package main.java.aula1022;

import java.util.HashMap;
import java.util.Map;

public class SeriesStreamingProxy implements SeriesStreaming {

    private Map<String, Integer> seriesWatched;
    private SeriesStreamingImpl seriesStreaming;

    public SeriesStreamingProxy(){
        seriesWatched = new HashMap<>();
        seriesStreaming = new SeriesStreamingImpl();
    }
    @Override
    public String getSeries(String name) throws SeriesUnavailableException {

        if(!seriesWatched.containsKey(name)) seriesWatched.put(name,0);
        if(seriesWatched.get(name)<5) {
            seriesWatched.put(name, seriesWatched.get(name) + 1);
            return seriesStreaming.getSeries(name);
        }else{
            throw new SeriesUnavailableException("Série indisponível no momento.");
        }

    }
}
