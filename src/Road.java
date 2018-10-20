//import javafx.scene.input.KeyEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class Road extends JPanel implements ActionListener {

    public Road() {
        mainTimer.start();
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
    }

    Timer mainTimer = new Timer(20, this);

    Image road = new ImageIcon("C:\\Users\\Duster\\IdeaProjects\\F1\\kiss.jpg").getImage();

    Player player = new Player();
    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.drawImage(road, player.img_layer1, 0, null);
        g.drawImage(road, player.img_layer2, 0, null);
        g.drawImage(player.ferret, player.x, player.y, null);
    }

    private class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }

}
