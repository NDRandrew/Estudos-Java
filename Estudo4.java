import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Estudo4 extends JPanel {
    private static final long serialVersionUID = -3630443364990545965L;

    private List<List<Point>> curves = new ArrayList<>();

    public Estudo4() {
        // Register event listeners on construction of the panel.
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                var newCurve = new ArrayList<Point>();
                newCurve.add(new Point(e.getX(), e.getY()));
                curves.add(newCurve);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {   
            public void mouseDragged(MouseEvent e) {
                curves.get(curves.size() - 1).add(new Point(e.getX(), e.getY()));
                repaint(0, 0, getWidth(), getHeight());
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (var curve: curves) {
            var previousPoint = curve.get(0);
            for (var point: curve) {
                g.drawLine(previousPoint.x, previousPoint.y, point.x, point.y);
                previousPoint = point;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var frame = new JFrame("Paint Fake");
            frame.getContentPane().add(new Estudo4(), BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 1000);
            frame.setVisible(true);
        });
    }
}