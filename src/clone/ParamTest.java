package clone;

public class ParamTest {
protected int num=0;
public void change(int i){
	i=5;
}
public void change(ParamTest t){
	ParamTest tmp=new ParamTest();
	tmp.num=9;
	t=tmp;
}
public void add(int i){
	i+=10;
}
public void add(ParamTest pt){
	pt.num+=20;
}
public static void main(String[] args) {
	ParamTest t=new ParamTest();
	System.out.println("参数--基本类型");
	System.out.println("原有的值："+t.num);//0
	
	t.change(t.num);
	System.out.println("赋值之后："+t.num);//0
	
	t.change(t);
	System.out.println("运算之后："+t.num);//9
	System.out.println();
	
	t=new ParamTest();
	System.out.println("参数--引用类型");
	System.out.println("原有的值："+t.num);//0
	
	t.add(t.num);
	System.out.println("赋引用后："+t.num);//0
	
	t.add(t);
	System.out.println("改变属性后："+t.num);//20
}
}
