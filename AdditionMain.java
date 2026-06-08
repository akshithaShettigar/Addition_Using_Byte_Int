import java.util.Scanner;
class Addition{
	byte a,b,c;
	Addition(byte a, byte b, byte c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int sum(){
		int result=a+b+c;
		return result;
	}
}
class AdditionMain{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		byte a=sc.nextByte();
		byte b=sc.nextByte();
		byte c=sc.nextByte();
		Addition a1= new Addition(a,b,c);
		System.out.println("The result is:"+a1.sum());
		
	}
}
