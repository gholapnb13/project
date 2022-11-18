package javApmosys;

public class Armstrong_number {

	public static void main(String[] args) {
		// 153=[(1^3)+(5^3)+(3^3)]=153
		//find armstrong number
		int a=154;
		int temp=a;
		
		int sum = 0;
		while(temp>0) {
			int r=temp%10;  //153/10=3
			temp=temp/10;   //15
			sum=sum+r*r*r;	//
		}	
	if(temp==a) {
		System.out.println("armstrong number");}
		else {
			System.out.println("not armstrong");
		}
}
	}
	



