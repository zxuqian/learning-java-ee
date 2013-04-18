package hello.ejb.interfaces;

import javax.ejb.Remote;

@Remote
public interface Hello {
	
	public String sayHello(String name);

}
