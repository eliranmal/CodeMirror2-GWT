package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class LineInfoJso extends JavaScriptObject {

	protected LineInfoJso() {};

	public final native LineHandleJso handle() /*-{
		return this.handle;
	}-*/; 

	public final native int line() /*-{
		return this.line;
	}-*/; 
	
	public final native String lineClass() /*-{
		return this.lineClass;
	}-*/; 
	
	public final native String markerClass() /*-{
		return this.markerClass;
	}-*/; 
	
	public final native String markerText() /*-{
		return this.markerText;
	}-*/; 
	
	public final native String text() /*-{
		return this.text;
	}-*/;
	
}
