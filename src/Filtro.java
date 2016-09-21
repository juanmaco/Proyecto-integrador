import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Filtro {

	// Archivo que representa la carpeta donde se usara el FileChooser
	static final File dir = new File("../data");
	// Se crea una lista que contendra las imagenes
	static final String[] EXTENSIONS = new String[] { "png", "jpg" };
	// filtro para identificar la extension de las imagenes
	static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

		public boolean accept(final File dir, final String name) {
			for (final String ext : EXTENSIONS) {
				if (name.endsWith("." + ext)) {
					return (true);
				}
			}
			return (false);
		}

	};

	public static void main(String[] args) {
		if (dir.isDirectory()) {
			for (final File f : dir.listFiles(IMAGE_FILTER)) {
				BufferedImage img = null;
				try {
					img = ImageIO.read(f);
				} catch (final IOException e) {

				}
			}
		}
	}
}