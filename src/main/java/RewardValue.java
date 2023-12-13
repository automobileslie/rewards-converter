import java.util.Scanner;

public class RewardValue {

    private double cashValue;    // cash value

    public RewardValue(double args) {
        // RewardValue converts from miles to cash at a rate of 0.0035.
        // set the amount of cash that the user has entered

        this.cashValue = args;
    }

    public double getCashValue() {
        // convert the miles to the cash value
        return this.getMilesValue() / 0.0035;

    }

    public double getMilesValue() {
        // convert the cash to miles
        return this.cashValue * 0.0035;
    }
}
