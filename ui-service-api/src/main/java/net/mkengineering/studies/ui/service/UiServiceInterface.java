package net.mkengineering.studies.ui.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.mkengineering.studies.ui.Message;

/**
 * Service Interface for UI.
 * @author c581
 *
 */
public interface UiServiceInterface {
	
	/**
	 * Context path. 
	 */
	public final String CONTEXT = "ui";
	
	@RequestMapping(value = CONTEXT + "/Client/{id}", method = RequestMethod.GET)
	@ResponseBody
	/**
	 * pushMessage
	 * @return boolean
	 */
	public Boolean pushMessageAsGet();

	@RequestMapping(value = CONTEXT + "/push", method = RequestMethod.PUT)
	@ResponseBody
	/**
	 * Transmitted data.
	 * @param data data
	 */
	public void pushMessage(Message data);
	
	@RequestMapping(value = CONTEXT + "/gps", method = RequestMethod.PUT)
	@ResponseBody
	/**
	 * pushGps.
	 * @param data must be GPS
	 */
	public void pushGps(ObjectNode data);
	
}
