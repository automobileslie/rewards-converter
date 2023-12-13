import java.util.Scanner;

public class RewardValue {

    private double cashValue;    // cash value
    private int milesValue;     // amount of miles

    public RewardValue(double args) {
        // RewardValue converts from miles to cash at a rate of 0.0035.
        // set the amount of cash that the user has entered

        this.cashValue = args;
        this.milesValue = (int)(args * 0.0035);
    }

    public RewardValue(int args) {
        // RewardValue converts from miles to cash at a rate of 0.0035.
        // set the amount of cash that the user has entered

        this.milesValue = args;
        this.cashValue = (double)(args / 0.0035);
    }

    public double getCashValue() {
        // convert the miles to the cash value
        return this.cashValue;

    }

    public double getMilesValue() {
        // convert the cash to miles
        return this.milesValue;
    }
}
