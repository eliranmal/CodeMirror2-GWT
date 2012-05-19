package com.gigaspaces.codemirror_gwt.client.jsni;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

public class CodeMirrorOptionsJso extends JavaScriptObject {

	protected CodeMirrorOptionsJso() {};

	public static native CodeMirrorOptionsJso create() /*-{
		return {};
	}-*/;

	public final native String value() /*-{
		return this.value;
	}-*/;
	
	public final native void value(String string) /*-{
		this.value = string;
	}-*/;
	
	public final native ModeJso mode() /*-{
		return this.mode;
	}-*/;
	
	public final native void mode(String mode) /*-{
		this.mode = mode;
	}-*/;
	
	public final native void mode(ModeJso mode) /*-{
		this.mode = mode;
	}-*/;

	public final native String theme() /*-{
		return this.theme;
	}-*/;
	
	public final native void theme(String theme) /*-{
		this.theme = theme;
	}-*/;
	
	public final native int indentUnit() /*-{
		return this.indentUnit;
	}-*/;
	
	public final native void indentUnit(int indentUnit) /*-{
		this.indentUnit = indentUnit;
	}-*/;
	
	public final native boolean smartIndent() /*-{
		return this.smartIndent;
	}-*/;
	
	public final native void smartIndent(boolean smartIndent) /*-{
		this.smartIndent = smartIndent;
	}-*/;
	
	public final native int tabSize() /*-{
		return this.tabSize;
	}-*/;
	
	public final native void tabSize(int tabSize) /*-{
		this.tabSize = tabSize;
	}-*/;
	
	public final native boolean indentWithTabs() /*-{
		return this.indentWithTabs;
	}-*/;
	
	public final native void indentWithTabs(boolean indentWithTabs) /*-{
		this.indentWithTabs = indentWithTabs;
	}-*/;
	
	public final native boolean electricChars() /*-{
		return this.electricChars;
	}-*/;
	
	public final native void electricChars(boolean electricChars) /*-{
		this.electricChars = electricChars;
	}-*/;
	
	public final native boolean autoClearEmptyLines() /*-{
		return this.autoClearEmptyLines;
	}-*/;
	
	public final native void autoClearEmptyLines(boolean autoClearEmptyLines) /*-{
		this.autoClearEmptyLines = autoClearEmptyLines;
	}-*/;
	
	public final native String keyMap() /*-{
		return this.keyMap;
	}-*/;
	
	public final native void keyMap(String keyMap) /*-{
		this.keyMap = keyMap;
	}-*/;
	
	public final native ExtraKeysJso extraKeys() /*-{
		return this.extraKeys;
	}-*/;
	
	public final native void extraKeys(ExtraKeysJso extraKeys) /*-{
		this.extraKeys = extraKeys;
	}-*/;
	
	public final native boolean lineWrapping() /*-{
		return this.lineWrapping;
	}-*/;
	
	public final native void lineWrapping(boolean lineWrapping) /*-{
		this.lineWrapping = lineWrapping;
	}-*/;
	
	public final native boolean lineNumbers() /*-{
		return this.lineNumbers;
	}-*/;
	
	public final native void lineNumbers(boolean lineNumbers) /*-{
		this.lineNumbers = lineNumbers;
	}-*/;
	
	public final native int firstLineNumber() /*-{
		return this.firstLineNumber;
	}-*/;
	
	public final native void firstLineNumber(int firstLineNumber) /*-{
		this.firstLineNumber = firstLineNumber;
	}-*/;
	
	public final native boolean gutter() /*-{
		return this.gutter;
	}-*/;
	
	public final native void gutter(boolean gutter) /*-{
		this.gutter = gutter;
	}-*/;
	
	public final native boolean fixedGutter() /*-{
		return this.fixedGutter;
	}-*/;
	
	public final native void fixedGutter(boolean fixedGutter) /*-{
		this.fixedGutter = fixedGutter;
	}-*/;
	
	public final native boolean readOnly() /*-{
		return this.readOnly;
	}-*/;
	
	public final native void readOnly(boolean readOnly) /*-{
		this.readOnly = readOnly;
	}-*/;
	
	public final native OnChangeHandlerJso onChange() /*-{
		return this.onChange;
	}-*/;
	
	public final native void onChange(OnChangeHandlerJso func) /*-{
		this.onChange = func;
	}-*/;
	
	public final native OnCursorActivityHandlerJso onCursorActivity() /*-{
		return this.onCursorActivity;
	}-*/;
	
	public final native void onCursorActivity(OnCursorActivityHandlerJso func) /*-{
		this.onCursorActivity = func;
	}-*/;
	
	public final native JavaScriptObject onGutterClick() /*-{
		return this.onGutterClick;
	}-*/;
	
	public final native void onGutterClick(JavaScriptObject func) /*-{
		this.onGutterClick = func;
	}-*/;
	
	public final native JavaScriptObject onFocus() /*-{
		return this.onFocus;
	}-*/;
	
	public final native void onFocus(JavaScriptObject func) /*-{
		this.onFocus = func;
	}-*/;
	
	public final native JavaScriptObject onBlur() /*-{
		return this.onBlur;
	}-*/;
	
	public final native void onBlur(JavaScriptObject func) /*-{
		this.onBlur = func;
	}-*/;
	
	public final native JavaScriptObject onScroll() /*-{
		return this.onScroll;
	}-*/;
	
	public final native void onScroll(JavaScriptObject func) /*-{
		this.onScroll = func;
	}-*/;
	
	public final native JavaScriptObject onHighlightComplete() /*-{
		return this.onHighlightComplete;
	}-*/;
	
	public final native void onHighlightComplete(JavaScriptObject func) /*-{
		this.onHighlightComplete = func;
	}-*/;
	
	public final native JavaScriptObject onUpdate() /*-{
		return this.onUpdate;
	}-*/;
	
	public final native void onUpdate(JavaScriptObject func) /*-{
		this.onUpdate = func;
	}-*/;
	
	public final native boolean matchBrackets() /*-{
		return this.matchBrackets;
	}-*/;
	
	public final native void matchBrackets(boolean matchBrackets) /*-{
		this.matchBrackets = matchBrackets;
	}-*/;
	
	public final native int workTime() /*-{
		return this.workTime;
	}-*/;
	
	public final native void workTime(int millis) /*-{
		this.workTime = millis;
	}-*/;
	
	public final native int workDelay() /*-{
		return this.workDelay;
	}-*/;
	
	public final native void workDelay(int millis) /*-{
		this.workDelay = millis;
	}-*/;
	
	public final native int pollInterval() /*-{
		return this.pollInterval;
	}-*/;
	
	public final native void pollInterval(int millis) /*-{
		this.pollInterval = millis;
	}-*/;
	
	public final native int undoDepth() /*-{
		return this.undoDepth;
	}-*/;
	
	public final native void undoDepth(int undoDepth) /*-{
		this.undoDepth = undoDepth;
	}-*/;
	
	public final native int tabindex() /*-{
		return this.tabindex;
	}-*/;
	
	public final native void tabindex(int tabindex) /*-{
		this.tabindex = tabindex;
	}-*/;
	
	public final native Document document() /*-{
		return this.document;
	}-*/;
	
	public final native void document(Document document) /*-{
		this.document = document;
	}-*/;
	
	public final native JavaScriptObject onKeyEvent() /*-{
		return this.onKeyEvent;
	}-*/;
	
	public final native void onKeyEvent(JavaScriptObject func) /*-{
		this.onKeyEvent = func;
	}-*/;

}
