package h1;


public class Bruch {
	
	public int zaehler, nenner;
	
    public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
    
    
    private int ggT(int x, int y) {
    	int a = (x >= y) ? x : y;
    	int b = (x >= y) ? y : x;
    		
    	int rest = a % b;
    	while (rest != 0) {
    		a = b;
    		b = rest;
    		rest = a % b;
    	}
    	
    	return b;
    	
    }
    
    
    public void shorten() {
    	int hilfNenner = nenner;
    	int hilfZähler = zaehler;
    	nenner = nenner/ggT(hilfNenner, hilfZähler);
    	zaehler = zaehler / ggT(hilfNenner, hilfZähler);
    }
    
    public boolean hasSameValueAs(Bruch b) {
    	if((double)zaehler / (double)nenner == (double)b.zaehler/(double)b.nenner){
    		return true;
    	}
    	return false;
    	
    }
    
}