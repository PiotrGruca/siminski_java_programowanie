import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double suma = 0;
        double maksymalny, minimalny;
        maksymalny = 0;
        minimalny = Double.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe miesiecy:");
        int miesiac = sc.nextInt();
        for(int i =0; i<miesiac;i++){
            System.out.println("Podaj przychody z "+(i+1) +". miesiąca: ");
            int kasa = sc.nextInt();
            if(kasa > maksymalny){
               maksymalny = kasa;
            }
            if(kasa < minimalny){
                minimalny = kasa;
            }
            suma= kasa+ suma;
        }

        System.out.println("Suma przychodów wynosi: "+suma);
        System.out.println("Średni przychód wynosi: "+(suma/miesiac));
        System.out.println("Minimalny przychód wynosi: "+minimalny);
        System.out.println("Maksymalny przychód wynosi: "+maksymalny);
    }
}