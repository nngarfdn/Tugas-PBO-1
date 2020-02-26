//
public class MainTitik{ // buat class
	public static void main(String[] args){ //set main
		Titik t1 = new Titik();     // buat objek
		Titik t2 = new Titik(20,3); // buat object
		
		System.out.println(t1); //cek
		System.out.println(t2); //cek
		
		t1.naik();  // naik
		t2.kanan(); //kanan
		t1.njumbul(10); // njumbul
		
		System.out.println(t1); // cek
		System.out.println(t2); // cek
	}
}