// Hello World Git project
// by Larry Vail
// September 3, 2016

// Push to GitHub
// refactor message

public class Hello2 {

	Hello2 app;
	
	public static void main(String [] args)
	{
		Hello2 app = new Hello2();
		app.message("Hello GitHub via jGrasp (ldv)");
		app.message("add a 2nd line of text");
	}

	void message(String s)
	{
		System.out.println(s);
	}
}