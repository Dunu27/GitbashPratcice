package practice;

import org.testng.annotations.Test;

public class GitbashPratice {
@Test
	public  void main() {
System.out.println("Test1--class1");
String url=System.getProperty("url");
String browser=System.getProperty("browser");
System.out.println(url+" "+browser);
	}
@Test
public  void main2() {
System.out.println("Test2--class1");
String url=System.getProperty("url");
String browser=System.getProperty("browser");
System.out.println(url+" "+browser);
}
}
