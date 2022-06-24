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
            var initialText = "Olá meu nome é programa!"; //O que será utilizado como conteudo para o codigo
            var area = new JTextArea(initialText, 8, 50);

            var lowerCaseButton = new JButton("To Lower Case"); //Escrita no botao
            var upperCaseButton = new JButton("To Upper Case");
            lowerCaseButton.addActionListener(e -> area.setText(area.getText().toLowerCase())); //Botao para diminuir as letras (caixa baixa)
            upperCaseButton.addActionListener(e -> area.setText(area.getText().toUpperCase())); //Botao para aumentar as letras (caixa alta)

            var buttonPanel = new JPanel();
            buttonPanel.add(lowerCaseButton); //Adicionando os Botoes
            buttonPanel.add(upperCaseButton);
                        //Parte Grafica
            var frame = new JFrame("Capitalizer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
            frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);
        }); //Código com interface gráfica simples com botões, necessita de polimento, baseado no código do Imu.edu
    }
}
