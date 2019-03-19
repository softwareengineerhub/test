package com.app.ch12.myinterface;

public class SimpleGame implements MyGame, MyRools {

    @Override
    public void start() {

    }

    @Override
    public void play(String userName) {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isCorrectAccordingToRules(Object object) {
        return false;
    }
}
