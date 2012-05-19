package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class OnChangeHandlerJso extends JavaScriptObject {

	protected OnChangeHandlerJso() {};

	public static native OnChangeHandlerJso create() /*-{
		return function(cm, changeInfo) {
			@com.gigaspaces.codemirror_gwt.client.events.OnChangeHandler::handle(Lcom/gigaspaces/codemirror_gwt/client/jsni/CodeMirrorJso;Lcom/gigaspaces/codemirror_gwt/client/jsni/ChangeInfoJso;)(cm, changeInfo);
		};
	}-*/;

}
