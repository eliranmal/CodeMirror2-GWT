package com.gigaspaces.codemirror_gwt.client.config;

import com.gigaspaces.codemirror_gwt.client.jsni.ExtraKeysJso;
import com.gigaspaces.codemirror_gwt.client.util.ExtraKeyProvider;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class BaseExtraKeys implements Wrapper<BaseExtraKeys, ExtraKeysJso> {

	private ExtraKeysJso extraKeysJso;

	public BaseExtraKeys() {}
	
	public BaseExtraKeys(ExtraKeysJso jso) {
		extraKeysJso = jso;
	}
	
	public BaseExtraKeys(ExtraKeyProvider[] extraKeyProviders) {
		extraKeysJso = ExtraKeysJso.create(extraKeyProviders);
	}

	@Override
	public ExtraKeysJso unwrap() {
		return extraKeysJso;
	}

	@Override
	public BaseExtraKeys wrap(ExtraKeysJso jso) {
		return new DefaultExtraKeys(jso);
	}

}
