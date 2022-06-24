import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Estudo5 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var initialText = "¿Hablas español o inglés o ambos?";
            var area = new JTextArea(initialText, 8, 50);

            var lowerCaseButton = new JButton("To Lower Case");
            var upperCaseButton = new JButton("To Upper Case");
            lowerCaseButton.addActionListener(e -> area.setText(area.getText().toLowerCase()));
            upperCaseButton.addActionListener(e -> area.setText(area.getText().toUpperCase()));

            var buttonPanel = new JPanel();
            buttonPanel.add(lowerCaseButton);
            buttonPanel.add(upperCaseButton);

            var frame = new JFrame("Capitalizer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
            frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);
        });
    }
}