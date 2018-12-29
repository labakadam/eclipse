package edunova;

import javax.swing.JOptionPane;

public class Zadatak13 {
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redova"));
		
		for(int i=b;i>0;i=i-1) {
			System.out.println(i+" ");
		}//for(int j=a;j>b;j=j+1) {
		    //System.out.print(j+" ");
		
		
		//}
	}

}//int =Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redaka"));
//int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca"));
