package com.jonathanlee.phone;

public interface Ringable {
	default String ring() {
		return "Hello";
	}
	default String unlock() {
		return "Bye";
	}
}
