package com.gigaspaces.codemirror_gwt.client.config;

import com.gigaspaces.codemirror_gwt.client.util.ExtraKeyProvider;
import com.google.gwt.core.client.JavaScriptObject;

public class AutoCompletionExtraKey implements ExtraKeyProvider {

	@Override
	public String getKeyName() {
		return "Ctrl-Space";
	}

	@Override
	public native JavaScriptObject getFunc() /*-{
		return function(cm) {
					$wnd.CodeMirror.simpleHint(cm, $wnd.CodeMirror.javascriptHint);
				};
	}-*/;

}