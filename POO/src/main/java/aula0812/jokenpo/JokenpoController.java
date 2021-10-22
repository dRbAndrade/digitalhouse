package aula0812.jokenpo;

public class JokenpoController {

    public static void play(int opt) {

        Options playerOption = new Options(opt);
        Options cpuOption = new Options((int) Math.floor(Math.random()*5));

        if(!playerOption.beats(cpuOption)&&
            !playerOption.isBeatenBy(cpuOption)){
            ScorePane.score(0,playerOption,cpuOption);
            JokenpoRoot.changeImages(new Options(),new Options());
        }else if(playerOption.beats(cpuOption)){
            ScorePane.score(1,playerOption,cpuOption);
            JokenpoRoot.changeImages(playerOption,cpuOption);
        }else{
            ScorePane.score(2,playerOption,cpuOption);
            JokenpoRoot.changeImages(cpuOption,playerOption);
        }
    }

}
