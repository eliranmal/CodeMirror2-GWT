package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class MIMEJso extends JavaScriptObject {

	protected MIMEJso() {}

	public final native String mime() /*-{
		return this.mime;
	}-*/;

}