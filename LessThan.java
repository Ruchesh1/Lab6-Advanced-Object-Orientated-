
public class LessThan extends Expression{
	
	int var1;
	int var2;
	boolean result;
	
	LessThan(){
		super(0, 0);
	}
	
	LessThan(int var1, int var2){
		super(var1, var2);
		this.var1 = var1;
		this.var2 = var2;
	}
	
	Object getValue() {
		return this.result;
	}
	
	@Override
	void evaluate() {
		if(var1 < var2) {
			result = true;
		} else {
			result = false;
		}
	}


}