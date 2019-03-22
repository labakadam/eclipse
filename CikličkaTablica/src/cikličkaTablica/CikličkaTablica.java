package ciklièkaTablica;

import javax.swing.JOptionPane;

public class CiklièkaTablica {
	
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redova"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca"));
		
		
		int[][] tablica= new int [a][b];
		
		int minimumStupaca = 0;
		int maximumStupaca = b-1;
		int minimumRedaka = 0;
		int maximumRedaka = a-1;
	    int pocetak=1;    
		
	    while(pocetak<=(a*b)){
			for (int i = maximumStupaca; i >= minimumStupaca; i--){
				tablica[maximumRedaka][i] = pocetak++;
				}
			if(pocetak>(a*b)) {
				break;
			}
			for (int i = maximumRedaka-1; i >= minimumRedaka; i--) {
				tablica[i][minimumStupaca] = pocetak++;
				}
			if(pocetak>(a*b)) {
				break;
			}
			for (int i = minimumStupaca+1; i <= maximumStupaca; i++){
				tablica[minimumRedaka][i] = pocetak++;
				}
			if(pocetak>(a*b)) {
				break;
			}
			for (int i = minimumRedaka+1; i <= maximumRedaka-1; i++){
				tablica[i][maximumStupaca] = pocetak++;
				}
			if(pocetak>(a*b)) {
				break;
			}
			
			minimumStupaca++;
			minimumRedaka++;
			maximumStupaca--;
			maximumRedaka--;
		        }
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(tablica[i][j]+ "	");
				
			}
		System.out.println();
		}
		
	}
}
	
