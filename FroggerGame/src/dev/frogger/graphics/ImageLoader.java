package dev.frogger.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public static BufferedImage loadImage(String path){
		try {
			//return the buffered image
			return ImageIO.read(ImageLoader.class.getResource("/"+path+".png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}	
}