package com.java.practice;

public class LooselyCouple {

	public static void main(String args[]) {
		Box2 b = new Box2(5, 5, 5);
		System.out.println(b.getVolume());
	}
}

 class Box2 {
	private int volume;

	Box2(int length, int width, int height) {
		this.volume = length * width * height;
	}

	public int getVolume() {
		return volume;

	}

}
