package co.legaspi.httptools.model;

public class Header extends KeyValuePair {

	public Header(String name, String value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Header [name=" + super.getName() + ", value=" + super.getValue() + "]";
	}
}
