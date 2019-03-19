package com.app.ch11.myabstract;

public abstract class MyAction {

    public abstract void doAction();

    public void bulkProcess(int loopAmount){
        for(int i=0;i<loopAmount;i++){
            doAction();
        }
    }
}
