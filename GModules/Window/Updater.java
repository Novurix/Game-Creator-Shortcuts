package GModules.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Updater extends JPanel implements ActionListener {

    private static final long serialVersionUID = -347186339883854163L;
    
    Timer timer;
    Renderer renderer;

    public Updater(int timeInMilliseconds, Renderer renderer) {
        setFocusable(true);
        this.renderer = renderer;
        timer = new Timer(timeInMilliseconds,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("updating");
        if (renderer.player != null) {
            renderer.player.update();
        }
    }
}