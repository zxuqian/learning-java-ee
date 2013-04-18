package hello.ejb;

import javax.ejb.Stateless;

import hello.ejb.interfaces.Hello;

@Stateless
public class HelloBean implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello: " + name;
	}

}
