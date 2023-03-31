package local.code;

public class Model
{	
	
	public Model() 
	{		
	}
				
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

			String str = this.str;
			
			ModelData mo = new ModelData();
			

		
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
	
		return arrq;
		}
}
				

