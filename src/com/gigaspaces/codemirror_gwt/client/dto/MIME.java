package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.MIMEJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class MIME implements Wrapper<MIME, MIMEJso> {

	private MIMEJso mimeJso;

	public MIME() {}
	
	public MIME(MIMEJso jso) {
		mimeJso = jso;
	}
	
	public final String mime() {
		return mimeJso.mime();
	}
	
	@Override
	public MIME wrap(MIMEJso jso) {
		return new MIME(jso);
	}

	@Override
	public MIMEJso unwrap() {
		return mimeJso;
	}

	@Override
	public String toString() {
		return "MIME [mime()=" + mime() + "]";
	}

}
