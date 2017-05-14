package com.junhee.java.DrawPoly;

public class DrawMain {

	public static void main(String[] args) {

		DrawMain main = new DrawMain();
		main.drawRect("A", 5);
		main.drawTri("A", 5);
		main.drawTriReverse("A", 5);
		// main.drawTree1("A", 5);

	}

	// 입력 받은 문자 한 개를 가로, 세로 개수를 지정해서 출력하시오;
	public void drawRect(String mark, int count) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}

	}

	public void drawTri(String mark, int count) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(mark);
			}
			System.out.print("");
		}
		System.out.println();
	}

	// 가로 i 세로 j
	public void drawTriReverse(String mark, int count) {
		for (int i = count; i > 0; i--) {
			for (int j = 0; j < count; j++) {
				if (j < i - 1) {
					System.out.print(" ");
				} else {
					System.out.print(mark);
				}
			}
			System.out.println();
		}
	}

	public void drawTree(String mark, int count) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < (count - 1) - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(mark);
			}
			System.out.println(" i=" + i);
		}
		System.out.println("");
	}
}
