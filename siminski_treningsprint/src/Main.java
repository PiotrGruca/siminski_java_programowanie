import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int petla = 1, j = 0, lpodanych=0, suma=0;
        double maksymalny = 0, minimalny = Double.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        do {
        j++;
        System.out.println(j+". Podaj czas: ");
        int wpisana = sc.nextInt();
        if(wpisana<=0){
            break;
        }else
        {
            if(wpisana > maksymalny){
                maksymalny = wpisana;
            }
            if(wpisana < minimalny){
                minimalny = wpisana;
            }
            suma= wpisana+ suma;
        lpodanych++;
        }
    }while(petla!=0);
if(lpodanych==0){
    lpodanych = 1;
    minimalny=0;
}
        System.out.println("Minimalny czas wynosi: "+minimalny);
        System.out.println("Maksymalny czas wynosi: "+maksymalny);
        System.out.println("Średni czas wynosi: "+(suma/lpodanych));

    }
}