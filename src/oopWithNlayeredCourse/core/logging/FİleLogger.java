package oopWithNlayeredCourse.core.logging;

public class FİleLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("dosyaya loglandı : "+ data);
	}

}
