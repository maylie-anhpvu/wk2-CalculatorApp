import javax.swing.*;
import java.awt.*;

public class Buttons {
    Font FONT_ARIAL = new Font("Arial", Font.BOLD, 20);
    String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] OPS = {".", "C", "DEL", "=", "x", "+", "-", "/", "=", "x\u00B2", "1/x", "\u221A"};
    String[] RUN = {"ON", "OFF"};

    public Buttons() {
        setNUMBERS(NUMBERS);
    }

    public void setNUMBERS(String[] numArray) {
        for (String numStr : numArray) {
            JButton button = new JButton(numStr);
            button.setFont(FONT_ARIAL);
            button.setBackground(Color.WHITE);
        }
    }

    public void setOPS(String[] opsArray){

    }

    public void setRUN(String[] runArray){

    }
}
