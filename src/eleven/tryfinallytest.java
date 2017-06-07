package eleven;

public class tryfinallytest {
public static void main(String[] args) {
	System.out.println(f(3));
}
public static int f(int n){
	try{
		int r=n*n;
		return r;
	}
	finally{
		if(n==2) return 0;
	}
}
}
