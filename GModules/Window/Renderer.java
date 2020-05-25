package GModules.Window;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GModules.Assets.*;

public class Renderer extends JPanel implements KeyListener {

    private static final long serialVersionUID = -58972760135843537L;

    Player player;

    public Renderer(Color bgColor, int width, int height, int milliUpdateDelay) {

        setBounds(0, 0, width, height);
        setLayout(null);
        setBackground(bgColor);
        setFocusable(true);
        addKeyListener(this);

        add(new Updater(milliUpdateDelay, this));
    }

    public void addPlayer(Player player) {
        this.player = player;
        add(player);
    }

    @Override
    public void keyTyped(KeyEvent key) {}

    @Override
    public void keyPressed(KeyEvent key) {
        if (key.getKeyCode() == KeyEvent.VK_W) {
            if (player != null) {
                player.dirY = -1;
            }
        }
        else if (key.getKeyCode() == KeyEvent.VK_S) {
            if (player != null) {
                player.dirY = 1;
            }
        }

        if (key.getKeyCode() == KeyEvent.VK_A) {
            if (player != null) {
                player.dirX = -1;
            }
        }

        else if (key.getKeyCode() == KeyEvent.VK_D) {
            if (player != null) {
                player.dirX = 1;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent key) {

        if (key.getKeyCode() == KeyEvent.VK_W) {
            if (player != null) {
                player.dirY = 0;
            }
        }
        else if (key.getKeyCode() == KeyEvent.VK_S) {
            if (player != null) {
                player.dirY = 0;
            }
        }

        if (key.getKeyCode() == KeyEvent.VK_A) {
            if (player != null) {
                player.dirX = 0;
            }
        }

        else if (key.getKeyCode() == KeyEvent.VK_D) {
            if (player != null) {
                player.dirX = 0;
            }
        }
    }
}