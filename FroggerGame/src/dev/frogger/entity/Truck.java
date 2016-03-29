package dev.frogger.entity;

import java.awt.Graphics;
import java.util.Random;

import dev.frogger.Game;
import dev.frogger.graphics.Assets;

public class Truck extends Entity{
	
	private static Random r = new Random();
	private int truck;

	public Truck(Game game,int pos) {
		super(game,0,315+34*pos,Entity.truck_width,Entity.truck_height);
		if(y==417||y==451){
			speed = game.getDefaultSpeed();
			x=-Entity.truck_width;
			truck = r.nextInt(4)+4;
		}
		else{
			speed = -game.getDefaultSpeed();
			x=game.getWidht()+Entity.truck_width;
			truck = r.nextInt(4);
		}
	}

	@Override
	public void tick() {
		x+=speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.truck[truck],(int)x,(int)y,Entity.truck_width,Entity.truck_height,null);
	}
}