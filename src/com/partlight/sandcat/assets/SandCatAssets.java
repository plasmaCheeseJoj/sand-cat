package com.partlight.sandcat.assets;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;

public abstract class SandCatAssets {
	public static Texture tPixel;

	public static void create() {
		if (SandCatAssets.tPixel != null)
			throw new IllegalStateException("Pixel texture region already created!");

		final Pixmap pixel = new Pixmap(1, 1, Format.RGB565);
		pixel.setColor(Color.WHITE);
		pixel.fill();
		SandCatAssets.tPixel = new Texture(pixel);

		pixel.dispose();
	}

	public static void dispose() {
		SandCatAssets.tPixel.dispose();
	}
}
