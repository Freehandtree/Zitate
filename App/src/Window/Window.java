package Window;

import javax.swing.*;
import java.awt.*;

public abstract class Window extends JFrame {
    public String title;
    public Window() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setVisible(true);
    }


}
