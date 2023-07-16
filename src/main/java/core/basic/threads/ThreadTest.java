package core.basic.threads;

import core.basic.model.Employee;

public class ThreadTest
{
    public static final int DELAY = 10;
    public static final int STEPS = 100;

    public static void main(String[] args)
    {
        var employee = new Employee("duoli");

        Runnable task1 = () -> {
            try {
                for (int i = 0; i <= STEPS; i++) {
                    employee.say(1);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };
        Runnable task2 = () -> {
            try {
                for (int j = 0; j <= STEPS; j++) {
                    employee.say(2);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}
