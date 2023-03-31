package service.impl;

import service.Game;

import java.math.BigDecimal;

public class LotoFacil extends Game {

    private static final Integer MAX_LOTOFACIL = 25;
    private static final BigDecimal PRICE = new BigDecimal("2.50");
    @Override
    protected String generator(int quantity, int numbersOfGame) {
        return super.gameGenerator(quantity, MAX_LOTOFACIL, numbersOfGame);
    }
}
