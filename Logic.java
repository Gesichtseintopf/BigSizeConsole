package local.code;

/**

 * 
 * @author nachn
 *
 */

public class Logic {
	

	
	public Logic(){
		//System.out.println("Konstruktor Logik");
	}

	boolean verzweigungRun(String s)
	{
		boolean b = true;
		if(s == "0") b = false;
		
		return b;
	}
	
		
		void logiWindowIni()
		{
			String s ="HELLOWORLD";
			User bs = new User();
			Model mo = new Model();
			mo.setModel(bs.eingabe());

			
			//Gibt den Modell von Modelldaten seine Quantoren 
			int x = 0; //ANZAHL SYMBOLE
			int y = 0; //ANZAHL ZEILEN
			int z = 0; //ANZAHL STELLEN
			
			System.out.print("Mockup logiQuerMode()");
			System.out.print("\n");
			
//			Model mo = new Model();
//			////////QUANTIFIZIEREN DES MODELL
			
			System.out.print("QUANTIFIZIEREN DES MODELL");
			System.out.print("\n");
			for(int k = 0; k<mo.getModel().length; k++ )
			{	
				for(int l = 0; l<mo.getModel()[k].length; l++ )
				{
					
					for(int m = 0; m<mo.getModel()[k][l].length; m ++)
					{							
						z++;			
					}
					y++;					
				}

				x++;
			
			}
			
			System.out.print("x:" +x+ " y:" +y+ " z:" +z);
			System.out.print("\n");
			System.out.print("ERZEUGEN VOM STRING");
			System.out.print("\n");
			boolean[] wqFin = new boolean[z+y];
			
			int v = 0;//Stellenwertsumme vom ModellDatenübersetzung
			 
	
			
			System.out.print("üBERSETZEN VOM MODELL AUF STRING");
			System.out.print("\n");
			
			/*
			 * Spezialschleife : Äußerste bestimmt die mittlere
			 * 					der Modellübertragung, damit ModelData in
			 * 					Summe des Modell von Kopf- bis Fußzeile
			 * 					
			 */
			
			for(int h = 0; h<mo.getModel()[0].length; h++ )
			{//Model mo = new Model();
				for(int k = 0; k<mo.getModel().length; k++ )
				{	
					for(int l = 0; l<mo.getModel()[k].length; l++ )
					{	
						l=h;
						for(int m = 0; m<mo.getModel()[k][l].length; m ++)
						{	
							if(mo.getModel()[k][l][m]==true) 
							{
//								System.out.print("X");
								wqFin[v]=true;
								
						
							}
							else
							{
//								System.out.print(" ");
								wqFin[v]=false;
								
							}
							v++;
						}

						wqFin[v]=false;
						v++;

						break;
						
					}
				}
			}
			
			System.out.print("AUSGABE VOM STRING");
			System.out.print("\n");
			
			for(int e = 0; e<wqFin.length; e++)
			{

					
					if(wqFin[e]==false)
					{
						System.out.print(" ");
					
					}
					else
					{
						System.out.print("#");	
					}
				
					if((e%(y+x))==y+x-1)System.out.print("\n");
//Italic				if((e%(y+x+1))==y+x)System.out.print("\n");
//Diagonal				if((e%(y+x-1))==y+x-2)System.out.print("\n");
			}
			
		}

}
