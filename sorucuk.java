import java.util.Scanner;

public class sorucuk {
    public static void main(String[] args) {
        int m,f,k,t,ta,music;
        Scanner input = new Scanner(System.in);

        System.out.println(" değerleri gir: ");
        m= input.nextInt();
        f= input.nextInt();
        k=input.nextInt();
        t=input.nextInt();
        ta=input.nextInt();
        music=input.nextInt();
        System.out.println("\n");
        System.out.println(m);
        System.out.println(f);
        System.out.println(k);
        System.out.println(t);
        System.out.println(ta);
        System.out.println(music);
        int sum=(m+f+k+t+ta+music)/6;
        System.out.println("sonuc:" + sum);
        boolean sonuc= sum > 60 ;
        String str = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
