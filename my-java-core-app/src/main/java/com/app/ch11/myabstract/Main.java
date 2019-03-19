package com.app.ch11.myabstract;

public class Main {

    public static void main(String[] args) {

        Student st = new Student() {
        };

        Student student = new StudentA();
        student.setAge(10);
        student.setName("Student10");
        System.out.println("-------------");
        MyAction myAction = new DefaultMyAction();
        myAction.bulkProcess(10);
        System.out.println("-------------");
        MyAction myAction2 = getAction(1);
        myAction2.bulkProcess(10);
    }

    private static MyAction getAction(int type){
        switch(type){
            case 0:
                return new DefaultMyAction();
            case 1:
                return new CalculatorMyAction();
            case 2:
                return new MyAction() {
                    @Override
                    public void doAction() {

                    }
                };
             default: throw new RuntimeException("Incorrect type: "+type);

        }
    }
}
