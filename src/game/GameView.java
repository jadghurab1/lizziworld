package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.*;
import javax.swing.*;



public class GameView extends UserView {
    private Image background;

    public GameView(World world, int width, int height) {
        super(world, width, height);
        background = new ImageIcon("data/rec.png").getImage();

        // Add platforms
        // Image platformImage = new ImageIcon("rec.png").getImage();


    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }
}