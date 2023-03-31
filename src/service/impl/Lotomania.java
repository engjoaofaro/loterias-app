package service.impl;

import service.Game;

public class Lotomania extends Game {

    private static final Integer MAX_LOTOMANIA = 100;
    @Override
    protected String generator(int quantity, int numbersOfGame) {
        return super.gameGenerator(quantity, MAX_LOTOMANIA, numbersOfGame);
    }
}
