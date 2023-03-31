import service.Game;
import service.GameCalculator;
import service.impl.LotoFacil;
import service.impl.Megasena;

import java.util.Scanner;

public class lotteryApplication {

    public static void main(String[] args) {
        Game gameType;
        System.out.println("#### ATUALMENTE SOMENTE JOGOS DA MEGASENA E LOTOFACIL ESTÃO DISPONÍVEIS ####");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para Megasena ou 2 para Lotofácil: ");
        int game = input.nextInt();

        if (game == 1) {
            System.out.println("Jogo escolhido: MEGASENA");
            System.out.println();
            gameType = new Megasena();
        }else if (game == 2) {
            System.out.println("Jogo escolhido: LOTOFACIL");
            System.out.println();
            gameType = new LotoFacil();
        } else {
            throw new IllegalArgumentException("Número inválido. Por favor digite 1 ou 2 para escolher o tipo do jogo");
        }
        System.out.println("Digite a quantidade de números a serem gerados por jogo: ");
        int numbersOfGame = input.nextInt();
        System.out.println("Digite a quantidade de jogos a serem gerados: ");
        int quantity = input.nextInt();

        GameCalculator gameCalculator = new GameCalculator();
        String voucher = gameCalculator.calculate(quantity, numbersOfGame, gameType);
        System.out.println();
        System.out.println("ID da transação: "+ voucher);
        System.out.println();
    }
}