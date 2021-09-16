import java.util.Scanner;
public class bai5 {
        public static int nhapsoN(String str) {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.printf(str);
            x=sc.nextInt();
            return x;
        }
        public static void tinhtong(int n) {
            int tong=0;
            if(n%2==0) {
                for(int i=1;i<=n;i+=2) {
                    tong=tong+i;
                }
                System.out.println("tong so chan den n la: "+tong);
            }
            if(n<0) {
                System.out.println("nhap sai vui long nhap lai!");
            }
        }
		public static void main(String[] args) {
            int n= nhapsoN("nhap so n:");
            tinhtong(n);
            
        }
}
