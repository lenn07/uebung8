package h1;

public class H1_main {
    public static void main(String[] args) {
		Bruch bruch = new Bruch(8, 4);
		bruch.shorten();
		System.out.println(bruch.zaehler + "/" + bruch.nenner);
		System.out.println(bruch.hasSameValueAs(new Bruch(8,4)));
	}
}