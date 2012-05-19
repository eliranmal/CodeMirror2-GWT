package com.gigaspaces.codemirror_gwt.client.dto;

import java.util.List;

import com.gigaspaces.codemirror_gwt.client.jsni.ChangeInfoJso;
import com.gigaspaces.codemirror_gwt.client.util.JsUtils;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class ChangeInfo implements Wrapper<ChangeInfo, ChangeInfoJso> {

	private ChangeInfoJso changeInfoJso;

	public ChangeInfo() {}
	
	public ChangeInfo(ChangeInfoJso jso) {
		changeInfoJso = jso;
	}
	
	public final Pos from() {
		return new Pos(changeInfoJso.from());
	}

	public final Pos to() {
		return new Pos(changeInfoJso.to());
	}

	public final List<String> text() {
		return JsUtils.toList(changeInfoJso.text());
	}

	public final Token next() {
		return new Token(changeInfoJso.next());
	}
	
	@Override
	public ChangeInfo wrap(ChangeInfoJso jso) {
		return new ChangeInfo(jso);
	}

	@Override
	public ChangeInfoJso unwrap() {
		return changeInfoJso;
	}
	
	@Override
	public String toString() {
		return "ChangeInfo [from()=" + from() + ", to()=" + to() + ", text()="
				+ text() + ", next()=" + next() + "]";
	}

}
