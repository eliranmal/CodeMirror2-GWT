package com.gigaspaces.codemirror_gwt.client.config;

import com.gigaspaces.codemirror_gwt.client.events.OnChangeHandler;
import com.gigaspaces.codemirror_gwt.client.events.OnCursorActivityHandler;
import com.gigaspaces.codemirror_gwt.client.jsni.CodeMirrorOptionsJso;
import com.gigaspaces.codemirror_gwt.client.jsni.ModeJso;
import com.gigaspaces.codemirror_gwt.client.util.KeyMap;
import com.gigaspaces.codemirror_gwt.client.util.ModeType;
import com.gigaspaces.codemirror_gwt.client.util.Theme;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

@SuppressWarnings("rawtypes")
public abstract class BaseCodeMirrorOptions<T extends BaseCodeMirrorOptions> implements Wrapper<BaseCodeMirrorOptions, CodeMirrorOptionsJso> {

	private CodeMirrorOptionsJso optionsJso;
	
	public BaseCodeMirrorOptions(CodeMirrorOptionsJso jso) {
		optionsJso = jso;
	}
	
	public BaseCodeMirrorOptions() {
		optionsJso = CodeMirrorOptionsJso.create();
	}
	
	@Override
	public BaseCodeMirrorOptions wrap(CodeMirrorOptionsJso jso) {
		return new CodeMirrorOptions(jso);
	}

	@Override
	public CodeMirrorOptionsJso unwrap() {
		return optionsJso;
	}

	public String value() {
		return optionsJso.value();
	}
	public T value(String value) {
		this.optionsJso.value(value);
		return (T)this;
	}
	public ModeJso mode() {
		return optionsJso.mode();
	}
	public T mode(ModeType mode) {
		this.optionsJso.mode(mode.toString());
		return (T)this;
	}
	public String theme() {
		return optionsJso.theme();
	}
	public T theme(Theme theme) {
		this.optionsJso.theme(theme.toString());
		return (T)this;
	}
	public int indentUnit() {
		return optionsJso.indentUnit();
	}
	public T indentUnit(int indentUnit) {
		this.optionsJso.indentUnit(indentUnit);
		return (T)this;
	}
	public boolean smartIndent() {
		return optionsJso.smartIndent();
	}
	public T smartIndent(boolean smartIndent) {
		this.optionsJso.smartIndent(smartIndent);
		return (T)this;
	}
	public int tabSize() {
		return optionsJso.tabSize();
	}
	public T tabSize(int tabSize) {
		this.optionsJso.tabSize(tabSize);
		return (T)this;
	}
	public boolean indentWithTabs() {
		return optionsJso.indentWithTabs();
	}
	public T indentWithTabs(boolean indentWithTabs) {
		this.optionsJso.indentWithTabs(indentWithTabs);
		return (T)this;
	}
	public boolean electricChars() {
		return optionsJso.electricChars();
	}
	public T electricChars(boolean electricChars) {
		this.optionsJso.electricChars(electricChars);
		return (T)this;
	}
	public String keyMap() {
		return optionsJso.keyMap();
	}
	public T keyMap(KeyMap keyMap) {
		this.optionsJso.keyMap(keyMap.toString());
		return (T)this;
	}
	public BaseExtraKeys extraKeys() {
		return new BaseExtraKeys(optionsJso.extraKeys());
	}
	public T extraKeys(BaseExtraKeys extraKeys) {
		this.optionsJso.extraKeys(extraKeys.unwrap());
		return (T)this;
	}
	public boolean lineWrapping() {
		return optionsJso.lineWrapping();
	}
	public T lineWrapping(boolean lineWrapping) {
		this.optionsJso.lineWrapping(lineWrapping);
		return (T)this;
	}
	public boolean lineNumbers() {
		return optionsJso.lineNumbers();
	}
	public T lineNumbers(boolean lineNumbers) {
		this.optionsJso.lineNumbers(lineNumbers);
		return (T)this;
	}
	public int firstLineNumber() {
		return optionsJso.firstLineNumber();
	}
	public T firstLineNumber(int firstLineNumber) {
		this.optionsJso.firstLineNumber(firstLineNumber);
		return (T)this;
	}
	public boolean gutter() {
		return optionsJso.gutter();
	}
	public T gutter(boolean gutter) {
		this.optionsJso.gutter(gutter);
		return (T)this;
	}
	public boolean fixedGutter() {
		return optionsJso.fixedGutter();
	}
	public T fixedGutter(boolean fixedGutter) {
		this.optionsJso.fixedGutter(fixedGutter);
		return (T)this;
	}
	public boolean readOnly() {
		return optionsJso.readOnly();
	}
	public T readOnly(boolean readOnly) {
		this.optionsJso.readOnly(readOnly);
		return (T)this;
	}
	public OnChangeHandler onChange() {
		return new OnChangeHandler(optionsJso.onChange());
	}
	public T onChange(OnChangeHandler onChangeHandler) {
		this.optionsJso.onChange(onChangeHandler.unwrap());
		return (T)this;
	}
	public OnCursorActivityHandler onCursorActivity() {
		return new OnCursorActivityHandler(optionsJso.onCursorActivity());
	}
	public T onCursorActivity(OnCursorActivityHandler onCursorActivity) {
		this.optionsJso.onCursorActivity(onCursorActivity.unwrap());
		return (T)this;
	}
	protected JavaScriptObject onGutterClick() {
		return optionsJso.onGutterClick();
	}
	protected T onGutterClick(JavaScriptObject onGutterClick) {
		this.optionsJso.onGutterClick(onGutterClick);
		return (T)this;
	}
	protected JavaScriptObject onFocus() {
		return optionsJso.onFocus();
	}
	protected T onFocus(JavaScriptObject onFocus) {
		this.optionsJso.onFocus(onFocus);
		return (T)this;
	}
	protected JavaScriptObject onBlur() {
		return optionsJso.onBlur();
	}
	protected T onBlur(JavaScriptObject onBlur) {
		this.optionsJso.onBlur(onBlur);
		return (T)this;
	}
	protected JavaScriptObject onScroll() {
		return optionsJso.onScroll();
	}
	protected T onScroll(JavaScriptObject onScroll) {
		this.optionsJso.onScroll(onScroll);
		return (T)this;
	}
	protected JavaScriptObject onHighlightComplete() {
		return optionsJso.onHighlightComplete();
	}
	protected T onHighlightComplete(JavaScriptObject onHighlightComplete) {
		this.optionsJso.onHighlightComplete(onHighlightComplete);
		return (T)this;
	}
	protected JavaScriptObject onUpdate() {
		return optionsJso.onUpdate();
	}
	protected T onUpdate(JavaScriptObject onUpdate) {
		this.optionsJso.onUpdate(onUpdate);
		return (T)this;
	}
	public boolean matchBrackets() {
		return optionsJso.matchBrackets();
	}
	public T matchBrackets(boolean matchBrackets) {
		this.optionsJso.matchBrackets(matchBrackets);
		return (T)this;
	}
	public int workTime() {
		return optionsJso.workTime();
	}
	public T workTime(int workTime) {
		this.optionsJso.workTime(workTime);
		return (T)this;
	}
	public int workDelay() {
		return optionsJso.workDelay();
	}
	public T workDelay(int workDelay) {
		this.optionsJso.workDelay(workDelay);
		return (T)this;
	}
	public int pollInterval() {
		return optionsJso.pollInterval();
	}
	public T pollInterval(int pollInterval) {
		this.optionsJso.pollInterval(pollInterval);
		return (T)this;
	}
	public int undoDepth() {
		return optionsJso.undoDepth();
	}
	public T undoDepth(int undoDepth) {
		this.optionsJso.undoDepth(undoDepth);
		return (T)this;
	}
	public int tabindex() {
		return optionsJso.tabindex();
	}
	public T tabindex(int tabindex) {
		this.optionsJso.tabindex(tabindex);
		return (T)this;
	}
	public Document document() {
		return optionsJso.document();
	}
	public T document(Document document) {
		this.optionsJso.document(document);
		return (T)this;
	}
	protected JavaScriptObject onKeyEvent() {
		return optionsJso.onKeyEvent();
	}
	protected T onKeyEvent(JavaScriptObject onKeyEvent) {
		this.optionsJso.onKeyEvent(onKeyEvent);
		return (T)this;
	}
	
}
