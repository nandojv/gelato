package corsoiniziodacapo;

import java.util.Scanner;

public class componigelato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int scegliGusto=0;	// non si imapggina

		String gusto1="nocciola";
		String gusto2="cioccolato";
		String gusto3="caffe";
		String gusto4="panna";
		
		String contenitore1="cialda";
		String contenitore2="cono";
		String contenitore3="brioche";
		
		
		do {
			Scanner g = new Scanner(System.in); 
			

			System.out.print("scegli il condimento:1 nocciola,2 cioccolato,3 caffe,4 panna"); 

			 scegliGusto = g.nextInt(); 
			 
			 Scanner g1 = new Scanner(System.in); 
				

				System.out.print("scegli la pasta: 1 cialda ,2 cono,3 brioche"); 

				 int sceglicontenitore = g1.nextInt();

				 
				 if(sceglicontenitore==0);{
					 
					 
					 if (scegliGusto==1) {
					 System.out.print(gusto1 +"  "+contenitore1);
					 }
					 else if(scegliGusto==2) {
						 System.out.print(gusto2+"  "+contenitore1);
					 }
					 else if(scegliGusto==3) {
						 System.out.print(gusto3+"  "+contenitore1);
						 
					 }
					 
					 else if(scegliGusto==4) {
						 
						 System.out.print(gusto4+"  "+contenitore1);
					 }
				
                       else if(scegliGusto==4) {
						 
						 System.out.print(gusto1+"  "+contenitore1);
				 
				 }
				 
				 
				 }
				 
		}
					 while(scegliGusto !=1);

				 
	
}}
				 
				 
		
				 
				 
				 
					 
					 
					 
				 