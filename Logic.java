package local.code;

/**
 * Das Programm ist in vielen Stufen entstanden und nicht als fertiges Modell
 * entstanden. Logic.class Model.class mit Benutzer.class sind die Grundwerte 
 * die über die Run.class angeregt werden. und zentral auf logic läuft.
 * ModelData.class ist über die Bedingung entstanden das Daten der Modelle im Model.class
 * konflikte bei der Verarbeitung und Redundanz verursachte. Was sich
 * als Gerüst für jedes Programm eigenet.
 * 
 * Dieses Programm dient der Aufgabe dem Programmieren seine Ebenen zu
 * verinnerlichen und erzeugt soeben auch gleich ein Java tutorial.
 * Ein Hello World seines stellenwertes der Ebenen in einer binären Matrix verarbeiten
 * und Ausgeben, in verschiedenen Formaten, mit Display im Display um
 * die Ebenen eines Grafiktreibers zu verstehen.
 * 
 * 
 * @author nachn
 *
 */

public class Logic {
	

//	static boolean[][] wq = new boolean[5][30];	
	
	public Logic(){
		//System.out.println("Konstruktor Logik");
	}

	
	
		void logi() {
			System.out.println("Mockup Logik");
			
			ModelData mo = new ModelData();

			//mo.schleife(a);
			
			//bs.bss();
			//System.out.println(bs.eingabe());
			
			mo.printH();
			mo.printE();
			mo.printL();
			mo.printL();
			mo.printO();
		}
		

		
		/*
		 * Der MAIN seine Durchlaufschleife und Bedingung
		 */
		boolean verzweigungRun(String s)
		{
			boolean b = true;
			if(s == "0") b = false;
			
			return b;
		}
		
		
		
		void logiObject()
		{
			Model mo = new Model();
			
			
		
			//Model mo = new Model();
			for(int k = 0; k<mo.arrq().length; k++ )
			{	
				for(int l = 0; l<mo.arrq()[k].length; l++ )
				{
					
					for(int m = 0; m<mo.arrq()[k][l].length; m ++)
					{	
						if(mo.arrq()[k][l][m]==true) 
						{
							System.out.print("X");
						}
						else
						{
							System.out.print(" ");	
						}
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}			
		}
		
		
		void logiQuer()
		{
			
			//FAKE Methode verursacht Kollision. Kann aber eventuell zur
			//Beschleunigung verwendet werden bei festen Modellen
			//Funktioniert nur bei einem Zeichensatz der die Länge
			//der Höhe selbst beträgt. Zum Fortscvhritt erzeugen.
			
			Model mo = new Model();
			


		
			//Model mo = new Model();
			for(int k = 0; k<mo.arrk().length; k++ )
			{	
				for(int l = 0; l<mo.arrk()[k].length; l++ )
				{
					
					for(int m = 0; m<mo.arrk()[k][l].length; m ++)
					{	
						if(mo.arrk()[l][k][m]==true) 
						{
							System.out.print("X");
						}
						else
						{
							System.out.print(" ");	
						}					
					}
					System.out.print("   ");
				}
				System.out.print("\n");
			}
		}
		

		
		void logiWindowQuer()
		{
				
			System.out.print("Mockup logiWindowsMode()");

		}

		void logiQuerMode()
		{
			
			/*
			 * Die Elemente wurden der Entwicklung von logiWindowQuer entnommen.
			 * Wesentliche Kommentare fehlen. Strukturinhalte sind der Ausgabe zu
			 * entnehmen.
			 */
			
			
			//Gibt den Modell von Modelldaten seine Quantoren 
			int x = 0; //ANZAHL SYMBOLE
			int y = 0; //ANZAHL ZEILEN
			int z = 0; //ANZAHL STELLEN
			
			System.out.print("Mockup logiQuerMode()");
			System.out.print("\n");
			
			Model mo = new Model();
//			////////QUANTIFIZIEREN DES MODELL
			
			System.out.print("QUANTIFIZIEREN DES MODELL");
			System.out.print("\n");
			for(int k = 0; k<mo.arrq().length; k++ )
			{	
				for(int l = 0; l<mo.arrq()[k].length; l++ )
				{
					
					for(int m = 0; m<mo.arrq()[k][l].length; m ++)
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
			
			for(int h = 0; h<mo.arrq()[0].length; h++ )
			{//Model mo = new Model();
				for(int k = 0; k<mo.arrq().length; k++ )
				{	
					for(int l = 0; l<mo.arrq()[k].length; l++ )
					{	
						l=h;
						for(int m = 0; m<mo.arrq()[k][l].length; m ++)
						{	
							if(mo.arrq()[k][l][m]==true) 
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
//						System.out.print("\n");
						wqFin[v]=false;
						v++;

						break;
						
					}
//					System.out.print("\n");
				}
			}
			
			System.out.print("AUSGABE VOM STRING");
			System.out.print("\n");
			
			for(int e = 0; e<wqFin.length; e++)
			{
				
//				System.out.print(wq[e][f]);
					
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
			
			/*
			 * Dem SCHREIBEN eines Wandelprogramm mit einem Gesetz
			 * wo das dreidimensionelle Array beim Schreiben ein 
			 * Zwischenschritt was perfekt ist und gebracuht wird,
			 * aber der Eigenschaft nur das H nehmen werde und es
			 * in die Matrix einbauen.
			 * 
			 */

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
//						System.out.print("\n");
						wqFin[v]=false;
						v++;

						break;
						
					}
//					System.out.print("\n");
				}
			}
			
			System.out.print("AUSGABE VOM STRING");
			System.out.print("\n");
			
			for(int e = 0; e<wqFin.length; e++)
			{
				
//				System.out.print(wq[e][f]);
					
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
				

		
		void logiWindowIniCursor()
		{
			
			//User bs = new User();
			
			int x = 0;
			
			int y = 0;
			
			Model mo = new Model(x, y);
			
			
			for(int k = 0; k<mo.matrix().length; k++ )
			{	
				for(int l = 0; l<mo.matrix()[k].length; l++ )
				{
					
					mo.matrix()[k][l] = true;
					
					System.out.print("#");
				}
				System.out.print("\n");
			}
		}
		
}

/*
 *20232103-1645
 * Der Disskusion die Klasse zu ändern das der Einfluss der MAin kleiner 
 * wird der Wiederverwendbarkeit und Implementierung als Grafikprinzip
 * einer belibigen Fenstersequenz von freien Koordinaten bis hin zu dem
 * Druckertreiber gerehten Formatierungen der Konsolen gleihen Anforder-
 * ungen. Einer frei manipulierbaren MAtrix über eine Startkoordinate,
 * die dem Gesetz und Verwendungszweck der Maus so unglaublich einfach macht.
 * Das dem Interface der Objekte und seinen Beziehung natürlichen System-
 * größen das Gesetz der Klasse und seiner PRogramierung in Nutzung als 
 * universeller Treiber einer Matrix mit N-belibiger Manipulation über
 * Kausale Gesetze der Gestaltung ein unendlich frei gestaltbaren Fenster
 * manager generiert. 
 * 
 * Zum Betrieb des System ist somit immer Konsole und seine Manipulation die
 * Basis. Wir werden sehene....
 * 
 */

/*
 * 20232503-1458
 * Dem Programm sind verschiedene Hürden sind Meistern und eine Aufgabenstellung
 * wo ich verschiedenste Strukturen abdecken kann. Wenn das Programm auf einer
 * Ebene läuft, das der Konsole alle Intervalle einer grafischen Manipulation 
 * möglich sind. Ist hoch effizientes Prozessing in Natur der Rechnerarchitektur
 * einer Zeilenorientierung im Algorithmus gelöst.
*/

/*
 * 26.03.2023-15:06
 * Der Aufgaben sind verschiedene Fortschritte. Der beliebige Erweiterung eines 
 * vertikalen Array. Der boolschen Ableitung anderer Modelle in beliebiger Größe 
 * und Unterbrechung sind eine Notwendigkeit jeder Registerverarbeitung.
 * Auswegslosigkeit und Schwierigkeitne in die Blackbox des Computer hinein
 * zu schauen sind mentale Belastung besonderer Art. Die der Medizin ebenso 
 * bekannt sein müssen.
 */
		

/*
 * 20232903-1945
 * Muss mir gedanken machen, wo die Klassen stehen und ihr Rang seiner Eigenschaften
 * der Zuständigkeit. Sowie der Datentypen meiner MEthoden, zum Handhaben ihrer
 * Eigenschaften im Komfort des Weiterprogrammieren, der Weiterverarbeitung.
 * Augen zu und durch...
 * 
 */
