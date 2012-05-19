package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class BookmarkJso extends JavaScriptObject {

	protected BookmarkJso() {};

	public final native PosJso find() /*-{
		return this.find();
	}-*/;

	public final native void clear() /*-{
		this.clear();
	}-*/;

}