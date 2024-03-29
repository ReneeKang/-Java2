package org.opentutorials.javatutorials.exception;

class DivideException extends RuntimeException{
	public DivideException() {
		// TODO Auto-generated constructor stub
		super();
	}
	DivideException(String message){
		super(message);
	}
	
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		
		/*
		if(right ==0) {
			throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
	        
		}
		*/
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if(right ==0) {
//			throw new ArithmeticException("0으로 나누는것은 허용되지 않습니다.");
			throw new DivideException("0으로 나누는것은 허용되지 않습니다.");
	        
		}
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.print(" 입니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다 : " + e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

		Calculator c2 = new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}
}
