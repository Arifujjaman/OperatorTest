package main;

public class OperatorTestClass {
	public int addition(int x,int y){
		return x + y;
	}
	
	public int subtruction(int x,int y){
		return x - y;
	}
	
	public int division(int x,int y){
		return x / y;
	}
	
	public int multiplication(int x,int y){
		return x * y;
	}
	
	public int modulas(int x,int y){
		return x % y;
	}
	
	public int bitNot(int x){
		return ~x;
	}
	
	public int bitAnd(int x,int y){
		return x & y;
	}
	public int bitOr(int x,int y){
		return x | y;
	}
	
	public int bitExOr(int x,int y){
		return x ^ y;
	}
	public int bitShiftRight(int x){
		return x >> 1;
	}
	public int bitShiftLeft(int x){
		return x << 1;
	}

	public int bitShiftRightZero(int x){
		return x >> 0;
	}
	
	public int bitShiftLeftZero(int x){
		return x << 0;
	}
	public boolean Equalto(int x,int y){
		   return x==y;
	}
	public boolean notEqualto(int x,int y){
		   return x!=y;
	}
	
	public boolean Greaterthan(int x,int y){
		   return x>y;
	}
	
	public boolean Lessthan(int x,int y){
		   return x<y;
	}
}
