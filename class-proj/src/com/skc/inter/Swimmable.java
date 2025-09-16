package com.skc.inter;

public interface Swimmable {
	void swim();

	void dive();

	default void checkWaterTemperature() {
		System.out.println("수온을 확인합니다.");
	}
}
