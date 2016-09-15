import processing.core.PApplet;

public class Main extends PApplet {
public static Logica log;
public static PApplet app;

public void setup(){
	app=this;
	size(1200,700);
	log= new Logica(this);
}
public void Draw(){
	background(255);
}
}
