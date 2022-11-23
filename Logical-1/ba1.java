package interview;
interface q1{
	void add();
}
interface q2{
	void add();
}
class b1 implements q1,q2{
	public void add(){
		System.out.println("hi");
	}
}
public class ba1 {
public static void main(String[] args) {
	b1 b=new b1();
	b.add();
}
}
