package projectA19;

public class Button {
    OnClickListenr listener;
    
    
    void setOnClickListener(OnClickListenr listener) {
    	this.listener = listener;
    } 
    
    void touch() {
    	listener.onClick();
    }
	
	
    
	interface OnClickListenr{
	    void onClick();	
	}
	
}
