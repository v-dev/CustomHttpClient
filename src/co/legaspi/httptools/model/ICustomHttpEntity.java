package co.legaspi.httptools.model;

import org.apache.http.HttpEntity;

/**
 * Just an empty wrapper around Apache's HTTP Client, HttpEntity
 */
public interface ICustomHttpEntity extends HttpEntity {
	public String getContentAsString();
}
