package edunova;

import javax.swing.JOptionPane;

public class vjezba {

	public static void main(String[] args) {
		//Program ucitava 4 broja.
		//u slucaju da je prvi jednak zadnjem broju ispisuje
		//zbroj drugog i treceg broja
		//inace ispisuje sljedno brojeve od najmanjeg prema najvecem
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int z=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæi broj"));
	    int k=Integer.parseInt(JOptionPane.showInputDialog("Upiši èetvrti broj"));
	    
	    int r=j+z;
	    
	    if(i==k) {
	    	System.out.println(r);
	    }//6 kombinacija sa i
	    if(i<j && j<z && z<k) {
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(k);
	    }if(i<z && z<k && k<j) {
	    	System.out.println(i);
	    	System.out.println(z);
	    	System.out.println(k);
	    	System.out.println(j);
	    }if(i<j && j<k && k<z) {
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(z);
	    }if(i<k && k<z && z<j) {
	    	System.out.println(i);
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(j);
	    }if(i<k && k<j && j<z) {
	    	System.out.println(i);
	    	System.out.println(k);
	    	System.out.println(j);
	    	System.out.println(z);
	    }if(i<z && z<j && j<k) {
	    	System.out.println(i);
	    	System.out.println(z);
	    	System.out.println(j);
	    	System.out.println(k);
	    }//6 kombinacija sa j
	    if(j<k && k<z && z<i) {
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(i);
	    }if(j<z && z<k && k<i) {
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(k);
	    	System.out.println(i);
	    }if(j<z && z<i && i<k) {
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(i);
	    	System.out.println(k);
	    }if(j<k && k<i && i<z) {
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(z);
	    }if(j<i && i<k && k<z) {
	    	System.out.println(j);
	    	System.out.println(i);
	    	System.out.println(k);
	    	System.out.println(z);
	    }if(j<i && i<z && z<k) {
	    	System.out.println(j);
	    	System.out.println(i);
	    	System.out.println(z);
	    	System.out.println(k);
	    }//6 kombinacija sa z
	    if(z<k && k<i && i<j) {
	    	System.out.println(z);
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(j);
	    }if(z<k && k<j && j<i) {
	    	System.out.println(z);
	    	System.out.println(k);
	    	System.out.println(j);
	    	System.out.println(i);
	    }if(z<i && i<k && k<j) {
	    	System.out.println(z);
	    	System.out.println(i);
	    	System.out.println(k);
	    	System.out.println(j);
	    }if(z<i && i<j && j<k) {
	    	System.out.println(z);
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(k);
	    }if(z<j && j<k && k<i) {
	    	System.out.println(z);
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(i);
	    }if(z<j && j<i && i<k) {
	    	System.out.println(z);
	    	System.out.println(j);
	    	System.out.println(i);
	    	System.out.println(k);
	    }//6 kombinacija sa k
	    if(k<i && i<j && j<z) {
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(z);
	    }if(k<i && i<z && z<j) {
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(z);
	    	System.out.println(j);
	    }if(k<z && z<i && i<j) {
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(i);
	    	System.out.println(j);
	    }if(k<z && z<j && j<i) {
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(j);
	    	System.out.println(i);
	    }if(k<j && j<z && z<i) {
	    	System.out.println(k);
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(i);
	    }if(k<j && j<i && i<z) {
	    	System.out.println(k);
	    	System.out.println(j);
	    	System.out.println(i);
	    	System.out.println(z);
	    }//1111-0000
	    /*else if(i==j && j==z && z==k) {
	    	System.out.println(r);
	    }*/
	    //0001
	    else if(i==j && j==z && z<k) {
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(k);
	    }//0010
	    else if(i==j && j==k && k<z) {
	    	System.out.println(r);
	    }//0011
	    else if(i==j && j<z && z==k) {
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(z);
	    }//0100
	    else if(i==z && z==k && k<j) {
	    	System.out.println(r);
	    }//0101
	    else if(j==k && i==z && i<j) {
	    	System.out.println(i);
	    	System.out.println(z);
	    	System.out.println(j);
	    	System.out.println(k);
	    }//0111
	    else if(i<j && j==z && z==k) {
	    	System.out.println(i);
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(j);
	    }//1000
	    else if(j==z && z==k && k<i) {
	    	System.out.println(j);
	    	System.out.println(z);
	    	System.out.println(k);
	    	System.out.println(i);
	    }//1001
	    else if(i==k && j==z && z<i) {
	    	System.out.println(r);
	    }//1011
	    else if(i==z && z==k && j<i) {
	    	System.out.println(r);
	    }//1101
	    else if(i==j && j==k && z<k) {
	    	System.out.println(r);
	    }//0010
	    else if(i==j && j==k && j<z) {
	    	System.out.println(r);
	    }//1110
	    else if(i==j && j==z && k<z) {
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(j);
	    	System.out.println(z);
	    }//1010
	    else if(i==z && j==k && j<i) {
	    	System.out.println(j);
	    	System.out.println(k);
	    	System.out.println(i);
	    	System.out.println(z);
	    }//1100
	    else if(i==j && k==z && z<i) {
	    	System.out.println(k);
	    	System.out.println(z);
	    	System.out.println(i);
	    	System.out.println(j);
	    }
	    
	    
	    
	    
	    
	    
	    

			
	}

}
