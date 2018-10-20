import javax.swing.*;


public class Main {
    public static void main(String[] args) {



        JFrame formula1 = new JFrame("JAVA F1");
        formula1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formula1.setSize(1100, 600);
        formula1.add(new Road());
        formula1.setVisible(true);

    }
}
