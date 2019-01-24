package edunova;

public class Zadatak1 {
	
	//Napisati metodu tipa niz cijelih brojeva koja prima jedan parametar tipa int
	//metoda vraæa niz s onoliko sluæajnih parnih brojeva izmeðu 25 i 100
	//Metodu pozvati 3 puta s tri sluæajne vrijednosti izmeðu 10 i 20 
	//ispisati zbroj svih generiranih brojeva
	
	public static void main(String[] args) {
		int Max=10, Min=5;
		int broj = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println(broj);
	}

}
