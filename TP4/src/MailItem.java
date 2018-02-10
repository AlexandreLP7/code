package mail;
/**
  * an email with a sender a recipient and the message
  * @author Clément Sommer
  */
public class MailItem{
	/** the name of the sender */
	private String from;
	/** the name of the recipient */
	private String to;
	/** the message */
	private String message;
	/** 
	  * Constructor of the class MailItem
	  * @param from name of the sender
	  * @param to name of the recipient
	  * @param message the message
	  */
	public MailItem(String from, String to, String message){
		if(from != null){
			this.from = from;
		}
		else {
			System.out.println("sender not available");
			this.from = "";
		}
		if(to != null){
			this.to = to;
		}
		else {
			System.out.println("recipient not available");
			this.to = "";
		}
		if(message != null){
			this.message = message;
		}
		else {
			System.out.println("message not available");
			this.message = "";
		}
	}
	/**
	  * return the name of the sender
	  * @return the sender
	  */
	public String getFrom(){
		return this.from;
	}
	/**
	  * return the name of the recipient
	  * @return the recipient
	  */
	public String getTo(){
		return this.to;
	}
	/**
	  * return the message
	  * @return the message
	  */
	public String getMessage(){
		return this.message;
	}
	/**
	  * print the e mail
	  */
	public void print(){
		if(this.getFrom() != "" && this.getTo() != "" && this.getMessage() != ""){
			System.out.println( "From : " + this.from + "\n" + "to : " + this.to + "\n" + "message : " + this.message);
		}
	}
}