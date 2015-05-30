package com.tutorial.asteroids;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/*
 * Left off at https://www.youtube.com/watch?v=RIa6CxsYr3w
 * https://youtu.be/kTojxgA53x4?t=1047
 * https://youtu.be/mUZp1xPOdKc?t=114
 */
public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Asteroids";
		cfg.useGL20 = false;
		cfg.width = 500;
		cfg.height = 400;
		cfg.resizable = false;
		
		new LwjglApplication(new Asteroids(), cfg);
	}
}
