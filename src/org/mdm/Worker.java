package org.mdm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Random;

import org.mdm.model.DeviceDTO;
import org.mdm.model.MeasurementDTO;
import org.mdm.model.MeasurementTypeDTO;

import com.google.gson.GsonBuilder;

/**
 * Created on 14.04.2017 17:07:06
 * 
 * @author Hubert Popio³kiewicz
 */
public class Worker {

	static boolean deviceSwitch = false;

	/**
	 * Wysy³a pomiary co 15 sekund z dwóch wczeœniej dodanych urz¹dzeñ.
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		for (;;) {
			HttpURLConnection urlConnection;
			try {
				URL url = new URL("http://46.228.229.73:8080/MeasurementStation/rest/device/addMeasurements");
				URLConnection connection = url.openConnection();
				urlConnection = (HttpURLConnection) connection;
				urlConnection.setRequestMethod("POST");
				connection.setRequestProperty("Authorization",
						"Basic aHViZXJ0X3BvcGlvbGtpZXdpY3o6M2NmNjJkZDA4YTc2MzFkMTMwMjdlZDQ2MTE3NzY3ODI=");
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setRequestProperty("Accept", "application/json");
				connection.setUseCaches(true);
				connection.setDoOutput(true);
				String param = getJSON();
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
				out.write(param);
				out.flush();
				out.close();
				connection.connect();
				InputStream in = connection.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				StringBuilder builder = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null)
					builder.append(line);
				urlConnection.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				deviceSwitch = !deviceSwitch;
			}
			Thread.sleep(15000L);
		}
	}

	private static String getJSON() {
		DeviceDTO deviceDTO;
		if (deviceSwitch) {
			deviceDTO = new DeviceDTO();
			deviceDTO.setSerialNumber("S9DK22KA12205K2");

			MeasurementTypeDTO measurementTypeDTO = new MeasurementTypeDTO();
			measurementTypeDTO.setCode("TMPZB1");

			MeasurementDTO measurementDTO = new MeasurementDTO();
			measurementDTO.setDate(new Date());
			measurementDTO.setValue((new Random().nextInt(300) + 200) / 10.0);

			measurementTypeDTO.setMeasurementDTO(measurementDTO);

			MeasurementTypeDTO measurementTypeDTO2 = new MeasurementTypeDTO();
			measurementTypeDTO2.setCode("CZB1");

			MeasurementDTO measurementDTO2 = new MeasurementDTO();
			measurementDTO2.setDate(new Date());
			measurementDTO2.setValue((new Random().nextInt(70) + 1000) * 1.0);

			measurementTypeDTO2.setMeasurementDTO(measurementDTO2);
			deviceDTO.getMeasurementTypeDTOs().add(measurementTypeDTO);
			deviceDTO.getMeasurementTypeDTOs().add(measurementTypeDTO2);
		} else {
			deviceDTO = new DeviceDTO();
			deviceDTO.setSerialNumber("67HSY201102GGP2");

			MeasurementTypeDTO measurementTypeDTO3 = new MeasurementTypeDTO();
			measurementTypeDTO3.setCode("KTMZS");

			MeasurementDTO measurementDTO3 = new MeasurementDTO();
			measurementDTO3.setDate(new Date());
			measurementDTO3.setValue((new Random().nextInt(350) + 200) / 10.0);

			measurementTypeDTO3.setMeasurementDTO(measurementDTO3);
			deviceDTO.getMeasurementTypeDTOs().add(measurementTypeDTO3);
		}
		return new GsonBuilder().setDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz").create().toJson(deviceDTO);
	}
}
