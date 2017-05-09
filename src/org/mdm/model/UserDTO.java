/**
 * 
 */
package org.mdm.model;

import java.util.List;

/**
 * Created on 05.04.2017 21:50:45
 * 
 * @author Hubert Popio³kiewicz
 */
public class UserDTO {

	private Long id;
	private String login;
	private String password;

	private List<DeviceDTO> deviceDTOs;

	public UserDTO() {

	}

	public UserDTO(Long userId) {
		this.id = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<DeviceDTO> getDeviceDTOs() {
		return deviceDTOs;
	}

	public void setDeviceDTOs(List<DeviceDTO> deviceDTOs) {
		this.deviceDTOs = deviceDTOs;
	}

}
