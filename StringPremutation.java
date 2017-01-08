
public class StringPremutation {
	public static void main(String[]args){
		myPremutation("", "RoyGal");
	}
	public static void myPremutation(String one, String two){
		if(two.length() <= 1){
			System.out.println(one + two);
		}else{
			for(int i=0; i < two.length(); i++){
				try{
					String newPremutation = two.substring(0,i) + two.substring(i+1);
			        myPremutation(one + two.charAt(i), newPremutation);
				}catch(StringIndexOutOfBoundsException e){
					System.out.println(e);
				}
			}
		 }
	}
}

