package local.code;

/**
 * 
 * @author nachneunkommtacht@gmail.com
 * @version 0.2
 * @since April 2023
 */

/**
 *Working Directory JJJJTTMM-HHMM
 * 20230604-2149
 * 20230804-1252
 *
 */

public class Model
{	
	
	public Model() 
	{		
	}
				
		public static String str;
		public static boolean[][][] arrq;
//		public static boolean[][] arrq;
		
		void setModel(String str)
		//20232903-2015
		{
			this.str = str;
//			System.out.println(this.str);
		}
		
		
		
		boolean [][][] getModel()
		//20232803-2152
		{

			String str = this.str;
			
			ModelData moDa = new ModelData();
			

		
			boolean[][][] arrq 
			= 
			new boolean[str.length()][moDa.getHigh()][moDa.getWide()];
			
			char c;
				
			//Model mo = new Model();
			for(int k = 0; k<arrq.length; k++ )
			{	
								
				 c = str.charAt(k);
				switch(c)
				{
				case 'A':
							arrq[k] = moDa.printAhObj();
					break;
				case 'B':
							arrq[k] = moDa.printBhObj();
					break;	
				case 'C':
							arrq[k] = moDa.printChObj();
					break;
				case 'D':
							arrq[k] = moDa.printDhObj();					
					break;
				case 'E':
							arrq[k] = moDa.printEhObj();					
					break;	
				case 'F':
							arrq[k] = moDa.printFhObj();	
					break;
				case 'G':
							arrq[k] = moDa.printGhObj();					
					break;
				case 'H':
							arrq[k] = moDa.printHhObj();				
					break;	
				case 'I':
							arrq[k] = moDa.printIhObj();
					break;
				case 'J':
							arrq[k] = moDa.printJhObj();			
					break;
				case 'K':
							arrq[k] = moDa.printKhObj();			
					break;	
				case 'L':
							arrq[k] = moDa.printLhObj();
					break;
				case 'M':
							arrq[k] = moDa.printMhObj();			
					break;
				case 'N':
							arrq[k] = moDa.printNhObj();			
					break;	
				case 'O':
							arrq[k] = moDa.printOhObj();
					break;
				case 'P':
							arrq[k] = moDa.printPhObj();
					break;
				case 'Q':
							arrq[k] = moDa.printQhObj();
					break;
				case 'R':
							arrq[k] = moDa.printRhObj();
					break;
				case 'S':
							arrq[k] = moDa.printShObj();
					break;
				case 'T':
							arrq[k] = moDa.printThObj();
					break;
				case 'U':
							arrq[k] = moDa.printUhObj();
					break;
				case 'V':
							arrq[k] = moDa.printVhObj();
					break;
				case 'W':
							arrq[k] = moDa.printWhObj();
					break;
				case 'X':
							arrq[k] = moDa.printXhObj();
					break;
				case 'Y':
							arrq[k] = moDa.printYhObj();
					break;
				case 'Z':
							arrq[k] = moDa.printZhObj();
					break;
				case ' ':
							arrq[k] = moDa.printBarspace();
				break;

			
					
				default:
					
					arrq[k] = moDa.printBarspace();
//					System.out.println("switch default Model");
				}
								
			}				
	
		this.arrq = arrq;
		
		return arrq;
		}
}
				

