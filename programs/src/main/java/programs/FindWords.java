package programs;

public class FindWords {

	public static void main(String[] args) {
		String str="We have large inventory of different category:All including for clothing category:cloth , for furnitures category:table and for tv , category:tv ";
		String str1="found";
		findCategory(str);
		System.out.println(addDollar(str1));
		

	}

	private static String addDollar(String str1) {
		if(str1.length()<=1)
			return str1;
		return str1.charAt(0)+"$"+addDollar(str1.substring(1));
	}

	private static void findCategory(String str) {
		int i=0;
		while(true) {
			int found= str.indexOf("category:",i);
			if(found==-1)break;
			int start=found+9;
			int end=str.indexOf(" ",start);
			if(end==-1)break;
			System.out.println(str.substring(start,end));
			i=end+1;
		}
		
	}
	

}
