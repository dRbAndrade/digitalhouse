package aula0818;

import java.util.*;

public class Jogo {

    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo(
                "Matheus","dRb"
        );
        UsuarioJogo usuario2 = new UsuarioJogo(
                "Abne","Ashiria"
        );
        UsuarioJogo usuario3 = new UsuarioJogo(
                "Jhonny","oBajara"
        );


        for (int i =0; i<Math.random()*100;i++){
            usuario1.upar();
            usuario1.aumentarPontuacao();
            usuario1.bonificar((int)(Math.random()*20));

            usuario2.upar();
            usuario2.aumentarPontuacao();
            usuario2.bonificar((int)(Math.random()*20));

            usuario3.upar();
            usuario3.aumentarPontuacao();
            usuario3.bonificar((int)(Math.random()*20));
        }

        System.out.printf("""
                        Jogador: %s
                        Apelido: %s
                        Pontuação: %d
                        Nível: %d%n
                        """,
                usuario1.getNome(),usuario1.getNickname(),
                usuario1.getPontuacao(),usuario1.getNivel());

        System.out.printf("""
                        Jogador: %s
                        Apelido: %s
                        Pontuação: %d
                        Nível: %d%n
                        """,
                usuario2.getNome(),usuario2.getNickname(),
                usuario2.getPontuacao(),usuario2.getNivel());

        System.out.printf("""
                        Jogador: %s
                        Apelido: %s
                        Pontuação: %d
                        Nível: %d%n
                        """,
                usuario3.getNome(),usuario3.getNickname(),
                usuario3.getPontuacao(),usuario3.getNivel());


    }

}