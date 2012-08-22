package co.legaspi.httptools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import co.legaspi.httptools.model.Pair;
import co.legaspi.httptools.model.Parameters;

public class Utils {
	/**
	 * Generate a random unique ID
	 * @return
	 */
	public static String generateUid() {
		return UUID.randomUUID().toString();
	}
	
	public static String encodeQueryString(Parameters queryParams) {
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		for ( Pair entry : queryParams.getAll() ) {
			nvps.add(new BasicNameValuePair(entry.getName(), entry.getValue()));
		}
		return URLEncodedUtils.format(nvps, "utf-8");
	}
	
	public static String encodeQueryString(List<? extends NameValuePair> queryParams) {
		return URLEncodedUtils.format(queryParams, "utf-8");
	}
	
	
	/**
	 * Parse an Apache Http Client response into a String
	 * @param resp
	 * @return
	 */
	public static String parseHttpResponse(HttpResponse resp) {
		StringBuilder sb = new StringBuilder();
		
		//sb.append("\n\n-------------------- Response --------------------\n");
		sb.append(resp.getStatusLine());
		sb.append("\n");
		
		for ( Header h : resp.getAllHeaders() ) {
			sb.append(h.getName());
			sb.append(": ");
			sb.append(h.getValue());
			sb.append("\n");
		}
		
		sb.append("\n");
		
		try {
			sb.append( EntityUtils.toString(resp.getEntity()) );
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}

}
