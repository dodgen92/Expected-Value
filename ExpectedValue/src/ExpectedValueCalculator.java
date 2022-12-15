import javax.swing.*;

public class ExpectedValueCalculator {
  public static void main(String[] args) {
    // Prompt the user for the probability of winning
    String probabilityOfWinningInput = JOptionPane.showInputDialog(
        "Enter the probability of winning (as a decimal):");
    double probabilityOfWinning = Double.parseDouble(probabilityOfWinningInput);

    // Prompt the user for the amount won per bet
    String amountWonInput = JOptionPane.showInputDialog(
        "Enter the amount won per bet:");
    double amountWon = Double.parseDouble(amountWonInput);

    // Prompt the user for the probability of losing
    String probabilityOfLosingInput = JOptionPane.showInputDialog(
        "Enter the probability of losing (as a decimal):");
    double probabilityOfLosing = Double.parseDouble(probabilityOfLosingInput);

    // Prompt the user for the amount lost per bet
    String amountLostInput = JOptionPane.showInputDialog(
        "Enter the amount lost per bet:");
    double amountLost = Double.parseDouble(amountLostInput);

    // Calculate the expected value
    double expectedValue = (probabilityOfWinning * amountWon) -
        (probabilityOfLosing * amountLost);

    // Display the result to the user
    JOptionPane.showMessageDialog(null, "The expected value is: " + expectedValue);
  }
}