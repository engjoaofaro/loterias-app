package service.impl;

import service.Game;

public class LotoFacil extends Game {

    private static final Integer MAX_LOTOFACIL = 25;
    private static final Integer MIN_NUMBER_GAME = 15;
    //private static final BigDecimal PRICE = new BigDecimal("2.50");
    @Override
    protected String generator(int quantity, int numbersOfGame) {
        if (!canPlayGame(numbersOfGame)) {
            throw new IllegalArgumentException("O valor mínimo de números a serem gerados " +
                    "para Lotofácil é :"+ MIN_NUMBER_GAME);
        }
        return super.gameGenerator(quantity, MAX_LOTOFACIL, numbersOfGame);
    }

    @Override
    protected Boolean canPlayGame(int minNumberOfGame) {
        return minNumberOfGame >= MIN_NUMBER_GAME;
    }
}
