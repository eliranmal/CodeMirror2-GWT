package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.LineHandleJso;
import com.gigaspaces.codemirror_gwt.client.jsni.LineInfoJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class LineInfo implements Wrapper<LineInfo, LineInfoJso> {

	private LineInfoJso lineInfoJso;

	public LineInfo() {}
	
	public LineInfo(LineInfoJso jso) {
		lineInfoJso = jso;
	}
	
	public final LineHandleJso handle() {
		return lineInfoJso.handle();
	}
	
	public final int line() {
		return lineInfoJso.line();
	}
	
	public final String lineClass() {
		return lineInfoJso.lineClass();
	}
	
	public final String markerClass() {
		return lineInfoJso.markerClass();
	}
	
	public final String markerText() {
		return lineInfoJso.markerText();
	}
	
	public final String text() {
		return lineInfoJso.text();
	}
	
	@Override
	public LineInfo wrap(LineInfoJso jso) {
		return new LineInfo(jso);
	}

	@Override
	public LineInfoJso unwrap() {
		return lineInfoJso;
	}

	@Override
	public String toString() {
		return "LineInfo [handle()=" + handle() + ", line()=" + line()
				+ ", lineClass()=" + lineClass() + ", markerClass()="
				+ markerClass() + ", markerText()=" + markerText()
				+ ", text()=" + text() + "]";
	}

}
