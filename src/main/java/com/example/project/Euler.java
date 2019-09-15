package com.example.project;

public class Euler {

	//
	//
	//
	public int exercio01_solucao1() {
		int tal = 0;
		int summa = 0;

		for (tal = 1; tal < 1000; tal++) {
			if (tal % 3 == 0) {
				summa += tal;
				continue;
			} else if (tal % 5 == 0) {
				summa += tal;
			}
		}
		return summa;
	}

	//
	//
	//
	public int exercio01_solucao2() {
		int a = 0;
		for (int i = 1; i < 1000; i = i + 1) {
			if (i % 3 == 0 || i % 5 == 0) {
				a = a + i;
			}
		}
		return a;
	}

}
