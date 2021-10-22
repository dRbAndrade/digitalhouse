package main.java.aula1021.sincrona.mesadetrabalho;

import javax.swing.*;

public class DownloaderService implements Downloader{

    @Override
    public void download(User u) {
        JOptionPane.showMessageDialog(null, String.format("""
                %s, sua música foi baixada para seu dispositivo com sucesso.""", u.getName()));
    }

}
