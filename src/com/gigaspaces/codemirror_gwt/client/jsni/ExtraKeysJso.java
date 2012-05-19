package com.gigaspaces.codemirror_gwt.client.jsni;

import com.gigaspaces.codemirror_gwt.client.util.ExtraKeyProvider;
import com.gigaspaces.codemirror_gwt.client.util.JsUtils;
import com.google.gwt.core.client.JavaScriptObject;

public class ExtraKeysJso extends JavaScriptObject {

	protected ExtraKeysJso() {};

	public static ExtraKeysJso create(ExtraKeyProvider[] extraKeyProviders) {
		return (ExtraKeysJso) JsUtils.buildJsoPrototype(extraKeyProviders);
	}

}
