package aula1111;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Random;

@Service
public class LotteryService {

    public Lottery generateRandomGames(int quantity){

        ArrayList<TreeSet<Integer>> games = new ArrayList<>();

        Random random = new Random();
        for(int i =0; i<quantity;i++) {
            TreeSet<Integer> game = new TreeSet<>();
            while(game.size()!=6) {
                game.add(random.nextInt(1, 61));
            }
            games.add(game);
        }
        return new Lottery(games);
    }

}
