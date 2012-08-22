package co.legaspi.httptools.model;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import co.legaspi.httptools.Utils;

/**
 * Just an empty wrapper around Apache's HTTP Client, UrlEncodedFormEntity
 */
public class CustomUrlEncodedFormEntity extends UrlEncodedFormEntity implements ICustomHttpEntity{
	
	String content = "";

	public CustomUrlEncodedFormEntity(List<? extends NameValuePair> parameters,
			String encoding) throws UnsupportedEncodingException {
		super(parameters, encoding);
		content = Utils.encodeQueryString(parameters);
	}
	
	@Override
	public String getContentAsString() { return content; }

}
