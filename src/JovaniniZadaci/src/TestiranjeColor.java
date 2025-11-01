
public class TestiranjeColor {

	public static void main(String[] args) {
		Color color=new Color(20,30,50);
		color.printColor();
		
		color.addBlue(100);
		color.printColor();
		//da vidimo hoce li ispisati da sam presla granicu
		color.addBlue(900);
		color.printColor();

	}

}
