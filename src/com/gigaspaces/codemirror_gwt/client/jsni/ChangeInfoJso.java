package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class ChangeInfoJso extends JavaScriptObject {

	protected ChangeInfoJso() {};

	public final native PosJso from() /*-{
		return this.from;
	}-*/;
	
	public final native PosJso to() /*-{
		return this.to;
	}-*/;
	
	public final native JsArrayString text() /*-{
		return this.text;
	}-*/;
	
	public final native TokenJso next() /*-{
		return this.next;
	}-*/;

}
