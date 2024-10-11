
public class IsPalindronme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=121;
		boolean k=isPalindrome(x);
		System.out.println(k);

	}
	public static boolean isPalindrome(int x) {
        int res=0;
        int num=x;
        while(x>0){
            int rem=x%10;
             res=res*10+rem;
            x=x/10;
        }
        if(num==res){
            return true;
        }
        return false;
    }

}
