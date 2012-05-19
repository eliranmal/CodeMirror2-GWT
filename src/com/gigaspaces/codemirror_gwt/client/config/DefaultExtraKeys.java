package com.gigaspaces.codemirror_gwt.client.config;

import com.gigaspaces.codemirror_gwt.client.jsni.ExtraKeysJso;
import com.gigaspaces.codemirror_gwt.client.util.ExtraKeyProvider;

public class DefaultExtraKeys extends BaseExtraKeys {

	private static final ExtraKeyProvider[] DEFAULT_EXTRA_KEY_PROVIDERS = new ExtraKeyProvider[] { new AutoCompletionExtraKey() };
	
	public DefaultExtraKeys() {
		super(DEFAULT_EXTRA_KEY_PROVIDERS);
	}
	
	public DefaultExtraKeys(ExtraKeysJso jso) {
		super(jso);
	}
}
