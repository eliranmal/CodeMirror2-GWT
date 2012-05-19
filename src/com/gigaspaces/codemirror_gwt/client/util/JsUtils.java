package com.gigaspaces.codemirror_gwt.client.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;

public class JsUtils {

	public static JavaScriptObject buildJsoPrototype(PrototypeEntryProvider[] prototypeEntryProviders) {
		
		JSONObject json = new JSONObject();
		
		for (PrototypeEntryProvider provider : prototypeEntryProviders) {
			
			String name = provider.getKeyName();
			JavaScriptObject func = provider.getFunc();
			
			json.put(name, JSONParser.parseLenient(func.toString()).isObject());
		}
		
		return json.getJavaScriptObject();
	}

/*	public static <J extends Wrapable<W>, W> List<W> toJsoWrapperList(List<J> jsoList) {
		
		List<W> list = new ArrayList<W>();

		int listSize = jsoList.size();
		for (int i = 0; i < listSize; i++) {
			list.add(jsoList.get(i).wrap());
		}

		return list;
	}
*/
	public static <T extends JavaScriptObject> List<T> toJsoList(JsArray<T> jsArray) {
		
		List<T> list = new ArrayList<T>();

		int arrLength = jsArray.length();
		for (int i = 0; i < arrLength; i++) {
			list.add(jsArray.get(i));
		}
		
		return list;
	}
	
	public static List<String> toList(JsArrayString jsArray) {
		
		List<String> list = new ArrayList<String>();

		int arrLength = jsArray.length();
		for (int i = 0; i < arrLength; i++) {
			list.add(jsArray.get(i));
		}
		
		return list;
	}
	
}
