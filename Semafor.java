
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lacal
 */
public class Semafor extends JComponent {

    public int j = 0;

    public Semafor() {
        setBounds(getX(), getY(), 300, 300);
    }

    @Override
    public void paintComponent(Graphics g) {   
        super.paintComponent(g);
        vykresli(g);
    }

    public void farby() {       
        j++;
        if (j > 4) {
            j = 1;
        }
        repaint();

    }

    public void vykresli(Graphics g) {     // vykreslenie
        // telo
        g.setColor(Color.DARK_GRAY);       
        g.fillRect(100, 100, 100, 200);
        g.setColor(Color.GRAY);        

        if (j == 1 || j == 2) {          // svieti červena
            g.setColor(Color.red);
            if (j == 1) {
                System.err.println("Červená");
            }
        }
        g.fillOval(130, 120 + 0 * 50, 40, 40);
        g.setColor(Color.GRAY);

        if (j == 2 || j == 4) {              // svieti žlta
            g.setColor(Color.YELLOW);
            System.err.println("Žltá");
        }
        g.fillOval(130, 120 + 1 * 50, 40, 40);
        g.setColor(Color.GRAY);

        if (j == 3) {                       // svieti zelena
            g.setColor(Color.green);
            System.err.println("Zelená");
        }
        g.fillOval(130, 120 + 2 * 50, 40, 40);
        g.setColor(Color.GRAY);

    }
}
