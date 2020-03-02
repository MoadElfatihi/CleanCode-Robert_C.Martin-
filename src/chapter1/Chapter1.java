package chapter1;

/**
 * 
 * use name that describe the intention of a variable / funtion :
 *	 what it store / what it does / how it is used
 * A variable that need a comment to define it isn't named well
 */
public class Chapter1 {

	// this is not good , a String cannot be a floating point number
	String NameString;
	
	// Rule : use pronounceable word :
	int genmdhs;
	
	// it should be like this 
	int generatedTimestamp;
	// Rule
	
	// avoid using a lot of prefix 
	int m_age; // no need for m prefix because we know that it is a member
	
	public int calculateFibonacciOf(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return calculateFibonacciOf(n-1)+calculateFibonacciOf(n-2);
	}
	
	public void makecopyOfarray(int[] source, int[] destination) {
		System.arraycopy(source, 0, destination, 0, source.length);
	}

}

// Namming an interfaces and its implementation
// there is no need to name an interface starting with I like IShapeFactory , just make it ShapeFactory , and there is no need for the
// implementation to have suffix with Impl 
interface ShaperFactory {
	
}

/**
	* class name must be a noun , not a verb !
**/
class Uploader {
	// avoid naming a class like manager , Processor, Data
	
	// Method name must be a verb or a phraseName like deletePage, postPayment
	
	// isProperty for respecting bean naming convention
	
	// use technical terms like design pattern ...
	ShaperFactory shaperFactory;
	
	// use problem domain name
	
	// if a method is complicated or contain a lot of business actions , it's better to split it in a small function
	// example : 
	public void detectAdress(String adress) {
		String countryExtracted, streetExtracted ;
		
		if(adress.contains("country")) {
			countryExtracted = adress.substring(adress.indexOf("country"),adress.length()+1);
			// better to do :
			countryExtracted = extractCountry(adress);
		}
		
		if(adress.contains("street")) {
			streetExtracted = adress.substring(adress.indexOf("street"),adress.length()+1);
			extractStreet(adress);
		}
	}
	
	public String extractCountry(String adress) {
		return adress.substring(adress.indexOf("country"),adress.length()+1);
	}
	
	public String extractStreet(String adress) {
		return adress.substring(adress.indexOf("street"),adress.length()+1);
	}
}