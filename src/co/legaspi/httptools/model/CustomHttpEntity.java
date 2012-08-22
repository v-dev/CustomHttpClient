package co.legaspi.httptools.model;

import org.apache.http.entity.BasicHttpEntity;

/**
 * Just an empty wrapper around Apache's HTTP Client, BasicHttpEntity
 */
public class CustomHttpEntity extends BasicHttpEntity implements ICustomHttpEntity {

	@Override
	/**
	 * returns empty String for now
	 */
	public String getContentAsString() {
		// TODO Auto-generated method stub
		return "";
	}
}
