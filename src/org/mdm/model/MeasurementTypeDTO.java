/**
 * 
 */
package org.mdm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 05.04.2017 21:55:20
 * 
 * @author Hubert Popio³kiewicz
 */
public class MeasurementTypeDTO {

	private Long id;
	private String code;
	private String name;
	private String unit;
	private Double topCriticalBound;
	private Double bottomCriticalBound;

	private DeviceDTO deviceDTO;
	private MeasurementDTO measurementDTO;
	private List<MeasurementDTO> measurementDTOs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getTopCriticalBound() {
		return topCriticalBound;
	}

	public void setTopCriticalBound(Double topCriticalBound) {
		this.topCriticalBound = topCriticalBound;
	}

	public Double getBottomCriticalBound() {
		return bottomCriticalBound;
	}

	public void setBottomCriticalBound(Double bottomCriticalBound) {
		this.bottomCriticalBound = bottomCriticalBound;
	}

	public DeviceDTO getDeviceDTO() {
		return deviceDTO;
	}

	public void setDeviceDTO(DeviceDTO deviceDTO) {
		this.deviceDTO = deviceDTO;
	}

	public MeasurementDTO getMeasurementDTO() {
		return measurementDTO;
	}

	public void setMeasurementDTO(MeasurementDTO measurementDTO) {
		this.measurementDTO = measurementDTO;
	}

	public List<MeasurementDTO> getMeasurementDTOs() {
		return measurementDTOs;
	}

	public void setMeasurementDTOs(List<MeasurementDTO> measurementDTOs) {
		this.measurementDTOs = measurementDTOs;
	}

}
