package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.PosJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class Pos implements Wrapper<Pos, PosJso> {

	private PosJso posJso;

	public Pos() {}

	public Pos(PosJso jso) {
		posJso = jso;
	}

	public Pos(int line, int ch) {
		posJso = PosJso.create(line, ch);
	}
	
	public final int line() {
		return posJso.line();
	}
	
	public final int ch() {
		return posJso.ch();
	}
	
	@Override
	public Pos wrap(PosJso jso) {
		return new Pos(jso);
	}
	
	@Override
	public PosJso unwrap() {
		return posJso;
	}

	@Override
	public String toString() {
		return "Pos [line()=" + line() + ", ch()=" + ch() + "]";
	}

}
