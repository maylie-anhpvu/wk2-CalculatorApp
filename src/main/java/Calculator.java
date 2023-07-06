import javax.swing.*;
import java.awt.*;

public class Calculator {

    Font FONT_ARIAL = new Font("Arial", Font.BOLD, 20);
    String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    JFrame frame;

    public Calculator() {
        setCalcFrame();
    }

    public void setCalcFrame() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(500,700);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        //Locate to the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addButtons() {
        JPanel panel = new JPanel();
        for (String numStr : NUMBERS) {
            JButton button = new JButton(numStr);
            button.setFont(FONT_ARIAL);
            panel.add(button);
        }
        frame.add(panel);
    }


}
