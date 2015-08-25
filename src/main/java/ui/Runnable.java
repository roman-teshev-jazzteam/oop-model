package ui;


import javax.swing.*;
import java.awt.*;

public class Runnable {
    public static void main(String[] args) {
        JFrame spaceModelFrame = new JFrame("Space Model");
        spaceModelFrame.setSize(1000, 1000);
        spaceModelFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        spaceModelFrame.setResizable(false);
        spaceModelFrame.setLocationRelativeTo(null);
        spaceModelFrame.setLayout(new GridBagLayout());
        GraphicsPanel graphicsPanel = new GraphicsPanel();
        spaceModelFrame.add(graphicsPanel,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(2,2,2,2),0,0));
        spaceModelFrame.setVisible(true);

    }
}
