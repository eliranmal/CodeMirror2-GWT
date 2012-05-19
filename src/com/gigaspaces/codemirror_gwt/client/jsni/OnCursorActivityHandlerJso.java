package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class OnCursorActivityHandlerJso extends JavaScriptObject {

	protected OnCursorActivityHandlerJso() {};

	public static native OnCursorActivityHandlerJso create() /*-{
		return function() {
			@com.gigaspaces.codemirror_gwt.client.events.OnCursorActivityHandler::handle()();
		};
	}-*/;

}
