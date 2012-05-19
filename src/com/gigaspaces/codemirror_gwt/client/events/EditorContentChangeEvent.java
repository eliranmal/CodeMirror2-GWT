package com.gigaspaces.codemirror_gwt.client.events;

import com.gigaspaces.codemirror_gwt.client.CodeMirror;
import com.gigaspaces.codemirror_gwt.client.dto.ChangeInfo;
import com.google.gwt.event.shared.GwtEvent;

public class EditorContentChangeEvent extends GwtEvent<EditorContentChangeEventHandler> {

	public static final GwtEvent.Type<EditorContentChangeEventHandler> TYPE = 
																new GwtEvent.Type<EditorContentChangeEventHandler>();

	private CodeMirror cm;
	private ChangeInfo changeInfo;
	
	public EditorContentChangeEvent(CodeMirror cm, ChangeInfo changeInfo) {
		this.cm = cm;
		this.changeInfo = changeInfo;
	}

	@Override
	public Type<EditorContentChangeEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(EditorContentChangeEventHandler handler) {
		handler.editorContentChanged(this);
	}

	public CodeMirror getCm() {
		return cm;
	}

	public ChangeInfo getChangeInfo() {
		return changeInfo;
	}

}
