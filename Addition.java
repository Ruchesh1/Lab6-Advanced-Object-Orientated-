
public class Addition extends Expression{
	
	int var1;
	int var2;
	int add;
	
	Addition(){
		super(0, 0);
	}
	
	Addition(int var1, int var2){
		super(var1, var2);
		this.var1 = var1;
		this.var2 = var2;
	}
	
	Object getValue() {
		return this.add;
	}
	
	@Override
	void evaluate() {
		add = var1 + var2;
	}

}
