import javax.swing.*;
import java.awt.*;

public class NumPadPanel extends JPanel {
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
            bMinus,bPlus,bMult,bDiv,bEqual,bDec;
    public NumPadPanel() {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bPlus = new JButton("+");

        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bMinus = new JButton("-");

        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bMult = new JButton("*");

        bDec = new JButton(".");
        b0 = new JButton("0");
        bEqual = new JButton("=");
        bDiv = new JButton("/");
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(300,300));
        setLayout(new GridLayout(4,4,5,5));
        add(b1);add(b2);add(b3);add(bPlus);
        add(b4);add(b5);add(b6);add(bMinus);
        add(b7);add(b8);add(b9);add(bMult);
        add(bDec);add(b0);add(bEqual);add(bDiv);
    }
}
