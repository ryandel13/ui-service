package net.mkengineering.studies.ui.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.mkengineering.studies.ui.Message;


public interface UiServiceInterface {
public final String CONTEXT = "ui";
	
	@RequestMapping(value = CONTEXT + "/Client/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Boolean pushMessageAsGet();

	@RequestMapping(value = CONTEXT + "/push", method = RequestMethod.PUT)
	@ResponseBody
	public void pushMessage(Message data);
	
	@RequestMapping(value = CONTEXT + "/gps", method = RequestMethod.PUT)
	@ResponseBody
	public void pushGps(ObjectNode data);
	
}
