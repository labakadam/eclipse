package edunova;

import javax.swing.JOptionPane;

public class Zadatak13 {

	//Napiši program u Javi koji proèita jedan broj preko tipkovnice. 
	//Nakon toga program odredi da li je upisani broj paran
	//ili neparan. Ako je paran neka program ispiše taj broj uveæan za
	//10 puta. U sluèaju da je neparan neka program
	//ispiše taj broj 5 puta jedan pored drugoga
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši neki broj"));
		
		if(a%2==0) {
			System.out.println(a*10);
		 }else if(a%2!=0) {
			 System.out.println(a+" "+a+" "+a+" "+a+" "+a);
		 }
		
		}

}
