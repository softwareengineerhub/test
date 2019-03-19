package com.app.ch12.myinterface;

public interface MyGame {

    //public static final String GAME_NAME = "Super Game";
    String GAME_NAME = "Super Game";

    public abstract void start();

    void play(String userName);

    public void stop();



}
