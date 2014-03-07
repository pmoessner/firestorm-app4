package org.company.firestorm.client.local.shared;
import org.jboss.errai.bus.server.annotations.Remote;
@Remote
public interface MyRemoteService {
	public String myMethod(String s);
}
