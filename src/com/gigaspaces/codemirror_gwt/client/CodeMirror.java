package com.gigaspaces.codemirror_gwt.client;

import java.util.List;

import com.gigaspaces.codemirror_gwt.client.config.CodeMirrorOptions;
import com.gigaspaces.codemirror_gwt.client.jsni.BookmarkJso;
import com.gigaspaces.codemirror_gwt.client.jsni.CodeMirrorJso;
import com.gigaspaces.codemirror_gwt.client.jsni.CoordsJso;
import com.gigaspaces.codemirror_gwt.client.jsni.HistorySizeJso;
import com.gigaspaces.codemirror_gwt.client.jsni.LineHandleJso;
import com.gigaspaces.codemirror_gwt.client.jsni.LineInfoJso;
import com.gigaspaces.codemirror_gwt.client.jsni.PageCoordsJso;
import com.gigaspaces.codemirror_gwt.client.jsni.PosJso;
import com.gigaspaces.codemirror_gwt.client.jsni.TextMarkJso;
import com.gigaspaces.codemirror_gwt.client.jsni.TokenJso;
import com.gigaspaces.codemirror_gwt.client.util.JsUtils;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class CodeMirror extends Widget implements Wrapper<CodeMirror, CodeMirrorJso> {

	private CodeMirrorJso codeMirrorJso;
	private TextArea textArea;
	private CodeMirrorOptions codeMirrorOptions;
	private Element container;

	private LoadArguments loadArguments;
	private enum LoadArguments {
		CONTAINER, CONTAINER_OPTIONS, TEXTAREA_OPTIONS;
	}

	private boolean forceFit;
	
	public CodeMirror() {

		container = DOM.createDiv();
		setElement(container);

		loadArguments = LoadArguments.CONTAINER;
	}

	public CodeMirror(CodeMirrorJso jso) {
		codeMirrorJso = jso;
	}

	public CodeMirror(CodeMirrorOptions options) {

		this();

		codeMirrorOptions = options;

		loadArguments = LoadArguments.CONTAINER_OPTIONS;
	}
	
	public CodeMirror(TextArea textArea, CodeMirrorOptions options) {

		this();

		this.textArea = textArea;
		codeMirrorOptions = options;
		
		container.appendChild(textArea.getElement());

		loadArguments = LoadArguments.TEXTAREA_OPTIONS;
	}

	@Override
	protected void onLoad() {
		super.onLoad();

		switch (loadArguments) {
		case CONTAINER:
			create();
			break;
		case CONTAINER_OPTIONS:
			createWithOptions();
			break;
		case TEXTAREA_OPTIONS:
			createFromTextAreaWithOptions();
			break;
		}

		if (isForceFit()) {
			applyForceFit();
		}
	}


	public CodeMirrorOptions getCodeMirrorOptions() {
		return codeMirrorOptions;
	}


	private void create() {
		codeMirrorJso = CodeMirrorJso.create(container);
	}

	private void createWithOptions() {
		codeMirrorJso = CodeMirrorJso.create(container, codeMirrorOptions.unwrap());
	}

	private void createFromTextAreaWithOptions() {
		codeMirrorJso = CodeMirrorJso.fromTextArea(textArea.getElement(), codeMirrorOptions.unwrap());
	}


	/**
	 * JSO composition
	 */

	public String getValue() {
		return codeMirrorJso.getValue();
	}
	
	public void setValue(String string) {
		// TODO: add load assertion, throw custom exception
		codeMirrorJso.setValue(string);
	}
	
	public String getSelection() {
		return codeMirrorJso.getSelection();
	}
	
	public void replaceSelection(String selection) {
		codeMirrorJso.replaceSelection(selection);
	}
	
	public void focus() {
		codeMirrorJso.focus();
	}
	
	public void scrollTo(int x, int y) {
		codeMirrorJso.scrollTo(x, y);
	}
	
	public void setOption(String name, JavaScriptObject value) {
		codeMirrorJso.setOption(name, value);
	}
	
	public JavaScriptObject getOption(String name) {
		return codeMirrorJso.getOption(name);
	}
	
	public CoordsJso cursorCoords(boolean start) {
		return codeMirrorJso.cursorCoords(start);
	}
	
	public CoordsJso charCoords(PosJso pos) {
		return codeMirrorJso.charCoords(pos);
	}
	
	public PosJso coordsChar(PageCoordsJso pageCoords) {
		return codeMirrorJso.coordsChar(pageCoords);
	}
	
	public void undo() {
		codeMirrorJso.undo();
	}
	
	public void redo() {
		codeMirrorJso.redo();
	}
	
	public HistorySizeJso historySize() {
		return codeMirrorJso.historySize();
	}
	
	public void clearHistory() {
		codeMirrorJso.clearHistory();
	}
	
	public void indentLine(int line) {
		codeMirrorJso.indentLine(line);
	}
	
	public void indentLine(int line, boolean dir) {
		codeMirrorJso.indentLine(line, dir);
	}
	
	public TokenJso getTokenAt(PosJso pos) {
		return codeMirrorJso.getTokenAt(pos);
	}
	
	public TextMarkJso markText(PosJso from, PosJso to, String className) {
		return codeMirrorJso.markText(from, to, className);
	}
	
	public BookmarkJso setBookmark(PosJso pos) {
		return codeMirrorJso.setBookmark(pos);
	}
	
	public LineHandleJso setMarker(int line, String text, String className) {
		return codeMirrorJso.setMarker(line, text, className);
	}
	
	public void clearMarker(int line) {
		codeMirrorJso.clearMarker(line);
	}
	
	public void clearMarker(LineHandleJso line) {
		codeMirrorJso.clearMarker(line);
	}
	
	public JavaScriptObject setLineClass(int line, String className) {
		return codeMirrorJso.setLineClass(line, className);
	}
	
	public LineHandleJso setLineClass(LineHandleJso line, String className) {
		return codeMirrorJso.setLineClass(line, className);
	}
	
	public LineHandleJso hideLine(int line) {
		return codeMirrorJso.hideLine(line);
	}
	
	public LineHandleJso hideLine(LineHandleJso line) {
		return codeMirrorJso.hideLine(line);
	}
	
	public LineHandleJso showLine(int line) {
		return codeMirrorJso.showLine(line);
	}
	
	public LineHandleJso showLine(LineHandleJso line) {
		return codeMirrorJso.showLine(line);
	}
	
	public void onDeleteLine(LineHandleJso line, JavaScriptObject func) {
		codeMirrorJso.onDeleteLine(line, func);
	}
	
	public LineInfoJso lineInfo(int line) {
		return codeMirrorJso.lineInfo(line);
	}
	
	public LineInfoJso lineInfo(LineHandleJso line) {
		return codeMirrorJso.lineInfo(line);
	}
	
	public LineHandleJso getLineHandle(int num) {
		return codeMirrorJso.getLineHandle(num);
	}
	
	public void addWidget(PosJso pos, Element node, boolean scrollIntoView) {
		codeMirrorJso.addWidget(pos, node, scrollIntoView);
	}
	
	public void matchBrackets() {
		codeMirrorJso.matchBrackets();
	}
	
	public int lineCount() {
		return codeMirrorJso.lineCount();
	}
	
	public PosJso getCursor(boolean start) {
		return codeMirrorJso.getCursor(start);
	}
	
	public boolean somethingSelected() {
		return codeMirrorJso.somethingSelected();
	}
	
	public void setCursor(PosJso pos) {
		codeMirrorJso.setCursor(pos);
	}
	
	public void setSelection(PosJso start, PosJso end) {
		codeMirrorJso.setSelection(start, end);
	}
	
	public String getLine(int n) {
		return codeMirrorJso.getLine(n);
	}
	
	public void setLine(int n, String text) {
		codeMirrorJso.setLine(n, text);
	}
	
	public void removeLine(int n) {
		codeMirrorJso.removeLine(n);
	}
	
	public String getRange(PosJso from, PosJso to) {
		return codeMirrorJso.getRange(from, to);
	}
	
	public void replaceRange(String string, PosJso from, PosJso to) {
		codeMirrorJso.replaceRange(string, from, to);
	}
	
	public void replaceRange(String string, PosJso from) {
		codeMirrorJso.replaceRange(string, from);
	}
	
	public PosJso posFromIndex(int index) {
		return codeMirrorJso.posFromIndex(index);
	}
	
	public int indexFromPos(PosJso pos) {
		return codeMirrorJso.indexFromPos(pos);
	}
	
	
	/**
	 * low-level methods
	 */
	
	public JavaScriptObject operation(JavaScriptObject func) {
		return codeMirrorJso.operation(func);
	}
	
	public void refresh() {
		codeMirrorJso.refresh();
	}
	
	public Element getInputField() {
		return codeMirrorJso.getInputField();
	}
	
	public Element getWrapperElement() {
		return codeMirrorJso.getWrapperElement();
	}
	
	public Element getScrollerElement() {
		return codeMirrorJso.getScrollerElement();
	}
	
	public Element getGutterElement() {
		return codeMirrorJso.getGutterElement();
	}
	
	public JavaScriptObject getStateAfter(int line) {
		return codeMirrorJso.getStateAfter(line);
	}
	
	
	/**
	 * If fromTextArea.
	 */
	
	public void save() {
		codeMirrorJso.save();
	}
	
	public void toTextArea() {
		codeMirrorJso.toTextArea();
	}
	
	public Element getTextArea() {
		return codeMirrorJso.getTextArea();
	}
	
	/**
	 * Code mirror prototype augmentation.
	 */
	public void defineExtension(String name, JavaScriptObject value) {
		codeMirrorJso.defineExtension(name, value);
	}


	/**
	 * Static information
	 */
	
/*	public static List<MIME> listMIMEs() {
		List<MIMEJso> jsoList = JsUtils.toJsoList(CodeMirrorJso.listMIMEs());
		List<MIME> jsoWrapperList = JsUtils.toJsoWrapperList(jsoList);
		return jsoWrapperList;
	}
*/
	public static List<String> listModes() {
		return JsUtils.toList(CodeMirrorJso.listModes());
	}
	

	/**
	 * GWT Wrapper augmentation
	 */

	/**
	 * Sets the widget to fit its container, pre-load. If the widget is not layed out inside a container,
	 * or if it does not have explicit height, it will auto-resize to fit its content.
	 * <p style="color: #35f">
	 * <em>currently only tested for container initializations of CodeMirror - do not use in 
	 * conjunction with {@code fromTextArea()}, or the {@code TextArea} arg constructor.</em>
	 * </p>
	 * 
	 * @param forceFit {@code true} to force fit to the widget container, {@code false} otherwise.
	 */
	public void setForceFit(boolean forceFit) {
		this.forceFit = forceFit;
	}

	public boolean isForceFit() {
		return forceFit;
	}
	
	private void applyForceFit() {
		codeMirrorJso.getWrapperElement().getStyle().setHeight(100, Unit.PCT);
		codeMirrorJso.getScrollerElement().getStyle().setHeight(100, Unit.PCT);
	}


	@Override
	public CodeMirrorJso unwrap() {
		return codeMirrorJso;
	}

	@Override
	public CodeMirror wrap(CodeMirrorJso jso) {
		return new CodeMirror(jso);
	}
	
}
