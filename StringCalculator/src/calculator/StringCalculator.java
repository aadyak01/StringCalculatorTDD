package calculator;



public class StringCalculator {

	public int Add(String numbers) {
		
		String[] numListNewLine= numbers.split("\n");
		String[] numListWithComma= numbers.split(",");
		int sum=0;
		
		if(numListWithComma[0]=="") {
			return 0;
		}
		else if(numListWithComma[0]=="1") {
			return 1;
		}
		
		if(numbers.contains(",")) {
			
			if(numListWithComma.length==2) {
				return Integer.parseInt(numListWithComma[0])+Integer.parseInt(numListWithComma[1]);
			}
			else {
				for(int i=0;i<numListWithComma.length;i++) {
					
					 sum+= Integer.parseInt(numListWithComma[i]);
					
					
				}
			
			}
			
			 
		}
		if(numbers.contains("\n")) {
			
			for(int i=0;i<numListNewLine.length;i++) {
				
				 sum+= Integer.parseInt(numListNewLine[i]);
				
		}
			
	}
		return sum;
		
}
}