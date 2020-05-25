import java.awt.Color;

import GModules.Window.*;
import GModules.Assets.*;

public class Game {

    // EXAMPLE SCRIPT //
    
    static Window window;
    static Renderer renderer;

    static int WIDTH = 1000, HEIGHT = 720;
    static int VELOCITY = 3;

    public static void main(String[] args) {

        window = new Window(WIDTH,HEIGHT,"Title Here",false);
        renderer = new Renderer(Color.BLACK,WIDTH,HEIGHT,10);

        int PLAYER_SCALE_X = 20;
        int PLAYER_SCALE_Y = 20;

        int X = WIDTH/2-PLAYER_SCALE_X/2;
        int Y = HEIGHT/2-PLAYER_SCALE_Y/2;

        renderer.addPlayer(new Player(PLAYER_SCALE_X,PLAYER_SCALE_Y,X,Y,VELOCITY,Color.BLUE));

        window.addRenderer(renderer);
        window.init();
    }
}