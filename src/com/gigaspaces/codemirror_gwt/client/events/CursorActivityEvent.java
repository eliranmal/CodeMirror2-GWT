package com.gigaspaces.codemirror_gwt.client.events;

import com.google.gwt.event.shared.GwtEvent;

public class CursorActivityEvent extends GwtEvent<CursorActivityEventHandler> {

	public static final GwtEvent.Type<CursorActivityEventHandler> TYPE = 
																new GwtEvent.Type<CursorActivityEventHandler>();

	public CursorActivityEvent() {
	}

	@Override
	public Type<CursorActivityEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(CursorActivityEventHandler handler) {
		handler.cursorActivity(this);
	}

}
