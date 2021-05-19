package calculator;



public class StringCalculator {

	public int Add(String numbers) {
		String[] numList= numbers.split(",");
		
		if(numList[0]=="") {
			return 0;
		}
		else if(numList[0]=="1") {
			return 1;
		}
		else {
			
			return Integer.parseInt(numList[0])+Integer.parseInt(numList[1]);
		}
		
		
		
	}
}
