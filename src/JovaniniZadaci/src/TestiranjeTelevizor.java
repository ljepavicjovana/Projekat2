
public class TestiranjeTelevizor {

	public static void main(String[] args) {
		
		//Pozivam konstruktor
		Televizor tv = new Televizor(3, "RTCG", 5);
		
		tv.Ispisi();
		tv.pojacajTon();
		
		tv.setJacinaTona(12); //ovdje mi se nista ne ispisuje jer nije dovoljeno 12 da bude jacina tona sto se moze vidjeti u uslovu

	}

}
