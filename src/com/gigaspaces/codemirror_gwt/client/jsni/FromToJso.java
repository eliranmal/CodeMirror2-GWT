package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class FromToJso extends JavaScriptObject {

	protected FromToJso() {};

	public final native PosJso from() /*-{
		return this.from;
	}-*/;
	
	public final native PosJso to() /*-{
		return this.to;
	}-*/;

}
