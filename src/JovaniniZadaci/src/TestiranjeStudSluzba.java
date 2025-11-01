
public class TestiranjeStudSluzba {

	public static void main(String[] args) {
		StudSluzba s6= new StudSluzba("Monika", "Velimirovic", "24/119", 10,10,10);
		StudSluzba s1 = new StudSluzba("Monika", "Velimirovic", "24/119", 10,10,10);
        StudSluzba s2 = new StudSluzba("Matija", "Jaukovic", "24/018", 8,7,8);
        StudSluzba s3 = new StudSluzba("Lana", "Petrovic", "24/025", 9,10,9);
        StudSluzba s4 = new StudSluzba("Ivan", "Kostic", "24/042", 7,8,9);
        StudSluzba s5 = new StudSluzba("Maja", "Nikolic", "24/033", 10,10,10);
		
		
        s1.ispisi();
        s2.ispisi();
        s3.ispisi();
        s4.ispisi();
        s5.ispisi();
        s6.ispisi();
	}

}
