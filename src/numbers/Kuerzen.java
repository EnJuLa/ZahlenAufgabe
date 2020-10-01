package numbers;

import java.util.logging.*;

public class Kuerzen {

	public static void main(String[] args) {
		
		final Logger log = Logger.getLogger("Kuerzen.class.getName()");
		log.info(">> Kuerzen.Main");
		
				Bruchkuerzen b1 = new Bruchkuerzen(4, 8);
				System.out.println(b1);
				
				b1.kuerze();
				System.out.println(b1);
			}
	

	}

