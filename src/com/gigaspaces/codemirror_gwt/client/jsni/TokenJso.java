package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class TokenJso extends JavaScriptObject {

	protected TokenJso() {};

	public final native String start() /*-{
		return this.start;
	}-*/;
	
	public final native String end() /*-{
		return this.end;
	}-*/;

	public final native String string() /*-{
		return this.string;
	}-*/;
	
	public final native String className() /*-{
		return this.className;
	}-*/;
	
	// TODO: consider structure implementation for the return type (as StateJso).
	public final native JavaScriptObject state() /*-{
		return this.state;
	}-*/;
	
}
