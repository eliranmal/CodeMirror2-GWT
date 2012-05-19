package com.gigaspaces.codemirror_gwt.client.dto;

import com.gigaspaces.codemirror_gwt.client.jsni.BookmarkJso;
import com.gigaspaces.codemirror_gwt.client.util.Wrapper;

public class Bookmark implements Wrapper<Bookmark, BookmarkJso> {

	private BookmarkJso bookmarkJso;

	public Bookmark() {}

	public Bookmark(BookmarkJso jso) {
		bookmarkJso = jso;
	}

	public final Pos find() {
		return new Pos(bookmarkJso.find());
	}
	
	public final void clear() {
		bookmarkJso.clear();
	}
	
	@Override
	public Bookmark wrap(BookmarkJso jso) {
		return new Bookmark(jso);
	}

	@Override
	public BookmarkJso unwrap() {
		return bookmarkJso;
	}

	@Override
	public String toString() {
		return "Bookmark [find()=" + find() + "]";
	}

}
