package com.gigaspaces.codemirror_gwt.client.util;

import com.google.gwt.core.client.JavaScriptObject;

@SuppressWarnings("rawtypes")
public interface Wrapper<W extends Wrapper, J extends JavaScriptObject> {

	W wrap(J jso);
	J unwrap();
}
