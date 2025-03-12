package chatting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class chatting {
	
	private int id;
	private String sender;
	private String receiver;
	private String message;
	
    public chatting(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }
	
	
	 public chatting(String message) {
	        this.message = message;
	    }
	 
	    public String getMessage() {
	        return message;
	    }

}
