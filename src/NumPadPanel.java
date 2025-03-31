import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NumPadPanel extends JPanel {
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
            bMinus,bPlus,bMult,bDiv,bEqual,bDec;
    private ActionListener actionListener;
    public NumPadPanel(ActionListener actionListener) {
        this.actionListener = actionListener;
        setBounds(100,150,300,300);
        setLayout(new GridLayout(4,4,10,10));

        b1 = new JButton("1");
        b1.setFocusable(false);
        b2 = new JButton("2");
        b2.setFocusable(false);
        b3 = new JButton("3");
        b3.setFocusable(false);
        bPlus = new JButton("+");
        bPlus.setFocusable(false);

        b4 = new JButton("4");
        b4.setFocusable(false);
        b5 = new JButton("5");
        b5.setFocusable(false);
        b6 = new JButton("6");
        b6.setFocusable(false);
        bMinus = new JButton("-");
        bMinus.setFocusable(false);

        b7 = new JButton("7");
        b7.setFocusable(false);
        b8 = new JButton("8");
        b8.setFocusable(false);
        b9 = new JButton("9");
        b9.setFocusable(false);
        bMult = new JButton("*");
        bMult.setFocusable(false);

        bDec = new JButton(".");
        bDec.setFocusable(false);
        b0 = new JButton("0");
        b0.setFocusable(false);
        bEqual = new JButton("=");
        bEqual.setFocusable(false);
        bDiv = new JButton("/");
        bDiv.setFocusable(false);

        add(b1);add(b2);add(b3);add(bPlus);
        add(b4);add(b5);add(b6);add(bMinus);
        add(b7);add(b8);add(b9);add(bMult);
        add(bDec);add(b0);add(bEqual);add(bDiv);
    }
}
