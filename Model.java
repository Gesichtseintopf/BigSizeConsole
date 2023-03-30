package local.code;


//import java.time.*;
//import java.time.LocalDateTime;


public class Model
{
	int x =0;
	int y=0;
	int l = 0; 

	
	
	public Model() 
	{
		//System.out.println("Konstruktor Modell");
	}
	
	public Model(int x, int y) 
	{
		//System.out.println("Konstruktor Modell x y");
		this.x=x;
		this.y=y;
	}
	
		
	public Model(int l) {
		this.l=l;
	}

		void modee() {
			//System.out.println("Mockup Modell");
		}
	
		
		void schleife(int l) {
		
			for(int i = 0;i<l; i++ ) 
			{
				
				/*
				switch(i%1) {
				case 1: System.out.println(i + "." + "Hello World");
				}
				*/
				System.out.print("Hello World");
				System.out.print("Hello World");
			}
		}
		
	
		static boolean [][] matrix()
		{
			boolean [][] ma = new boolean [16][64];
		
			return ma;
		}
		
		//Model mo = new Model();
	
								
		boolean[][][] arrq()
		{
			
			ModelData mo = new ModelData();
			boolean[][][] arrq =	
			{
				mo.printHhObj(),
				mo.printEhObj(),
				mo.printLhObj(),
				mo.printLhObj(),
				mo.printOhObj(),
				mo.printWhObj(),
				mo.printOhObj(),
				mo.printRhObj(),
				mo.printLhObj(),
				mo.printDhObj(),
				mo.printBarspace()
				
			};
			
			return arrq;
		}
		
		
		
		boolean[][][] arrk()
		{
			
			ModelData mo = new ModelData();
			boolean[][][] arrk =	{
									mo.printHhObj(),
									mo.printEhObj(),
									mo.printLhObj(),
									mo.printLhObj(),
									mo.printOhObj()
									};
			
			return arrk;
		}

//		//////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////
//		//////////////////////////////////////////////////////////
		
	
		/*
		 * Eine Eingabe von einem String soll zerlegt werden
		 * und in einem Array mit den Objecten von ModelData
		 * der Informationen vom Alphabet gefüllt werden.
		 *
		 *
		 *Nicht gleich zuviel wollen. Wird mehrmals umgebaut.
		 */
	
		public static String str;
		
		void setModel(String str)
		//20232903-2015
		{
			this.str = str;
			System.out.println(this.str);
		}
		
		
		
		boolean [][][] getModel()
		//20232803-2152
		{
//			System.out.println(this.str);
			String str = this.str;
			
			ModelData mo = new ModelData();
			
//			String[] strQ = new String[26];
		
			boolean[][][] arrq 
			= 
			new boolean[str.length()][mo.getHigh()][mo.getWide()];
			
			char c;
				
			//Model mo = new Model();
			for(int k = 0; k<arrq.length; k++ )
			{	
								
				 c = str.charAt(k);
				switch(c)
				{
				case 'A':
							arrq[k] = mo.printAhObj();
					break;
				case 'B':
							arrq[k] = mo.printBhObj();
					break;	
				case 'C':
							arrq[k] = mo.printChObj();
					break;
				case 'D':
							arrq[k] = mo.printDhObj();					
					break;
				case 'E':
							arrq[k] = mo.printEhObj();					
					break;	
				case 'F':
							arrq[k] = mo.printFhObj();	
					break;
				case 'G':
							arrq[k] = mo.printGhObj();					
					break;
				case 'H':
							arrq[k] = mo.printHhObj();				
					break;	
				case 'I':
							arrq[k] = mo.printIhObj();
					break;
				case 'J':
							arrq[k] = mo.printJhObj();			
					break;
				case 'K':
							arrq[k] = mo.printKhObj();			
					break;	
				case 'L':
							arrq[k] = mo.printLhObj();
					break;
				case 'M':
							arrq[k] = mo.printMhObj();			
					break;
				case 'N':
							arrq[k] = mo.printNhObj();			
					break;	
				case 'O':
							arrq[k] = mo.printOhObj();
					break;
				case 'P':
							arrq[k] = mo.printPhObj();
					break;
				case 'Q':
							arrq[k] = mo.printQhObj();
					break;
				case 'R':
							arrq[k] = mo.printRhObj();
					break;
				case 'S':
							arrq[k] = mo.printShObj();
					break;
				case 'T':
							arrq[k] = mo.printThObj();
					break;
				case 'U':
							arrq[k] = mo.printUhObj();
					break;
				case 'V':
							arrq[k] = mo.printVhObj();
					break;
				case 'W':
							arrq[k] = mo.printWhObj();
					break;
				case 'X':
							arrq[k] = mo.printXhObj();
					break;
				case 'Y':
							arrq[k] = mo.printYhObj();
					break;
				case 'Z':
							arrq[k] = mo.printZhObj();
					break;
				case ' ':
							arrq[k] = mo.printBarspace();
				break;

			
					
				default:
					System.out.println("switch default Model");
				}
				

				
			}
				
		
		/*	
			ModelData mo = new ModelData();
			boolean[][][] arrq =	{
									mo.printHhObj(),
									mo.printEhObj(),
									mo.printLhObj(),
									mo.printLhObj(),
									mo.printOhObj()
									};
			

		*/
		return arrq;
		}
				
//	//////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////
//	//////////////////////////////////////////////////////////
		
		
}

/*20232903-1647
 * Aufregung im Problem. Ich werde es erstmal mit pseudo Code abstellen.
 * Und ein.
 * 
 * Bau ich erstmal ein Verfahren, wo das Array nicht fertig ist.
 * und den Stellen ein Inhalt übergeben wird?
*/
/*
 * Ich brauch eine Methode die vom Datentyp boolean ist
 */

