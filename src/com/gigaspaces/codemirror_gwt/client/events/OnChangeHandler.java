package com.gigaspaces.codemirror_gwt.client.events;

import com.gigaspaces.codemirror_gwt.client.CodeMirror;
import com.gigaspaces.codemirror_gwt.client.dto.ChangeInfo;
import com.gigaspaces.codemirror_gwt.client.jsni.ChangeInfoJso;
import com.gigaspaces.codemirror_gwt.client.jsni.CodeMirrorJso;
import com.gigaspaces.codemirror_gwt.client.jsni.OnChangeHandlerJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class OnChangeHandler implements Wrapper<OnChangeHandler, OnChangeHandlerJso> {

	private OnChangeHandlerJso onChangeHandlerJso;

	public OnChangeHandler() {
		onChangeHandlerJso = OnChangeHandlerJso.create();
	}

	public OnChangeHandler(OnChangeHandlerJso onChangeHandlerJso) {
		this.onChangeHandlerJso = onChangeHandlerJso;
	}
	
	@Override
	public OnChangeHandlerJso unwrap() {
		return onChangeHandlerJso;
	}

	public static void handle(CodeMirrorJso cmJso, ChangeInfoJso changeInfoJso) {
		CodeMirror cm = new CodeMirror(cmJso);
		ChangeInfo changeInfo = new ChangeInfo(changeInfoJso);
		EventUtils.CODE_MIRROR_EVENT_BUS.fireEvent(new EditorContentChangeEvent(cm, changeInfo));
	}

	@Override
	public OnChangeHandler wrap(OnChangeHandlerJso jso) {
		return new OnChangeHandler(jso);
	}

}