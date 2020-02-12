
public class AddAll extends ExpressionCollector{

	AddAll(){
		super();
	}
	
	
	boolean isTypeCorrect() {
		/* Your Task */
		boolean result = false;
		for(int i = 0; i < this.exprList.size(); i++) {
			if(this.exprList.get(i).getValue() instanceof Integer) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

}
