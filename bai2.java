import java.util.Scanner;
public class bai2 {
    public static int nhap(String str) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print(str);
		x=sc.nextInt();
		return x;
		
	}
	public static void kiemtra(int n) {
		
		int a = (int)Math.sqrt(n);
		int x=0;
		for(int i=2;i<=a;i++) {
			if (n%i==0)
			{
				x++;	
			}
		}
		if(x==0)
			System.out.print(" la so nguyen to");
		else
			System.out.print("khong la so nguyen to");
	
		if(n<2)
			System.out.println("khong la so nuyen to");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= nhap("nhap n: ");
		kiemtra(a);

	}

}
