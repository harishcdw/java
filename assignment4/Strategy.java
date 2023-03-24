package assignment4;

public class Strategy {

	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new RedPaintt();
		System.out.println(brush.getPaint());
	}
}
class PaintBrush{
	Paintt paint;
	public Paintt getPaint() {
		return paint;
	}
}
abstract class Paintt{
	abstract void color();
}
class RedPaintt extends Paintt{
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaintt extends Paintt{
	public void color() {
		System.out.println("blue colour...");
	}
}