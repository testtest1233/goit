package com.goit.offline3.fib;

public class Fibonachi {
	
	private static int calculateRecurse(int index) {
		if (index <= 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else if (index == 2) {
			return 1;
		} else {
			return calculateRecurse(index - 1) + calculateRecurse(index - 2);
		}
	}

	public static void main(String[] args) {
		int n = 11;
		for (int i = 1; i <= n; i++) {
			System.out.print(calculateRecurse(i) + " ");
		}
	}
	
	private int calculateWhile(int index){
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < index) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
        return fib;
	}
}
