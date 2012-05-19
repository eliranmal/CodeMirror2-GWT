package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;

public class CoordsJso extends JavaScriptObject {

	protected CoordsJso() {};

	public static native CoordsJso create(int x, int y, int yBot) /*-{
		return {x: x, y: y, yBot: yBot};
	}-*/;

	public final native int x() /*-{
		return this.x;
	}-*/;
	
	public final native int y() /*-{
		return this.y;
	}-*/;
	
	public final native int yBot() /*-{
		return this.yBot;
	}-*/;

}
