
public class Multiplication extends Expression{
	
	int var1;
	int var2;
	int times;
	
	Multiplication(){
		super(0, 0);
	}
	
	Multiplication(int var1, int var2){
		super(var1, var2);
		this.var1 = var1;
		this.var2 = var2;
	}
	
	Object getValue() {
		return this.times;
	}
	
	@Override
	void evaluate() {
		times = var1 * var2;
	}

}