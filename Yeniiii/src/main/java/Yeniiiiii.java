import java.util.Scanner;
public class Yeniiiiii {
    static int desen(int a){
        int tut=a;
        System.out.print(tut+" ");
        while(tut>0){
            tut-=5;
            System.out.print(tut+" ");
        }while(tut<a){
            tut+=5;
            System.out.print(tut+" ");
        }
        return 0;
    }


    public static void main(String[] args) {
        int sayi;
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi=inp.nextInt();
        desen(sayi);
    }
    }

//    247 742
