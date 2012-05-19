package com.gigaspaces.codemirror_gwt.client.events;

import com.google.gwt.event.shared.EventHandler;

public interface EditorContentChangeEventHandler extends EventHandler {

	void editorContentChanged(EditorContentChangeEvent event);
}
