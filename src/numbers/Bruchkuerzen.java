package numbers;

public class Bruchkuerzen 
	{
 public int zaehler;
 public int nenner;
			
	public Bruchkuerzen (int pZaehler, int pNenner) {
		if (pNenner ==0) {
			System.out.println("Der Nenner darf nicht 0 sein.");
			System.out.println("Setze den Bruch auf 0.");
			zaehler = 0;
			nenner =1;
		}
		else{
			zaehler = pZaehler;
			nenner = pNenner;
		}
	}


	public void kuerze() {
		int faktor = ggT();
		zaehler = zaehler / faktor;
		nenner = nenner / faktor;
		if (nenner < 0) {
			zaehler = -zaehler;
			nenner = -nenner;
		}
		}
	
	public int getZaehler() {
		return zaehler;
	}
	
	public int getNenner() {
		return nenner;
	}
	
	public String toString() {
		return zaehler + "/"+nenner;
	}
	
	private int ggT() {
		int a = zaehler;
		int b = nenner;
		int h;
		
		while(b != 0) {
			h = a%b;
			a = b;
			b =h;
		}
		
		return a;
		}
	
	}
	
	