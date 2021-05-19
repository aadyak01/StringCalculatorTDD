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
				
				if(Integer.parseInt(numList[i])>0 && Integer.parseInt(numList[i])<1000 ) {
					 sum+= Integer.parseInt(numList[i]);

				}
				else if(Integer.parseInt(numList[i])<=0)
					 throw new RuntimeException("Negatives not allowed: " + Integer.parseInt(numList[i]));
		    }

			}
			 return sum;
		}
	
	
	public static int addwithMultipleDelimiter(final String numbers) {
	    String delimiter = ";|,|\n";
	    String numbersWithoutDelimiter= numbers;
	    if (numbers.startsWith("//")) {
	        int i = numbers.indexOf("//") + 2;
	       // System.out.println(numbers.indexOf(i));
	        delimiter = numbers.substring(i, i + 1); //get ;
	       // System.out.println(delimiter);
	        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1); // number= "//;\n1;3;2"
	    }
	    return addDem(numbersWithoutDelimiter, delimiter);
	}
	
	private static int addDem(final String numbers, final String delimiter) {
	    int sumResult = 0;
	    String[] arr = numbers.split(delimiter);
	    for (String number : arr) {
	        if (!number.trim().isEmpty()) {
	        	sumResult += Integer.parseInt(number.trim());
	        }
	    }
	    return sumResult;
	}
}