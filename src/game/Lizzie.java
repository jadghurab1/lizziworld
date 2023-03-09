package game;

import city.cs.engine.*;

public class Lizzie extends Walker {
    private static final Shape lizzieShape = new PolygonShape(
            -0.11f,2.08f,
            0.87f,1.68f,
            0.99f,0.49f,
            0.24f,-2.0f,
            -0.95f,-2.0f,
            -1.14f,1.41f);

    private static final BodyImage image =
            new BodyImage("data/lizzie.png", 6f);

//how much tea cups you can jammi3 coming from up
    private int credits = 0;

    public Lizzie(World world) {
        super(world, lizzieShape);
        addImage(image);
        credits = 0;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }
}
