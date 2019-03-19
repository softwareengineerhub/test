package com.app.ch12.myinterface;

public class Main {

    public static void main(String[] args) {
        SimpleGame simpleGame = new SimpleGame();

        MyGame myGame = new SimpleGame();
        MyRools myRools = new SimpleGame();

        doSomething(simpleGame);
        doSomething2(simpleGame);

        String name=SimpleGame.GAME_NAME;
    }


    private static void doSomething(MyGame myGame){
        myGame.start();
    }

    private static void doSomething2(MyRools myRools){
        myRools.isCorrectAccordingToRules("");
        /*if(myRools instanceof SimpleGame){
            SimpleGame sg = (SimpleGame) myRools;
        }*/
    }

    private static MyGame getMyGame(int type){
        switch (type){
            case 0: return  new SimpleGame();
            default: throw  new RuntimeException("Incorrect type");
        }
    }

    private static MyGame getMyRools(int type){
        switch (type){
            case 0: return  new SimpleGame();
            default: throw  new RuntimeException("Incorrect type");
        }
    }
}
