package net.mkengineering.studies.ui;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
* DataResponse class.
*/
public class DataResponse {

	@JsonProperty
	/**
	* Values.
	*/
	private List<ResponseEntity> values;
	
	/**
	* addEntry.
	*/
	public void addEntry(ResponseEntity rE) {
		values.add(rE);
	}
}
