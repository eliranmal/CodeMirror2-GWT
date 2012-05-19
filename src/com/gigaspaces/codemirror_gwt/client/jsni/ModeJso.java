package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class ModeJso extends JavaScriptObject {

	protected ModeJso() {};

	public static native ModeJso create(String name) /*-{
		return {name: name};
	}-*/;

	public final native String name() /*-{
		return this.name;
	}-*/;

}
