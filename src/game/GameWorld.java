package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
private Lizzie lizzie;


    public GameWorld(){

        //make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make two platforms
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, 5.5f));
        platform1.setAngleDegrees(-45);

        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(8, 5.5f));


        //make the walls
        Shape wallShape = new BoxShape(0.5f,8);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-11.5f,-4));

        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(11.5f,-4));

        Lizzie lizzie = new Lizzie(this);
        lizzie.setPosition(new Vec2(7,-6));

        //drop a ball on lizzie's head
        Shape ballShape = new CircleShape(1f);
        DynamicBody ball = new DynamicBody(this, ballShape);
        ball.setPosition(new Vec2(7, 1f));


        //create a shape for the head (use PolygonEditor)
      //  PolygonShape headShape = new PolygonShape( /*coords from PolygonEditor*/);
        //create a shape for the handle (use PolygonEditor)
       // PolygonShape handleShape = new PolygonShape( /*coords from PolygonEditor*/ );
        //create the actual body and add it to the World
       // DynamicBody hammer = new DynamicBody(this); //create the hammer (no shape yet) and add it to world
        //create fixtures for head and handle and add them to
        //the hammer Body
       // SolidFixture head = new SolidFixture(hammer, headShape); //create the head fixture and add it to hammer
       // head.setDensity(20);
       // SolidFixture handle = new SolidFixture(hammer, handleShape); //create handle fixture and add it to hammer
        //attach the image
       // hammer.addImage(new BodyImage("data/hammer.png",4));
        //set the hammer's position
       // hammer.setPosition(new Vec2(0,5));


        //try this to see the effect of changing the
        //density of the hammer head
        //hammer.setAngularVelocity(10f);




    }
}
