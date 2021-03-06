package com.sepr.game.Tools;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.*;
import com.sepr.game.Screens.PlayScreen;
import com.sepr.game.Sprites.Dock;


public class BoxPhysics {

    public BoxPhysics(PlayScreen screen){
        World world = screen.getWorld();
        TiledMap map = screen.getMap();

        //Create body and fixture variables
        BodyDef bdef = new BodyDef();
        FixtureDef fdef = new FixtureDef();
        PolygonShape shape = new PolygonShape();
        Body body;

        //Set Docks as collidable

        for(MapObject object : map.getLayers().get(9).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();
            new Dock(screen, rect);
        }




    }
}
