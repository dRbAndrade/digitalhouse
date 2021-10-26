package main.java.aula1022.mesadetrabalho;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SeriesStreamingProxy seriesProxy = new SeriesStreamingProxy();
        String series;
        String searchTerms;
        while(true) {
            try {
                searchTerms = JOptionPane.showInputDialog(null, """
                        Digite -1 para sair a qualquer momento.
                                    
                        Nome da série:""");
                if (searchTerms.equals("-1"))exit();
                series = seriesProxy.getSeries(searchTerms);
                JOptionPane.showMessageDialog(null, series);
            } catch (SeriesUnavailableException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private static void exit(){
        JOptionPane.showMessageDialog(null, """
                Muito obrigado por usar o serviço de Streaming dRb!
                Até logo o/""");
        System.exit(0);
    }

}
