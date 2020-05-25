package GModules.Window;

import javax.swing.JFrame;

public class Window extends JFrame {

    private static final long serialVersionUID = -4580072184759249573L;

    public Window(int width, int height, String title, boolean Resizable) {
        setSize(width,height);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(Resizable);
    }

    public Window(int width, int height, String title) {
        setSize(width,height);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void init() {
        setVisible(true);
    }

    public void addRenderer(Renderer renderer) {
        add(renderer);
    }
}