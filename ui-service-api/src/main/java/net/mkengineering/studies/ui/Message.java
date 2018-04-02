package net.mkengineering.studies.ui;

import java.util.Base64;

import lombok.Data;

@Data
public class Message {

	public String message;
	public String type;

	public void SetMessage(String command, String user, String attributes) {
		String msg = command + "|" + user + "|" + attributes;
		
		message = Base64.getEncoder().encodeToString(msg.getBytes());
	}

}
