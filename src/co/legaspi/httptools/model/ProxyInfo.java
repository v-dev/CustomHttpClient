package co.legaspi.httptools.model;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Container for Proxy configuration information. This does not support auto
 * proxy configuration scripts such as "proxy.pac" files.
 * @author vernal
 *
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ProxyInfo {
	
	private Protocol proxyProtocol = Protocol.HTTP;
	private String proxyHost = "";
	private int proxyPort = 8080;
	private boolean useProxy = false;
	
	/**
	 * No-args constructor has default of: http, no host, port 8080, and disabled
	 */
	public ProxyInfo() { super(); }
	
	/**
	 * 
	 * @param proxyProtocol http or https
	 * @param proxyHost
	 * @param proxyPort
	 */
	public ProxyInfo(Protocol proxyProtocol, String proxyHost, int proxyPort) {
		super();
		this.proxyProtocol = proxyProtocol;
		this.proxyHost = proxyHost;
		this.proxyPort = proxyPort;
	}
	
	
	
	@Override
	public String toString() {
		return "ProxyInfo [proxyProtocol=" + proxyProtocol + ", proxyHost="
				+ proxyHost + ", proxyPort=" + proxyPort + ", useProxy="
				+ useProxy + "]";
	}

	
	
	/**
	 * Check to see if currently configured to use a proxy.
	 * @return true or false depending on whether the proxy will be used or not.
	 */
	public boolean isProxyEnabled() { return useProxy; }
	
	/**
	 * Do not use a proxy.  Default is disabled.
	 */
	public void disableProxy() { useProxy = false; }
	
	/**
	 * Use the proxy configured.  Default is disabled.
	 */
	public void enableProxy() { useProxy = true; }
	
	
	public Protocol getProxyProtocol() { return proxyProtocol; }
	public void setProxyProtocol(Protocol proxyProtocol) { this.proxyProtocol = proxyProtocol; }

	public String getProxyHost() { return proxyHost; }
	public void setProxyHost(String proxyHost) { this.proxyHost = proxyHost; }

	public int getProxyPort() { return proxyPort; }
	public void setProxyPort(int proxyPort) { this.proxyPort = proxyPort; }
	
}
