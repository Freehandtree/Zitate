package Window;
import java.awt.*;
import javax.swing.*;

public class Feed extends Window {
    public Feed() {
        title = "Feed";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        // Adding multiple boxes to scroll
        for (int i = 1; i <= 20; i++) {
            JPanel box = new JPanel();
            box.setPreferredSize(new Dimension(350, 80));
            box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            box.setBackground(new Color(200, 200, 255));
            box.add(new JLabel("Post " + i));
            contentPanel.add(box);
        }

        // Wrapping content panel in a scroll pane
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
    }
}
