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
	
	void logiWindow()
	{
		System.out.println("HIER ENTSTEHT EIN FENSTER MANAGER. \n"
				+ " WO EINE EINGABE DER POSITION DIE STELLE \n"
				+ "DER SCHRIFT BESTIMMEN SOLL.\n");
		
		boolean[][] fen = new boolean[8][8];
		for(short k = 0;k<fen.length;k++)
//		20230204-1940
		{
			
			for(short l = 0; l<fen[k].length;l++)
			{
				if((k==0)|l==0|k==fen.length-1|l==fen[k].length-1)
				{	
					
						System.out.print("x");
					
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println("");
		}
		
	}
	
	
		void logiWindowIni()
		{
//			String s ="HELLOWORLD";
			User bs = new User();
			Model mo = new Model();
			mo.setModel(bs.eingabe());

			
			//Gibt den Modell von Modelldaten seine Quantoren 
			int x = 0; //ANZAHL SYMBOLE
			int y = 0; //ANZAHL ZEILEN
			int z = 0; //ANZAHL STELLEN
			
//			System.out.print("Mockup logiQuerMode()");
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
			{
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
			System.out.print("\n");
			System.out.print("1d array AUSGABE");
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
			
			System.out.print("\n");
			System.out.print("TRANSFORMATION 1d auf 2d");
			System.out.print("\n");
			
			
			
			boolean[][]uT=new boolean[y/x][x+y];
			int f = 0;
//			int g = 0;
			for(int e = 0; e<wqFin.length; e++)
			{		
//					System.out.print("#");
				
					if(wqFin[e]==false)
					{
//						System.out.print(" ");
						uT[f][e%(y+x)]=false;
					
					}
					else
					{
//						System.out.print("#");
						uT[f][e%(y+x)]=true;
					}
				
					if((e%(y+x))==y+x-1)
					{	
//						System.out.print("\n");
						f++;
					    
					}
//Italic				if((e%(y+x+1))==y+x)System.out.print("\n");
//Diagonal				if((e%(y+x-1))==y+x-2)System.out.print("\n");
			}
			
			
			
	
			
			
			
			System.out.print("\n");
			System.out.print("2d array AUSGABE");
			System.out.print("\n");
			
			
			
			for(int u = 0;u<uT.length;u++)
			{
				for(int w = 0;w<uT[u].length;w++)
				{
					if(uT[u][w]==false)
					{
						System.out.print("+");
//						uT[f][e%(y+x)]=false;
					
					}
					else
					{
						System.out.print("#");
//						uT[f][e%(y+x)]=true;
					}
				}
				System.out.print("\n");
			}
			
			
			//Erstellen eines Rahmen
			boolean[][] uTp = new boolean[uT.length+4][uT[0].length+3];
			
			
			for(short k = 0;k<uTp.length;k++)
//				20230304-2044
				{
					
					for(short l = 0; l<uTp[k].length;l++)
					{
						if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
						{	
							
								System.out.print("x");
							
						}
						else
						{
							System.out.print(" ");	
						}
						
						
						
					}
					System.out.println("");
				}
			
				//Speichern des Rahmen
				for(short k = 0;k<uTp.length;k++)
//				20230404-2050
				{
					
					for(short l = 0; l<uTp[k].length;l++)
					{
						if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
						{								
								System.out.print("x");
								uTp[k][l]=true;
						}
						else
						{							
								System.out.print(" ");
								uTp[k][l]=false;
						}
						
						
						
					}
					System.out.println("");
				}
				
				//Einfügen des Schriftzeichen
				for(int u = 2;u<uTp.length-2;u++)
				{
					for(int w = 2;w<uTp[u].length-2;w++)
					{
							uTp[u][w]=uT[u-2][w-2];
					}
					
				}
				
				
				//Ausgabe von uT in uTp mit anpassbaren Rahmen
				for(short k = 0;k<uTp.length;k++)
//					20230404-2104
					{
						
						for(short l = 0; l<uTp[k].length;l++)
						{
							if((uTp[k][l]==true))
							{		
								if((k==0)|l==0|k==uTp.length-1|l==uTp[k].length-1)
								{
									System.out.print("x");	
								}
								else
								{
									System.out.print("#");	
								}
																
							}
							else
							{
									System.out.print(" ");	
							}
							
							
							
						}
						System.out.println("");
					}
				
			
		}
		
		

}
