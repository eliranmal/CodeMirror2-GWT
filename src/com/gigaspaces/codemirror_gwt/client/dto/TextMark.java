package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.TextMarkJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class TextMark implements Wrapper<TextMark, TextMarkJso> {

	private TextMarkJso textMarkJso;

	public TextMark(TextMarkJso jso) {
		textMarkJso = jso;
	}

	@Override
	public TextMark wrap(TextMarkJso jso) {
		return new TextMark(jso);
	}
	
	@Override
	public TextMarkJso unwrap() {
		return textMarkJso;
	}

	public final FromTo find() {
		return new FromTo(textMarkJso.find());
	}
	
	public final void clear() {
		textMarkJso.clear();
	}

}
