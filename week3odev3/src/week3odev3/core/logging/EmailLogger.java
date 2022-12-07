package week3odev3.core.logging;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Email ile loglandi : " + data);	
	}

}
