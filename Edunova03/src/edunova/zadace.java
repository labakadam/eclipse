package edunova;

import java.util.Arrays;

import javax.swing.SortOrder;

import javax.swing.JOptionPane;

public class zadace {
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("broj"));
		int niz[] = {1,2,3,4,5};
		
		for(int i=a;i<=(a*b);i++) {
			System.out.print(i+" " + " "+i);
		}
	}
}
