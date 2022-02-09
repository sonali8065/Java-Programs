package basicStringPrograms;

public class ReverseString {
 public static void main(String[] args) {
	String name="Sonali Joshi";
	reverse(name);
	System.out.println(reverseRec(name));
	reverseSB(name);
	System.out.println(reverseByWord(name));
}

private static String reverseByWord(String name) {
	String arr[]= name.split(" ");
	String result="";
	for(int i=0;i<arr.length;i++) {
		if (i == arr.length - 1)
            result = arr[i] + result;
        else
            result = " " + arr[i] + result;
	}
	return result;
}

private static void reverseSB(String name) {
	StringBuffer sb = new StringBuffer(name);
	System.out.println(sb.reverse());
}

private static String reverseRec(String name) {
	if(name.length()==1)
		return name;
	else
		return reverseRec(name.substring(1))+ name.charAt(0);
}

private static void reverse(String name) {
	String rev="";
	for(int i=name.length()-1;i>=0;i--) {
		rev+=name.charAt(i);
	}
	System.out.println(rev);
}
}
