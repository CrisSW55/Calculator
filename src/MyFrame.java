import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MainPanel mainPanel;
    public MyFrame() {
        mainPanel = new MainPanel();
        setTitle("Calculator");
        setSize(new Dimension(500,700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        mainPanel.setLayout(new GridLayout(3,1));
        add(mainPanel);
    }
}
