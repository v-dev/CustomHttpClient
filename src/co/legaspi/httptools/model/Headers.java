package co.legaspi.httptools.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Headers implements Iterable<Header> {
	private List<Header> headers = new ArrayList<Header>();
	
	@Override
	public String toString() {
		return "Headers [headers=" + headers + "]";
	}
	
	public int size() { return headers.size(); }
	public void add(Header keyvaluepair) { headers.add(keyvaluepair); }
	
	public Header getByIndex(int idx) {
		Header hdr = new Header("", "");
		if ( !headers.isEmpty() && idx < headers.size() ) {
			hdr = headers.get(idx); 
		}
		
		return hdr;
	}
	
	public Headers getByKey(String key) {
		Headers headersOfKey = new Headers();
		if ( ! headers.isEmpty() ) {
			for ( Header header : headers ) {
				if ( header.getName().contentEquals(key) )
				headersOfKey.add(header);
			}
		}
		return headersOfKey;
	}
	
	public Headers getAll() {
		Headers allHeaders = new Headers();
		if ( ! headers.isEmpty() ) {
			for ( Header header : headers ) {
				allHeaders.add(header);
			}
		}
		return allHeaders;
	}

	@Override
	public Iterator<Header> iterator() {
		//Iterator<Header> i_headers = Collections.unmodifiableList(headers).iterator();
		return Collections.unmodifiableList(headers).iterator();
	}
	

}
