package com.gigaspaces.codemirror_gwt.client.events;

import com.gigaspaces.codemirror_gwt.client.jsni.OnCursorActivityHandlerJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class OnCursorActivityHandler implements Wrapper<OnCursorActivityHandler, OnCursorActivityHandlerJso> {

	private OnCursorActivityHandlerJso onCursorActivityJso;

	public OnCursorActivityHandler() {
		onCursorActivityJso = OnCursorActivityHandlerJso.create();
	}

	public OnCursorActivityHandler(OnCursorActivityHandlerJso onCursorActivityHandlerJso) {
		this.onCursorActivityJso = onCursorActivityHandlerJso;
	}
	
	@Override
	public OnCursorActivityHandlerJso unwrap() {
		return onCursorActivityJso;
	}

	public static void handle() {
		EventUtils.CODE_MIRROR_EVENT_BUS.fireEvent(new CursorActivityEvent());
	}

	@Override
	public OnCursorActivityHandler wrap(OnCursorActivityHandlerJso jso) {
		return new OnCursorActivityHandler(jso);
	}

}