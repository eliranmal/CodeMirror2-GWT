package com.gigaspaces.codemirror_gwt.client.events;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

public class EventUtils {

	public static EventBus CODE_MIRROR_EVENT_BUS = GWT.create(SimpleEventBus.class);
}
