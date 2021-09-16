import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kitu;
        System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
        kitu = sc.nextLine();
        char[] charArray = kitu.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
          if(charArray[i] >= 97 && charArray[i] <= 122){
            charArray[i] -= 32;
          }
        }
        kitu = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + kitu);
      }
}
