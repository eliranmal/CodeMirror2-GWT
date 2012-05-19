package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.CoordsJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class Coords implements Wrapper<Coords, CoordsJso> {

	private CoordsJso coordsJso;

	public Coords() {}
	
	public Coords(CoordsJso jso) {
		coordsJso = jso;
	}

	public Coords(int x, int y, int yBot) {
		coordsJso = CoordsJso.create(x, y, yBot);
	}

	public final int x() {
		return coordsJso.x();
	}
	
	public final int y() {
		return coordsJso.y();
	}
	
	public final int yBot() {
		return coordsJso.yBot();
	}
	
	@Override
	public Coords wrap(CoordsJso jso) {
		return new Coords(jso);
	}

	@Override
	public CoordsJso unwrap() {
		return coordsJso;
	}

	@Override
	public String toString() {
		return "Coords [x()=" + x() + ", y()=" + y() + ", yBot()=" + yBot()
				+ "]";
	}

}
