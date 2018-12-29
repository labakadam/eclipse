
	//Program prima logièku vrijednost
	//u sluèaju istinitosti ispisuje Osijek
	//inaèe ispisuje sluèajni broj izmeðu 0 i 1
	package edunova;

	import javax.swing.JOptionPane;

	public class Zadatak155 {

		//Napiši program u Javi koji proèita jedan broj preko tipkovnice. 
		//Nakon toga program odredi da li je upisani broj paran
		//ili neparan. Ako je paran neka program ispiše taj broj uveæan za
		//10 puta. U sluèaju da je neparan neka program
		//ispiše taj broj 5 puta jedan pored drugoga
		public static void main(String[] args) {
			int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši jedan broj"));
			
			if(a==1 & a==a*2+1) {
				System.out.println(a + " " + a + " " + a + " " + a + " " + a);
			}else if(a==0 & a==a*2) {
				System.out.println(a*10);}
			
			}
		

	}

	

