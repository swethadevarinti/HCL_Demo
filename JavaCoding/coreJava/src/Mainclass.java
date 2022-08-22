import java.util.ArrayList;
import java.util.List;

public class Mainclass{

	static int methodOne(int i){
		return methodTwo(i *= 11);
	}

	static int methodTwo(int i){
		return methodThree(i /= 11);
	}

	static int methodThree(int i){
		return methodFour(i -= 11);
	}

	static int methodFour(int i){
		return i += 11;
	}

	public static void main(String[] args){

		//System.out.println(methodOne(11));

		String str ="Sakshi Saurav        is an Autom ation Engi ne      er";

		System.out.println("str  :"+str);

		char[] strArray = str.toCharArray(); 
		
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < strArray.length; i++) { 
			
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) { 
				//System.out.println("strArray    :"+strArray[i]);
				stringBuffer.append(strArray[i]);  
			}  
		} 
		
		String noSpaceStr2 = stringBuffer.toString();  
		
		System.out.println(noSpaceStr2);  

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		
		for(Integer value: list) {
			System.out.println("value  :"+value);
		}

		for(int i=0;i<=list.size()-1;i++) {
			System.out.println(list.get(i));
		}



	}

}