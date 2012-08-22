package co.legaspi.httptools.model;

/**
 * A Pair in which every Key must not be null or empty.  It defaults to "key" if passed a null or empty String.
 * @author vernal
 *
 */
public class KeyValuePair implements Pair {
	
	private String key = "key";
	private String value = "";
	
	
	@Override
	public String toString() {
		return "KeyValuePair [key=" + key + ", value=" + value + "]";
	}

	/**
	 * They key/name and value.  Key defaults to "key" if passed a null or empty String.
	 * @param key
	 * @param value
	 */
	public KeyValuePair(String key, String value) {
		setName(key);
		setValue(value);
	}
	
	public String getName() { return key; }
	public String getValue() { return value; }
	
	public void setName(String key) { 
		if ( key != "" && key != null )
			this.key = key;
	}
	
	public void setValue(String value) {
		if ( value != null )
			this.value = value;
	}

}
