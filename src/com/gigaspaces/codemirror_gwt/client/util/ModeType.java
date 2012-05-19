package com.gigaspaces.codemirror_gwt.client.util;

public enum ModeType {

	CLIKE("clike"),
	CLOJURE("clojure"),
	COFFEESCRIPT("coffeescript"),
	CSS("css"),
	DIFF("diff"),
	GFM("gfm"),
	GO("go"),
	GROOVY("groovy"),
	HASKELL("haskell"),
	HTMLEMBEDDED("htmlembedded"),
	HTMLMIXED("htmlmixed"),
	JAVASCRIPT("javascript"),
	JINJA2("jinja2"),
	LESS("less"),
	LUA("lua"),
	MARKDOWN("markdown"),
	MYSQL("mysql"),
	NTRIPLES("ntriples"),
	PASCAL("pascal"),
	PERL("perl"),
	PHP("php"),
	PLSQL("text/x-plsql"),
	PYTHON("python"),
	R("r"),
	RPM_CHANGES("rpm_changes"),
	RPM_SPEC("rpm_spec"),
	RST("rst"),
	RUBY("ruby"),
	RUST("rust"),
	SCHEME("scheme"),
	SMALLTALK("smalltalk"),
	SPARQL("sparql"),
	STEX("stex"),
	TIDDLYWIKI("tiddlywiki"),
	VELOCITY("velocity"),
	VERILOG("verilog"),
	XML("xml"),
	XMLPURE("xmlpure"),
	YAML("yaml");

	private String _name;

	private ModeType(String name) {
		_name = name;
	}

	public String toString() {
		return _name;
	};
}
