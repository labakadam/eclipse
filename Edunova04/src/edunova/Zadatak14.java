
	//Program prima logi�ku vrijednost
	//u slu�aju istinitosti ispisuje Osijek
	//ina�e ispisuje slu�ajni broj izme�u 0 i 1
	package edunova;

	import javax.swing.JOptionPane;

	public class Zadatak155 {

		//Napi�i program u Javi koji pro�ita jedan broj preko tipkovnice. 
		//Nakon toga program odredi da li je upisani broj paran
		//ili neparan. Ako je paran neka program ispi�e taj broj uve�an za
		//10 puta. U slu�aju da je neparan neka program
		//ispi�e taj broj 5 puta jedan pored drugoga
		public static void main(String[] args) {
			int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i jedan broj"));
			
			if(a==1 & a==a*2+1) {
				System.out.println(a + " " + a + " " + a + " " + a + " " + a);
			}else if(a==0 & a==a*2) {
				System.out.println(a*10);}
			
			}
		

	}

	

