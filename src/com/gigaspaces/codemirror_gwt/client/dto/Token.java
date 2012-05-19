package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.TokenJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class Token implements Wrapper<Token, TokenJso> {

	private TokenJso tokenJso;
	
	public Token(TokenJso jso) {
		tokenJso = jso;
	}

	public final String start() {
		return tokenJso.start();
	}
	
	public final String end() {
		return tokenJso.end();
	}
	
	public final String string() {
		return tokenJso.string();
	}
	
	public final String className() {
		return tokenJso.className();
	}
	
	// TODO: consider structure implementation for the return type (as StateJso).
	public final JavaScriptObject state() {
		return tokenJso.state();
	}

	
	@Override
	public Token wrap(TokenJso jso) {
		return new Token(jso);
	}

	@Override
	public TokenJso unwrap() {
		return tokenJso;
	}
	
	@Override
	public String toString() {
		return "Token [start()=" + start() + ", end()=" + end() + ", string()="
		+ string() + ", className()=" + className() + ", state()="
		+ state() + "]";
	}

}
