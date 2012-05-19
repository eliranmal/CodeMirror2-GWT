package com.gigaspaces.codemirror_gwt.client.util;

public enum KeyMap {

	EMACS,
	VIM;
	
	public String toString() {
		return this.name().toLowerCase();
	};
}
