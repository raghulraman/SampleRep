public class Second extends A{
	static int j;
public static void main(String[] args){
	for(String arg:args){
	System.out.println(arg);
	j+=Integer.parseInt(arg);
}
System.out.println(i);
System.out.println(j);
}
}

class A{
static int i=10;
}