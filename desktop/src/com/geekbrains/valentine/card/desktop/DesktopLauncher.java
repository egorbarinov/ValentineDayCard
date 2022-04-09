package com.geekbrains.valentine.card.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.geekbrains.valentine.card.ValentineCardGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.height = 720;
		config.width = 1280;

		new LwjglApplication(new ValentineCardGame(), config);
	}
}
