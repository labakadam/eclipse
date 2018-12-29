package vjezbanje;

import java.awt.JobAttributes;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class bezveze {
	public static void main(String[] args) {
		//int niz[]= {Integer.parseInt(JOptionPane.showInputDialog("1broj"))};
		//int a=Integer.parseInt(JOptionPane.showInputDialog("broj stupaca"));
		//int b=Integer.parseInt(JOptionPane.showInputDialog("broj redaka"));
		int a=Integer.parseInt(JOptionPane.showInputDialog("1"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("2"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("3"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("4"));
		int e=Integer.parseInt(JOptionPane.showInputDialog("5"));
		int s=Integer.parseInt(JOptionPane.showInputDialog("upiši broj stupaca"));
		int r=Integer.parseInt(JOptionPane.showInputDialog("upiši broj redaka"));
		int[a][b] niz = new int[][];
		int[][] niz1 = new int[b][c];
		int[][] niz2 = new int[c][d];
		int[][] niz3 = new int[d][e];
		int[][] niz4 = new int[e][a];
		
		
		
		
		
		/*int[] niz1= new int[b];
		int[] niz2= new int[c];
		int[] niz3= new int[d];
		int[] niz4= new int[e];
		
		niz1[d]=b;
		niz2[a]=c;
		niz3[c]=d;
		niz4[b]=e;*/
		
		
		System.out.println(Arrays.toString());
		System.out.println(Arrays.toString(niz1));
		System.out.println(Arrays.toString(niz2));
		System.out.println(Arrays.toString(niz3));
		System.out.println(Arrays.toString(niz4));
		
		
		
		
		//for(int i=1;i<=5;i=i+1) {
			//System.out.println(i);
			//continue;
		//}for(int j=5;j>5;j=j+1)	
			//System.err.print(j);
		
			//System.err.println(b);
		
		}
}
    
	







