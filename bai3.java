import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class bai3 {
    public static int nhap(String str){
        int x;
        Scanner sc = Scanner(System.in);
        System.out.println(str);
        x= sc.nextInt();
    }
    public static void dieukien(Float a, Float b){
        char x1,x2;
        float c;
        float denta;
        if(a==0){
            System.out.println("PT là PT bậc nhất"+ x1);
            x1= -c/b;
        }
        else {
            denta= (float) b*b-4*a*c;
            if(denta<0){
                System.out.println("PT vo nghiem!");
            }
            else 
                if(denta == 0){
                    System.out.println("PT co nghiệm kép: "+x1);
                    x1= -b/(2*a);

                }
                else 
                    {
                        System.out.println("PT co 2 nghiệm : ");
                        System.out.println("nghiệm x1 : "+ x1);
                        System.out.println("nghiệm x2 : "+ x2);
                        x1= (-b+sprt(denta))/(2*a);
                        x2= (-b-sprt(denta))/(2*a);
                    }

                
        }
    }
    public static void main(String[] args) {
        float a= nhap("nhap a: ");
        float b= nhap("nhap b: ");
        float c= nhap("nhap c: ");
        dieukien(a, b);
    }
}
