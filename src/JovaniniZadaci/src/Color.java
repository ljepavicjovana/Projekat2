/*Kreirati klasu Color koja ima tri privatna atributa: red, green i blue (vrijednosti
0–255). Napraviti konstruktor koji postavlja početne vrijednosti svih atributa.
a. Napraviti getere i setere za sve atribute. U seterima treba provjeriti da li je
vrijednost između 0 i 255. Ako nije, ispisati poruku i ne mijenjati vrijednost.
b. Napraviti metode addRed(int change), addGreen(int change) i addBlue(int
change) koje mijenjaju vrijednost odgovarajuće boje za zadatu količinu
(pozitivnu ili negativnu). Ako promjena izađe van [0,255], ispisati poruku i
postaviti vrijednost na granicu (0 ili 255).
c. Napraviti metodu printColor() koja ispisuje vrijednosti svih boja u obliku: "red:
X, green: Y, blue: Z".*/
public class Color {
	private int red;
	private int green;
	private int blue;
	
	public Color(int red, int green, int blue) {
		this.red=red;
		this.green=green;
		this.blue=blue;
		
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public void setRed(int red) {
		if(red >=0 && red <= 255){
			 this.red=red;
			System.out.println("Unijeli ste odgovarajucu vrijednost. ");
			
		}else {
			System.out.println("Nije dozvoljena vrijednost");
		}
			
		}
		
	

	public void setGreen(int green) {
		if(green >= 0 && green <=255){
			 this.green = green;
			System.out.println("Unijeli ste odgovarajucu vrijednost za green. ");
		}else {
			System.out.println("Nije dozvoljena vrijednost");
		}
		
	}

	public void setBlue(int blue) {
		if(blue >=0 && blue <= 255) {
			this.blue = blue;
			System.out.println("Unijeli ste odgovarajucu vrijednost za blue");
		}else {
			System.out.println("Nije dozvoljena vrijednost");
		}
		
	}
	public void addRed(int change) {
		red +=change;
		if(red>255) {
			red=255;//zato sto pise postaviti vrijednost
			System.out.println("Presli ste granicu koja je do  255."); //trazi se da se ispise poruka da je predjena granica
		}else if(red<0) {
			red=0;
			System.out.println("Presli ste granicu ispod nule, a dozvoljeno je od nule.");
		}
		
	}
	public void addGreen(int change) {
		green +=change;
		if(green > 255) {
			green = 255;
			System.out.println("Presli ste granicu iznad 255");
		}else if(green < 0) {
			green=0;
			System.out.println("Presli ste ispod granice ,odnosno ispod nule, a to nije dozvoljeno.");
		}
	}
	public void addBlue(int change) {
		blue+=change;
		if(blue > 255) {
			blue=255;
			System.out.println("Presli ste granicu iznad 255.");
		}else if(blue<0) {
			blue=0;
			System.out.println("Presli ste ispod granice ,odnosno ispod nule, a to nije dozvoljeno.");
		}
	}
	public void printColor() {
	    System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
	}


}
