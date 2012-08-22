package co.legaspi.httptools.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Parameters implements Iterable<Pair> {
	private List<Pair> parameters = new ArrayList<Pair>();
	
	@Override
	public String toString() {
		return "Parameters [parameters=" + parameters + "]";
	}
	
	public int size() { return parameters.size(); }
	public void add(Pair keyvaluepair) { parameters.add(keyvaluepair); }
	
	public Pair getByIndex(int idx) {
		KeyValuePair param = new KeyValuePair("", "");
		if ( !parameters.isEmpty() && idx < parameters.size() ) {
			param = (KeyValuePair) parameters.get(idx); 
		}
		
		return param;
	}
	
	public Parameters getByKey(String key) {
		Parameters paramsOfKey = new Parameters();
		if ( ! parameters.isEmpty() ) {
			for ( Pair param : parameters ) {
				if ( param.getName().contentEquals(key) )
				paramsOfKey.add(param);
			}
		}
		return paramsOfKey;
	}
	
	public Parameters getAll() {
		Parameters allParams = new Parameters();
		if ( ! parameters.isEmpty() ) {
			for ( Pair param : parameters ) {
				allParams.add(param);
			}
		}
		return allParams;
	}

	@Override
	public Iterator<Pair> iterator() {
		//Iterator<Header> i_headers = Collections.unmodifiableList(headers).iterator();
		return Collections.unmodifiableList(parameters).iterator();
	}
	

}
