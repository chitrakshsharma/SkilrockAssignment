import java.util.Scanner;

public class TOTR {
	//String alphabet = ""
	public static void main(String[] args){
		TOTR to = new TOTR();
		to.go();
	}
	
	public void go(){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String convert = sc.next();
		for(int t=0;t<test;t++){
			String str = sc.next();
			String ans = "";
			for(int j=0;j<str.length();j++){
				char ch = str.charAt(j);
				if(Character.isUpperCase(ch)){
					int index = ch-'A';
					ans += Character.toUpperCase(convert.charAt(index));
				}else if(Character.isLowerCase(ch)){
					int index = ch-'a';
					ans += convert.charAt(index);
				}else if(ch == '_'){
					ans += " ";
				}else{
					ans += ch;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
