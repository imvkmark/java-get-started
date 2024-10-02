package core_basic.threads;

public class Bank
{

    private int id;
    private double amount;

    public void Bank(int id, double amount)
    {
        this.id = id;
        this.amount = amount;
    }

    public void transfer(int from, int to, double amount)
    {
        System.out.println("transfer " + from + " to " + to + ", amount: " + amount);
    }
}
