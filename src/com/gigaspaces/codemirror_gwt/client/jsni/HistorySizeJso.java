package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class HistorySizeJso extends JavaScriptObject {

	protected HistorySizeJso() {};

	public final native int undo()  /*-{
		return this.undo;
	}-*/;

	public final native int redo()  /*-{
		return this.redo;
	}-*/;
	
}
