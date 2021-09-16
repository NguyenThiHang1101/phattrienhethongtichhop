import java.util.Scanner;
public class bai4 {
    public static int nhapsoN(String str) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		x=sc.nextInt();
		return x;
		
		
	}
	public static int tinhtong(int n) {
		int tong=0;
		if(n%2==0) {
			for(int i=1;i<=n;i++) {
               tong = tong + i;
			}
            System.out.println("tong dãy từ 1 đến n là: "+ tong);
        }
              
        if(n<0) {
            System.out.println("nhap sai vui long nhap lai!");
        }
        return tong;
	}
	public static void main(String[] args) {
		int n= nhapsoN("nhap so n:");
		tinhtong(n);
		
	}
}
