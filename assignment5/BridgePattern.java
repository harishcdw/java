package assignment5;

public class BridgePattern {

	public static void main(String[] args) {
		
		WebPage small = new SmallFont();

		WebPage large = new LargeFont();
		
		Theme light = new LightTheme(small);
		light.displayTheme("light Theme : ","small font in web page");
		

	}

}


interface WebPage{
	public void display(String title,String content);
}

class SmallFont implements WebPage{
	public void display(String Title,String Content) {
		System.out.println("Small Font-- "+Title+Content);
	}
}

class LargeFont implements WebPage{
	public void display(String Title,String Content) {
		System.out.println("Large Font-- "+Title+Content);
	}
}


interface Theme{
	void displayTheme(String title,String content);
}
class LightTheme implements Theme{
	private WebPage wp;
	public LightTheme(WebPage wp) {
		this.wp=wp;
	}
	public void displayTheme(String title,String content) {
		wp.display(title, content);
	}
}

class DarkTheme implements Theme{
	private WebPage wp;
	public DarkTheme(WebPage wp) {
		this.wp=wp;
	}
	public void displayTheme(String title,String content) {
		wp.display(title, content);
	}
}

