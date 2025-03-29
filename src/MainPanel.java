import org.w3c.dom.events.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    JTextField displayTextField;
    NumPadPanel numPadPanel;
    JPanel lastPanel;
    JButton bDel,bEnt;

    public MainPanel() {
        setPreferredSize(new Dimension(200,400));
        setBackground(Color.LIGHT_GRAY);
        displayTextField = new JTextField("Displays inputs here!");
        displayTextField.getCaret().setBlinkRate(0);
        displayTextField.getCaret().setVisible(false);
        displayTextField.setFont(new Font("Ink Free",Font.BOLD,30));
        displayTextField.setHorizontalAlignment(JTextField.RIGHT);
        displayTextField.setBackground(Color.LIGHT_GRAY);

        numPadPanel = new NumPadPanel();
        lastPanel = new JPanel(new GridLayout(1,2,0,5));
        bDel = new JButton("Delete");
        bEnt = new JButton("Enter");
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTextField.setText("");
            }
        });
        bEnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTextField.setText("");
            }
        });

        lastPanel.add(bDel);
        lastPanel.add(bEnt);
        add(displayTextField);
        add(numPadPanel);
        add(lastPanel);
    }
}
