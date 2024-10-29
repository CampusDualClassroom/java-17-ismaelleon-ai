package com.campusdual.classroom;

public class Exercise17 {

	public static int[] createEmptyIntArray(int positions) {
		return new int[positions];
	}

	public static String[] createInitializedStringArray() {
		String[] stringArray = {"1", "2", "3"};
		return stringArray;
	}

	public static void populateArray(int[] array, int index, int value) {
		if (index>=0 && index<array.length) {
			array[index] = value;
		} else {
			System.out.println("Índice fuera de rango");
		}
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		if (index>=0 && index<array.length) {
			System.out.println("Valor en índice "+index+": "+array[index]);
		} else {
			System.out.println("Índice fuera de rango");
		}
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 1);
		System.out.println(arrayLength(intArray));
	}
}
