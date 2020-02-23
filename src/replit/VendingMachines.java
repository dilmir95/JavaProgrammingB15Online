package replit;

public abstract class VendingMachines {

    public abstract void select(int itemNumber);
    public abstract double pay(double money);
    public abstract double returnChange();
    public abstract void cancel();
}
