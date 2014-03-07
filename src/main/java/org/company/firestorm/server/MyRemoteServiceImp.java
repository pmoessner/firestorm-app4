package org.company.firestorm.server;

import org.company.firestorm.client.local.shared.MyRemoteService;
import org.jboss.errai.bus.server.annotations.Service;
//import org.jboss.errai.ioc.client.api.Caller;
//import javax.enterprise.event.Event;
//import javax.enterprise.event.Observes;

//import javax.inject.Inject;
//import com.google.gwt.user.client.rpc.AsyncCallback;

//import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@Service
public class MyRemoteServiceImp implements MyRemoteService {
public String myMethod(String s) {
	String S = s + s;
//	  HttpSession session = RpcContext.getHttpSession();
//	    ServletRequest request = RpcContext.getServletRequest();
	    
			 return S;
 }
	
	
    
	 //public String myMethod(String s) {
		    // Do something interesting with 's' here on the server.
     //   s = s + s;
	//	return s;
	//  }
	
/*	 MessageBuilder.createCall.(new RemoteCallback<String>() {
    public String callback(String s){
	 s = s + s;
     return s;
	}

	 ), MyRemoteService.class).MyMethod(s);
}*/
    }
 
    