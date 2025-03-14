package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;


public class Home extends Window {

    public Home() {
        this.title = "Home";
        setTitle(title);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top bar panel
        JPanel topBar = new JPanel();
        topBar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        topBar.setBackground(new Color(50, 50, 50));

        // Buttons
        JButton homeButton = createStyledButton("Home", e -> System.out.println("Home clicked"));
        JButton feedButton = createStyledButton("Feed", e -> openfeed());
        JButton profileButton = createStyledButton("Profile", e -> System.out.println("Profile clicked"));

        // Add buttons to the top bar
        topBar.add(homeButton);
        topBar.add(feedButton);
        topBar.add(profileButton);

        // Add components to frame
        add(topBar, BorderLayout.NORTH);
    }

    private JButton createStyledButton(String text, ActionListener action) {
        JButton button = new JButton(text);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 70, 70));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(80, 30));
        button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Mouse listener for hover and click effects
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(100, 100, 100)); // Hover color
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(70, 70, 70)); // Default color
            }

            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(new Color(50, 50, 50)); // Click color
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(new Color(100, 100, 100)); // Hover color after release
            }
        });

        button.addActionListener(action);
        return button;
    }

    public void openfeed(){
        new Feed();
    }
}
