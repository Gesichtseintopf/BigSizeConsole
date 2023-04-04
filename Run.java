package local.code;


class Run 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/**
		 * @author nachneunkommtacht@gmail.com
		 */
		
		Logic lo = new Logic();	
		System.out.println("Aktuelles Argument");
		String blogName1 = String.join("", args);	
		System.out.println(blogName1);
		User bs = new User();
			
		
		
		try 
		{			
			do 
			{

						
				switch(blogName1) 
				{					
					case "1":		
						
						System.out.println("EINGABE BITTE 'Nur Großbuchstaben'");
						
						lo.logiWindowIni();
						
						break;	
						
					case "2":		
						
						System.out.println("TESTZONE");
						
						lo.logiWindow();
						
						break;	
						
					default:
						System.out.println("Kein Argument bestimmt");
				
				}
				
				System.out.print("\n");
				System.out.print
				(
					"Geben sie die Programmauswahl ein."
					+ "\n"
					+ "1 : 5x5 vergrößerte Ausgabe"
					+ "\n"
					+ "2 : Fenstermanager"
					+ "\n"
					
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
