package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.PageCoordsJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class PageCoords implements Wrapper<PageCoords, PageCoordsJso> {

	private PageCoordsJso pageCoordsJso;

	public PageCoords() {}
	
	public PageCoords(PageCoordsJso jso) {
		pageCoordsJso = jso;
	}
	
	public PageCoords(int x, int y) {
		pageCoordsJso = PageCoordsJso.create(x, y);
	}

	public final int x() {
		return pageCoordsJso.x();
	}
	
	public final int y() {
		return pageCoordsJso.y();
	}
	
	@Override
	public PageCoords wrap(PageCoordsJso jso) {
		return new PageCoords(jso);
	}

	@Override
	public PageCoordsJso unwrap() {
		return pageCoordsJso;
	}

}
