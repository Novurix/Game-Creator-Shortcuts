package GModules.Assets;

import javax.swing.JPanel;
import java.awt.Color;

public class Player extends JPanel {


    private static final long serialVersionUID = -1737245615349046733L;
    
    public int dirX;
    public int dirY;

    int speed;

    public Player(int width, int height, int x, int y, int velocity, Color bgColor) {
        setBounds(x, y, width, height);
        setBackground(bgColor);
        
        speed = velocity;
    }

    public void update() {
        setBounds(getX()+(dirX*speed), getY()+(dirY*speed), this.getWidth(), this.getHeight());
    }
}