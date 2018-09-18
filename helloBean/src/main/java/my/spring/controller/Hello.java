package my.spring.controller;

public class Hello {
	String name;
	printer printer;
	
	public Hello() {}
	
	public String sayHello() {
		return "Hello " + name;
	}
}
