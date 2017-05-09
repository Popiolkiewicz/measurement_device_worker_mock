package org.mdm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 05.04.2017 21:48:51
 * 
 * @author Hubert Popio³kiewicz
 */
public class DeviceDTO {

	private Long id;
	private String name;
	private String serialNumber;
	private Boolean warning = false;

	private UserDTO userDTO;
	private List<MeasurementTypeDTO> measurementTypeDTOs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Boolean getWarning() {
		return warning;
	}

	public void setWarning(Boolean warning) {
		this.warning = warning;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public List<MeasurementTypeDTO> getMeasurementTypeDTOs() {
		return measurementTypeDTOs;
	}

	public void setMeasurementTypeDTOs(List<MeasurementTypeDTO> measurementTypeDTOs) {
		this.measurementTypeDTOs = measurementTypeDTOs;
	}

}
