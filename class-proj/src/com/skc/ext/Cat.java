package com.skc.ext;

//자식 클래스 (고양이)
public class Cat extends Animal {

	private boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	@Override
	public void makeSound() {
		System.out.println(name + "이(가) 야옹 웁니다.");
	}

	public void climb() {
		System.out.println(name + "이(가) 나무를 올라갑니다.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("실내묘: " + (isIndoor ? "예" : "아니오"));
	}

}
