package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.HistorySizeJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class HistorySize implements Wrapper<HistorySize, HistorySizeJso> {

	private HistorySizeJso historySizeJso;

	public HistorySize() {}

	public HistorySize(HistorySizeJso jso) {
		historySizeJso = jso;
	}
	
	public final int undo()  {
		return historySizeJso.undo();
	}

	public final int redo()  {
		return historySizeJso.redo();
	}
	
	@Override
	public HistorySize wrap(HistorySizeJso jso) {
		return new HistorySize(jso);
	}

	@Override
	public HistorySizeJso unwrap() {
		return historySizeJso;
	}

	@Override
	public String toString() {
		return "HistorySize [undo()=" + undo() + ", redo()=" + redo() + "]";
	}

}