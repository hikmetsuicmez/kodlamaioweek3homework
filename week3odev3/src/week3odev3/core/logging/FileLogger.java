package week3odev3.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("File ile loglandi : " + data);
		
	}

}
