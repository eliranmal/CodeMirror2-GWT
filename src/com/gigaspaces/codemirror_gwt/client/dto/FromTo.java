package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.FromToJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class FromTo implements Wrapper<FromTo, FromToJso> {

	private FromToJso fromToJso;

	public FromTo() {}
	
	public FromTo(FromToJso jso) {
		fromToJso = jso;
	}
	
	public final Pos from() {
		return new Pos(fromToJso.from());
	}
	
	public final Pos to() {
		return new Pos(fromToJso.to());
	}
	
	@Override
	public FromTo wrap(FromToJso jso) {
		return new FromTo(jso);
	}

	@Override
	public FromToJso unwrap() {
		return fromToJso;
	}

	@Override
	public String toString() {
		return "FromTo [from()=" + from() + ", to()=" + to() + "]";
	}

}
