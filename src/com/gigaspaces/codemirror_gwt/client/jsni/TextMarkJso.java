package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class TextMarkJso extends JavaScriptObject {

	protected TextMarkJso() {};

	public final native FromToJso find() /*-{
		return this.find();
	}-*/;
	
	public final native void clear() /*-{
		this.clear();
	}-*/;

}
