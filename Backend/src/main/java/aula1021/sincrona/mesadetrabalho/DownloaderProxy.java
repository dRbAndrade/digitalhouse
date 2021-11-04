package aula1021.sincrona.mesadetrabalho;

import javax.swing.*;

public class DownloaderProxy implements Downloader{

    private DownloaderService downloaderService;

    public DownloaderProxy(DownloaderService downloaderService) {
        this.downloaderService = downloaderService;
    }

    @Override
    public void download(User u) {
        if(!u.getUserType().equals("Premium")){
            JOptionPane.showMessageDialog(null, """
                    Você não possui permissão para baixar as músicas para seu dispositivo""");
        }else{
            downloaderService.download(u);
        }
    }

}
