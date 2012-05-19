package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.ModeJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class Mode implements Wrapper<Mode, ModeJso> {

	private ModeJso modeJso;

	public Mode() {}

	public Mode(ModeJso jso) {
		modeJso = jso;
	}
	
	public Mode(String name) {
		modeJso = ModeJso.create(name);
	}

	public final String name() {
		return modeJso.name();
	}
	
	@Override
	public Mode wrap(ModeJso jso) {
		return new Mode(jso);
	}

	@Override
	public ModeJso unwrap() {
		return modeJso;
	}

	@Override
	public String toString() {
		return "Mode [name()=" + name() + "]";
	}
}
