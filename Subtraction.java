
public class Subtraction extends Expression{
	
	int var1;
	int var2;
	int sub;
	
	Subtraction(){
		super(0, 0);
	}
	
	Subtraction(int var1, int var2){
		super(var1, var2);
		this.var1 = var1;
		this.var2 = var2;
	}
	
	Object getValue() {
		return this.sub;
	}
	
	@Override
	void evaluate() {
		sub = var1 - var2;
	}

}