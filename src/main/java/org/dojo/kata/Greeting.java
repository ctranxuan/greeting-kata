package org.dojo.kata;

public class Greeting {

	public String greet(String name) {
		if (name == null)
			return "Hello, my friend.";
		return "Hello, " + name + ".";
	}

}