 
public class B2 {
	public static void main(String[]args) {
		B1 x= new B1("Rahim",40,1234,"Alo");
		System.out.println(x.name);
		System.out.println(x.age);
		int d=x.id;
		System.out.println("id is:"+d);
		B1 y=new B1("Saifan",2,0021,"Kao");
		String a=y.name;
		System.out.println("Name is:"+a);
	}

}
