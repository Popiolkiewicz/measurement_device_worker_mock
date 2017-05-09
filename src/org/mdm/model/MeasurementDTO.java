/**
 * 
 */
package org.mdm.model;

import java.util.Date;

/**
 * Created on 05.04.2017 21:55:20
 * 
 * @author Hubert Popio³kiewicz
 */
public class MeasurementDTO {

	private Long id;
	private Double value;
	private Date date;
	private Boolean warning = false;

	private MeasurementTypeDTO measurementTypeDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getWarning() {
		return warning;
	}

	public void setWarning(Boolean warning) {
		this.warning = warning;
	}

	public MeasurementTypeDTO getMeasurementTypeDTO() {
		return measurementTypeDTO;
	}

	public void setMeasurementTypeDTO(MeasurementTypeDTO measurementTypeDTO) {
		this.measurementTypeDTO = measurementTypeDTO;
	}

}
