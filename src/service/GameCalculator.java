package service;

public class GameCalculator {

    public String calculate(int quantity, int numbersOfGame, Game game) {
        String voucher = null;
        try {
            voucher = game.generator(quantity, numbersOfGame);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao tentar gerar os jogos: "+ e);
        }
        System.out.println();
        System.out.println("Jogo(s) gerado(s) com sucesso!");
        return voucher;
    }
}
