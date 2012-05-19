package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class PosJso extends JavaScriptObject {

	protected PosJso() {}

	public static native PosJso create(int line, int ch) /*-{
		return {line: line, ch: ch};
	}-*/;

	public final native int line() /*-{
		return this.line;
	}-*/;
	
	public final native int ch() /*-{
		return this.ch;
	}-*/;

}
