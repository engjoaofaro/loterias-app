package service.impl;

import service.Game;

public class Megasena extends Game {

    private static final Integer MAX_MEGASENA = 60;
    @Override
    protected String generator(int quantity, int numbersOfGame) {
        return super.gameGenerator(quantity, MAX_MEGASENA, numbersOfGame);
    }
}
