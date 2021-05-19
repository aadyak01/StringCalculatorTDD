package calculator;



public class StringCalculator {

	public int Add(String numbers) {

		String[] numList= numbers.split("[\n,]");
		int sum=0;

		if(numList[0]=="") {
			return 0;
		}
		else if(numList[0]=="1") {
			return 1;
		}

		else if(numList.length==2) {
			return Integer.parseInt(numList[0])+Integer.parseInt(numList[1]);
		}
		
		else {
			for(int i=0;i<numList.length;i++) {

				 sum+= Integer.parseInt(numList[i]);


			}
			 return sum;
		}
	}
}