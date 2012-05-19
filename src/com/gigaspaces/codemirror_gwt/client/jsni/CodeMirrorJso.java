package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.Element;

public class CodeMirrorJso extends JavaScriptObject {

	protected CodeMirrorJso() {}

	public static native CodeMirrorJso create(Element container) /*-{
		return $wnd.CodeMirror(container);
	}-*/;
	
	public static native CodeMirrorJso create(Element container, CodeMirrorOptionsJso options) /*-{
		return $wnd.CodeMirror(container, options);
	}-*/;
	
	public static native CodeMirrorJso fromTextArea(Element textArea, CodeMirrorOptionsJso options) /*-{
		return $wnd.CodeMirror.fromTextArea(textArea, options);
	}-*/;

	public final native String getValue() /*-{
		return this.getValue();
	}-*/;
	
	public final native void setValue(String string) /*-{
		this.setValue(string);
	}-*/;
	
	public final native String getSelection() /*-{
		return this.getSelection();
	}-*/;
	
	public final native void replaceSelection(String selection) /*-{
		this.replaceSelection(selection);
	}-*/;
	
	public final native void focus() /*-{
		this.focus();
	}-*/;
	
	public final native void scrollTo(int x, int y) /*-{
		this.scrollTo(x, y);
	}-*/;
	
	public final native void setOption(String name, JavaScriptObject value) /*-{
		this.setOption(name, value);
	}-*/;
	
	public final native JavaScriptObject getOption(String name) /*-{
		return this.getOption(name);
	}-*/;
	
	public final native CoordsJso cursorCoords(boolean start) /*-{
		return this.cursorCoords(start);
	}-*/;
	
	public final native CoordsJso charCoords(PosJso pos) /*-{
		return this.charCoords(pos);
	}-*/;
	
	public final native PosJso coordsChar(PageCoordsJso pageCoords) /*-{
		return this.coordsChar(pageCoords);
	}-*/;
	
	public final native void undo() /*-{
		this.undo();
	}-*/;
	
	public final native void redo() /*-{
		this.redo();
	}-*/;
	
	public final native HistorySizeJso historySize() /*-{
		return this.historySize();
	}-*/;
	
	public final native void clearHistory() /*-{
		this.clearHistory();
	}-*/;
	
	public final native void indentLine(int line) /*-{
		this.indentLine(line);
	}-*/;
	
	public final native void indentLine(int line, boolean dir) /*-{
		this.indentLine(line, dir);
	}-*/;
	
	public final native TokenJso getTokenAt(PosJso pos) /*-{
		return this.getTokenAt(pos);
	}-*/;
	
	public final native TextMarkJso markText(PosJso from, PosJso to, String className) /*-{
		return this.markText(from, to, className);
	}-*/;
	
	public final native BookmarkJso setBookmark(PosJso pos) /*-{
		return this.setBookmark(pos);
	}-*/;
	
	public final native LineHandleJso setMarker(int line, String text, String className) /*-{
		return this.setMarker(line, text, className);
	}-*/;
	
	public final native void clearMarker(int line) /*-{
		this.clearMarker(line);
	}-*/;
	
	public final native void clearMarker(LineHandleJso line) /*-{
		this.clearMarker(line);
	}-*/;
	
	public final native JavaScriptObject setLineClass(int line, String className) /*-{
		return this.setLineClass(line, className);
	}-*/;
	
	public final native LineHandleJso setLineClass(LineHandleJso line, String className) /*-{
		return this.setLineClass(line, className);
	}-*/;
	
	public final native LineHandleJso hideLine(int line) /*-{
		return this.hideLine(line);
	}-*/;
	
	public final native LineHandleJso hideLine(LineHandleJso line) /*-{
		return this.hideLine(line);
	}-*/;
	
	public final native LineHandleJso showLine(int line) /*-{
		return this.showLine(line);
	}-*/;
	
	public final native LineHandleJso showLine(LineHandleJso line) /*-{
		return this.showLine(line);
	}-*/;
	
	public final native void onDeleteLine(LineHandleJso line, JavaScriptObject func) /*-{
		this.onDeleteLine(line, func);
	}-*/;
	
	public final native LineInfoJso lineInfo(int line) /*-{
		return this.lineInfo(line);
	}-*/;
	
	public final native LineInfoJso lineInfo(LineHandleJso line) /*-{
		return this.lineInfo(line);
	}-*/;
	
	public final native LineHandleJso getLineHandle(int num) /*-{
		return this.getLineHandle(num);
	}-*/;
	
	public final native void addWidget(PosJso pos, Element node, boolean scrollIntoView) /*-{
		this.addWidget(pos, node, scrollIntoView);
	}-*/;
	
	public final native void matchBrackets() /*-{
		this.matchBrackets();
	}-*/;
	
	public final native int lineCount() /*-{
		return this.lineCount();
	}-*/;
	
	public final native PosJso getCursor(boolean start) /*-{
		return this.getCursor(start);
	}-*/;
	
	public final native boolean somethingSelected() /*-{
		return this.somethingSelected();
	}-*/;
	
	public final native void setCursor(PosJso pos) /*-{
		this.setCursor(pos);
	}-*/;
	
	public final native void setSelection(PosJso start, PosJso end) /*-{
		this.setSelection(start, end);
	}-*/;
	
	public final native String getLine(int n) /*-{
		return this.getLine(n);
	}-*/;
	
	public final native void setLine(int n, String text) /*-{
		this.setLine(n, text);
	}-*/;
	
	public final native void removeLine(int n) /*-{
		this.removeLine(n);
	}-*/;
	
	public final native String getRange(PosJso from, PosJso to) /*-{
		return this.getRange(from, to);
	}-*/;
	
	public final native void replaceRange(String string, PosJso from, PosJso to) /*-{
		this.replaceRange(string, from, to);
	}-*/;
	
	public final native void replaceRange(String string, PosJso from) /*-{
		this.replaceRange(string, from);
	}-*/;
	
	public final native PosJso posFromIndex(int index) /*-{
		return this.posFromIndex(index);
	}-*/;
	
	public final native int indexFromPos(PosJso pos) /*-{
		return this.indexFromPos(pos);
	}-*/;
	
	
	/**
	 * low-level methods
	 */
	
	public final native JavaScriptObject operation(JavaScriptObject func) /*-{
		return this.operation(func);
	}-*/;
	
	public final native void refresh() /*-{
		this.refresh();
	}-*/;
	
	public final native Element getInputField() /*-{
		return this.getInputField();
	}-*/;
	
	public final native Element getWrapperElement() /*-{
		return this.getWrapperElement();
	}-*/;
	
	public final native Element getScrollerElement() /*-{
		return this.getScrollerElement();
	}-*/;
	
	public final native Element getGutterElement() /*-{
		return this.getGutterElement();
	}-*/;
	
	public final native JavaScriptObject getStateAfter(int line) /*-{
		return this.getStateAfter(line);
	}-*/;
	
	
	/**
	 * If fromTextArea.
	 */
	
	public final native void save() /*-{
		this.save();
	}-*/;
	
	public final native void toTextArea() /*-{
		this.toTextArea();
	}-*/;
	
	public final native Element getTextArea() /*-{
		return this.getTextArea();
	}-*/;
	
	/**
	 * Code mirror prototype augmentation.
	 */
	public final native void defineExtension(String name, JavaScriptObject value) /*-{
		this.CodeMirror.defineExtension(name, value);
	}-*/;


	public static native JsArray<MIMEJso> listMIMEs() /*-{
		return $wnd.CodeMirror.listMIMEs();
	}-*/;
	
	public static native JsArrayString listModes() /*-{
		return $wnd.CodeMirror.listModes();
	}-*/;

}