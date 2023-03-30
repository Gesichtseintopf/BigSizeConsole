package local.code;

import java.io.*;

public class User{

	public User() {
		//System.out.println("Konstruktor Benutzer");
	}
	
		void bss() {
			System.out.println("Mockup Benutzer");
		}
		
		public String eingabe() {
			
			String s = null;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
			s = br.readLine();
			
			}catch (IOException ioe) {
                ioe.printStackTrace();              
            } 
			return s;
		}
}
