//import javafx.scene.input.KeyEvent;

import java.awt.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Player {

    public static final int MAX_SPEED = 50;
    public static final int MAX_TOP_SCREEN = 10;
    public static final int MAX_BOTTOM_SCREEN = 560;

    Image ferret = new ImageIcon("C:\\Users\\Duster\\IdeaProjects\\F1\\irvin1.gif").getImage();
    int player_car_speed = 0;
    int getPlayer_car_acceleration = 0;
    int full_distance = 0;

    /**
     * koordinate car
     */
    int x = 100;
    int y = 30;
    int dy = 0;


    int img_layer1 = 0;
    int img_layer2 = 1200;


    public void move() {
        full_distance += player_car_speed;
        player_car_speed += getPlayer_car_acceleration;
//        if (player_car_speed <= 0) {
//            player_car_speed = 0;
//        }
//        if (player_car_speed >= MAX_SPEED) {
//            player_car_speed = MAX_SPEED;
//        }
        y -= dy;

//        if (y >= MAX_BOTTOM_SCREEN) {
//            y = MAX_BOTTOM_SCREEN;
//        }
//        if (y <= MAX_TOP_SCREEN) {
//            y = MAX_TOP_SCREEN;
//        }
        if (img_layer2 - player_car_speed <= 0) {
            img_layer2 = 1200;
            img_layer1 = 0;
        } else {
            img_layer1 -= player_car_speed;
            img_layer2 -= player_car_speed;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            getPlayer_car_acceleration = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
            getPlayer_car_acceleration = -1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 5;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -5;
        }


    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            getPlayer_car_acceleration = 0;
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_UP) {
            dy = 0;
        }
    }

}
