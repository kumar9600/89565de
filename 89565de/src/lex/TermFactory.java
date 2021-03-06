package lex;

import java.util.HashMap;
import java.util.Map;

public class TermFactory {

	public Term get(String term, String pos) {
		String key = term+"_"+pos;
		if (!map.containsKey(key)){
			map.put(key,new Term(term,pos));
		}
		return map.get(key);
	}
	
	private Map<String,Term> map; 
	
	
	// SINGLETON PATTERN
	private TermFactory(){
		// init factory
		map = new HashMap<String,Term>();
	}
	
	public static TermFactory instance = new TermFactory();
}
