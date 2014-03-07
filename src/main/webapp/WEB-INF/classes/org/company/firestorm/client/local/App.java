package org.company.firestorm.client.local;

//import javax.annotation.PostConstruct;
//import javax.enterprise.event.Event;
///import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.company.firestorm.client.local.shared.MyRemoteService;
import org.jboss.errai.bus.client.api.RemoteCallback;
//import org.company.firestorm.server.EventHandler;
//import org.company.firestorm.server.s;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.api.Caller;

//import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;



/**
 * Main application entry point.
 */
@EntryPoint
public abstract class App implements MyRemoteService {

   
  //  private Event<String> messageEvent;

    private final Label responseLabel = new Label();
    private final Button button = new Button("Send");
    private final TextBox message = new TextBox();
   
   // @PostConstruct
   // public void buildUI() {
   // }
       //button.addClickHandler(new ClickHandler() {
      /*      public void onClick(ClickEvent event) {

                // In GWT Dev Mode, Text written to System.out shows up in the
                // console where you launched Dev Mode (eg. in your terminal
                // window or in the Eclipse Console tab).
                // In Production Mode, System.out is a black hole.
                System.out.println("Handling click event!");
*/
    	@Inject
    	private Caller<MyRemoteService> remoteService;
        String s = message.getText();

    	//@EventHandler("button")
        public void onButtonClick(ClickHandler handler) {
        	remoteService.call(new RemoteCallback<String>() {
        		public void callback(String s){
        			 
        				  //    System.out.println("Got a Response!");
		        responseLabel.setText("Message from Server: " + remoteService);
        		}
        	}
        	
        		).myMethod(s);
        	
        	
    	
  //              fireMessage();
  //          }
    //    });

        HorizontalPanel horizontalPanel = new HorizontalPanel();
        horizontalPanel.add(message);
        horizontalPanel.add(button);
        horizontalPanel.add(responseLabel);

        RootPanel.get().add(horizontalPanel);
        
        System.out.println("UI Constructed!");
        

    /**
     * Fires a CDI HelloMessage with the current contents of the message textbox.
     */
  //  void fireMessage() {
   //   String text = message.getText();
   //  messageEvent.fire(text);
      // HelloMessage event = new HelloMessage(text);
      //messageEvent.fire(event);
  //  }

//  public void response(@Observes Response event) {
  //    System.out.println("Got a Response!");
    //    responseLabel.setText("HelloMessage from Server: " + event.getMessage().toUpperCase());
    //}

    /**
     * Returns the "Send" button. Exposed for testing.
     */
    //Button getSendButton() {
      //  return button;
    //}
    
    /**
     * Returns the response label. Exposed for testing.
     */
    //Label getResponseLabel() {
      //return responseLabel;
    //}
    
    /**
     * Returns the "message" text box. Exposed for testing.
     */
    //TextBox getMessageBox() {
      //return message;
    //}

    	
    
    }
}