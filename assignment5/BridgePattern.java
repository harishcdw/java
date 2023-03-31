package assignment5;

public class BridgePattern {

	public static void main(String[] args) {
		
		WebPage small = new SmallFont();

		WebPage large = new LargeFont();
		
		Theme light = new LightTheme(small);
		light.displayTheme("light Theme : ","small font in web page");

	}
}

/**
 * bridge pattern -  Split the large class into abstraction and its implementation.
 * using bridge pattern we can modify the abstraction or its implementation independently.
 */
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
	private WebPage webPageObj;
	public LightTheme(WebPage webPageObj) {
		this.webPageObj=webPageObj;
	}
	public void displayTheme(String title,String content) {
		webPageObj.display(title, content);
	}
}

class DarkTheme implements Theme{
	private WebPage webPageObj;
	public DarkTheme(WebPage webPageObj) {
		this.webPageObj=webPageObj;
	}
	public void displayTheme(String title,String content) {
		webPageObj.display(title, content);
	}
}

