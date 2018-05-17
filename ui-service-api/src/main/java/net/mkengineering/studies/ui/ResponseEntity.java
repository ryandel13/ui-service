package net.mkengineering.studies.ui;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * ResponseEntity class.
 * @author c581
 *
 */
public class ResponseEntity {

	/**
	 * name
	 */
	private String name;
	
	/**
	 * values
	 */
	private String value;
	
	/**
	 * type.
	 */
	private String type;
	
}

