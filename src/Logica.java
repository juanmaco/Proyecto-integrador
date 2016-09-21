import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	public PApplet app = Main.app;
	public PImage base;
	public PImage imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10;
	public PImage imagen11, imagen12, imagen13, imagen14, imagen15, imagen16, imagen17, imagen18, imagen19, imagen20;
	private int contadorPantallas = 0;
	// Un string para el tipo de archivo

	public Logica(PApplet app) {
		cargarImagenes();
		pantallas();
		posicionMouse();

	}

private void cargarImagenes(){
	base=app.loadImage("../data/Base-Imagen.png");
	imagen1=app.loadImage("../data/1..jpg");
	imagen2=app.loadImage("../data/2.jpg");
	imagen3=app.loadImage("../data/3.jpg");
	imagen4=app.loadImage("../data/4.jpg");
	imagen5=app.loadImage("../data/5.jpg");
	imagen6=app.loadImage("../data/6.jpg");
	imagen7=app.loadImage("../data/7.jpg");
	imagen8=app.loadImage("../data/8.jpg");
	imagen9=app.loadImage("../data/9.jpg");
	imagen10=app.loadImage("../data/10.jpg");
}

	private void pantallas() {
		switch (contadorPantallas) {
		case 0:
			app.image(base, 0, 0);
			break;
		}
	}

	private void posicionMouse() {
		if (app.mousePressed == true) {
			if (app.mouseX > 0 && app.mouseX < 1200 && app.mouseY > 0 && app.mouseY < 700) {
System.out.println(app.mouseX);
System.out.println(app.mouseY);
			}
		}

	}

	private void cargarLista() {

	}

	private void organizarImagenes() {

	}

	private void comprobarArchivo() {
	}

	private void zoomIn() {

	}

	private void zoomOut() {

	}

	private void cambioDeImagenes() {

	}

	private void rotacion() {

	}
}
