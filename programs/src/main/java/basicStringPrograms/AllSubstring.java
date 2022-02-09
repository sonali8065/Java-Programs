package basicStringPrograms;

public class AllSubstring {

	public static void main(String[] args) {
		String str="abcd";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		getPermutation("ABC","");

	}

	private static void getPermutation(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String res=str.substring(0,i)+str.substring(i+1);
			
			getPermutation(res, ans+ch);
			
		}
	}

}
