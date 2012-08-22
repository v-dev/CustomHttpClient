package co.legaspi.httptools;

/**
 * Custom HTTP Request wrapper API around Apache HTTP Client.
 * @author vernal
 *
 */
public interface CustomHttpRequest {
	public CustomHttpResponse submit();
}
