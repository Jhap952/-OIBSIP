import javax.swing.JOptionPane;

public class GuessTheNumber {

    public static void main(String[] args) {

        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        int maxTries = 6;

        String message = "I'm thinking of a number between 1 and 100.\n" +
                "You have " + maxTries + " tries to guess it.\n" +
                "Good luck!";
        JOptionPane.showMessageDialog(null, message);

        while (numberOfTries < maxTries) {
            String input = JOptionPane.showInputDialog("Enter your guess:");
            int guess = Integer.parseInt(input);
            numberOfTries++;

            if (guess < numberToGuess) {
                message = "Your guess is too low.\n" +
                        "You have " + (maxTries - numberOfTries) + " tries left.";
                JOptionPane.showMessageDialog(null, message);
            } else if (guess > numberToGuess) {
                message = "Your guess is too high.\n" +
                        "You have " + (maxTries - numberOfTries) + " tries left.";
                JOptionPane.showMessageDialog(null, message);
            } else {
                message = "Congratulations! You found the number in " + numberOfTries + " tries.";
                JOptionPane.showMessageDialog(null, message);
                break;
            }
        }

        if (numberOfTries == maxTries) {
            message = "Game over! The number was " + numberToGuess + ".\n" +
                    "You didn't guess it in " + maxTries + " tries.";
            JOptionPane.showMessageDialog(null, message);
        }
    }
}