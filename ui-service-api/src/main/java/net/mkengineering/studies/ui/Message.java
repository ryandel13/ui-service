package net.mkengineering.studies.ui;

import java.util.Base64;

import lombok.Data;

@Data
/**
 * Message class.
 * @author c581
 *
 */
public class Message {

	/**
	 * message.
	 */
	public String message;
	
	/**
	 * type
	 */
	public String type;

	/**
	 * Set message
	 * @param command
	 * @param user
	 * @param attributes
	 */
	public void SetMessage(String command, String user, String attributes) {
		String msg = command + "|" + user + "|" + attributes;
		
		message = Base64.getEncoder().encodeToString(msg.getBytes());
	}

}
