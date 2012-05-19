package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class PageCoordsJso extends JavaScriptObject {

	protected PageCoordsJso() {};

	public static native PageCoordsJso create(int x, int y) /*-{
		return {x: x, y: y};
	}-*/;

	public final native int x() /*-{
		return this.x;
	}-*/;
	
	public final native int y() /*-{
		return this.y;
	}-*/;

}
