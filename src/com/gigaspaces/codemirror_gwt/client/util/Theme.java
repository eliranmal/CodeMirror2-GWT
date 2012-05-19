package com.gigaspaces.codemirror_gwt.client.util;

public enum Theme {

	COBALT("cobalt"),
	ECLIPSE("eclipse"),
	ELEGANT("elegant"),
	MONOKAI("monokai"),
	NEAT("neat"),
	NIGHT("night"),
	RUBYBLUE("rubyblue");
	
	private String _name;

	private Theme(String name) {
		_name = name;
	}

	public String toString() {
		return _name;
	};
}
