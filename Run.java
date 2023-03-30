package local.code;


class Run 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/**Der Aufgabenbereich ist im Stellenwert alle Funktionen von Java einzubinden von einem Programm
		 * von Hello World bis Benchmark davon, und übertragung an einen Webserver und zurück.
		 * 
		 * @author nachneunkommtacht@gmail.com
		 */
		
		Logic lo = new Logic();
		LogicTest loT = new LogicTest();
		System.out.println("Initialisierung");
		//lo.logiWindowIni();
		
		//BAUSTELLE: TERMINAL REINIGEN GESVHÄTZTE AG 0,5
			//System.out.print("\033[H\033[2J");
		
		
		System.out.println("Aktuelles Argument");
		String blogName1 = String.join("", args);	
		System.out.println(blogName1);
		User bs = new User();
			
		
		
		try 
		{
			/*System.out.println
			(
				"Geben sie die Programmauswahl ein."
				+ "\n"
				+ "0 : Abbruch"
				+ "\n"
				+ "1 : 'BIG Hello'"				
				+ "\n"
				+ "2 : doppelt Schleife"
				+ "\n"
				+ "3 : quer Ausgabe"
				+ "\n"
				+ "4 : 'Hello in einer Matrix Programm'"
			);
			
			*/
			
			do 
			{

						
				switch(blogName1) 
				{
				
					case "1":
						
							System.out.println("Switch CASE 1");
								
							lo.logi();
							
						break;
						
					case "2":	
						System.out.println("Switch CASE 2");
						lo.logiObject();
						break;
						
					case "3":	
						System.out.println("Switch CASE 3");
						lo.logiQuer();
						break;
						
					case "4":	
						System.out.println("Switch CASE 4");
						lo.logiQuerMode();
												
						break;
						
					case "5":		
						
						System.out.println("Switch CASE 5");
						
						lo.logiWindowQuer();
						/* Fenstermanager nicht so einfach
						 * Logik(Konsole(Modell(ModellData)))?
						 * Konsole(Logik(Modell(ModellData)))?
						 * 
						 */

						
						break;
						
					case "6":		
						
						System.out.println("Switch CASE 6" + "\n" + "EINGABE BITTE 'Nur Großbuchstaben'");
						
						lo.logiWindowIni();
						
						break;	
						
					case "7":		
						
						System.out.println("Switch CASE 7");
						
//						loT.logiWindowIni();
						
						break;	
						
					case "8":		
						
						System.out.println("Switch CASE 8");
						
//						loT.logiWindowIni();
						
						break;	
						
					case "9":		
						
						System.out.println("Switch CASE 9");
						
//						loT.logiWindowIni();
						
						break;	
		
					case "10":		
						
						System.out.println("Switch CASE 10");
						
//						loT.logiWindowIni();
						
						break;	
		
					case "11":		
						
//						System.out.println("Switch CASE 11");
						
//						loT.logiWindowIni();
						
						break;	
						
					default:
						System.out.println("Kein Argument bestimmt");
				
				}
				
				System.out.print("\n");
				System.out.println
				(
					"Geben sie die Programmauswahl ein."
					+ "\n"
					+ "0 : Abbruch"
					+ "\n"
					+ "1 : 'BIG Hello'"
					+ "\n"
					+ "2 : doppelt Schleife"
					+ "\n"
					+ "3 : ACHTUNG ABSTURZ! HERLEITUNGSROUTINE: quer Ausgabe"
					+ "\n"
					+ "4 : 'Quer Unversel - Testlauf logiQuerMode()'"
					+ "\n"
					+ "5 : 'Logic.logiWindowQuer()'"
					+ "\n"
					+ "6 : 'Testlauf logiWindowIni();'"
					+ "\n"
					+ "7 : 'Testlauf loT.logiWindowIni();'"
					+ "\n"
					+ "8 : 'Testlauf loT.logiWindowUp();'"
					+ "\n"
					+ "9 : 'Testlauf loT.logiWindowDown();'"
					+ "\n"
					+ "10 : 'Testlauf loT.logiWindowRight();'"
					+ "\n"
					+ "11 : 'Testlauf loT.logiWindowLeft();'"
				);
					
				blogName1 = bs.eingabe();
			
					
				
			}while(lo.verzweigungRun(blogName1));
				
		}catch(Exception e) 
		{	
		}	
		
		
	}
/*
 */
}
