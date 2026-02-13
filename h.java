package demo;

class sign{
	String name="abc";
	void signin() {
		
		System.out.println(name);
	}
	
}
class login extends sign{
	void log() {
		System.out.println(name);
	}
}
public class h {
public static void main(String[] args) {
//	sign o=new sign();
//	o.signin();
//	o.log();
	login l=new login();
	l.signin();
	l.log();
}
}
