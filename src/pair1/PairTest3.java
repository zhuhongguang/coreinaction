package pair1;

public class PairTest3 {
public static void main(String[] args) {
//	Mananger ceo=new Manager("Gus Greedy",800000,2003,12,15);
}
}
class PairAlg{
	public static boolean hasNulls(Pair<?> p){
		return p.getFirst()==null||p.getSecond()==null;
	}
	public static void swap(Pair<?> p){swapHelper(p);}
	public static <T> void swapHelper(Pair<T> p){
		T t=p.getFirst();
		p.setFirst(p.getSecond());
		p.setSecond(t);
	}
}