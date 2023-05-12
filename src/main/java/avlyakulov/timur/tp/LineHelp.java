package avlyakulov.timur.tp;

import javax.swing.*;
import java.awt.*;

public class LineHelp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                JPanel panel = new JPanel(null) {
                    @Override
                    public void paint(Graphics g) {
                        super.paint(g);
                        g.drawLine(50, 50, 100, 20); // x2 - длина отрезка никак не влияет на угол, y2 - угол отрезка
                    }
                };
                frame.add(panel);
                frame.setSize(400, 400);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}