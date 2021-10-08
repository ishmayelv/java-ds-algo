package com.ruthtech.algo;

public class PrintPiramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawPyramidPattern();
		drawLeftPyramidPattern();
		drawRightPyramidPattern();
	}

	public static void drawPyramidPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void drawLeftPyramidPattern() {
		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void drawRightPyramidPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >( 5 - i-1); j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

}
