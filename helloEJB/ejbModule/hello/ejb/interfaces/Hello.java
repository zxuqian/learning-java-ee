package hello.ejb.interfaces;

import javax.ejb.Remote;

/**
 * remote business interface
 * @author xuqian
 *
 */
@Remote
public interface Hello {
	
	public String sayHello(String name);

}
