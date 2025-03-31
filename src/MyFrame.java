import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    TextField textField;
    NumPadPanel numPadPanel;
    JButton bNeg;
    JButton bDel;
    JButton bClear;

    public MyFrame() {
        setTitle("Calculator");
        setSize(new Dimension(500,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textField = new TextField();
        textField.setFont(new Font("Ink Free",Font.BOLD,30));
        textField.setFocusable(false);
        textField.setEditable(false);
        textField.setBounds(100,50,300,50);

        numPadPanel = new NumPadPanel(this);

        bNeg = new JButton("(-)");
        bNeg.setFocusable(false);
        bNeg.addActionListener(this);
        bDel = new JButton("Delete");
        bDel.setFocusable(false);
        bDel.addActionListener(this);
        bClear = new JButton("Clear");
        bClear.setFocusable(false);
        bClear.addActionListener(this);

        bNeg.setBounds(100,500,100,50);
        bDel.setBounds(200,500,100,50);
        bClear.setBounds(300,500,100,50);

        add(textField);
        add(numPadPanel);
        add(bNeg);
        add(bDel);
        add(bClear);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
