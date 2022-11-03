import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maksymalny =0, minimalny = Double.MAX_VALUE;
        int maxdzien = 0, mindzien = 0, suma = 0; // Statycznie, wstepnie = 0;
        System.out.println("Podaj liczbe dni: ");
        int ldni = sc.nextInt();
        for(int i =0;i<ldni;i++){
            System.out.println((i+1)+". Podaj temperature: ");
            int wpisana = sc.nextInt();

                if(wpisana > maksymalny){
                    maksymalny = wpisana;
                    maxdzien = (i+1);
                }
                if(wpisana < minimalny){
                    minimalny = wpisana;
                    mindzien = (i+1);
                }
                suma= wpisana+ suma;
        }
        if(ldni<= 0){
        ldni = 1;
        }
        System.out.println("Średnia temperatura: "+(suma/ldni)+"C w ostatnich "+ldni+" dniach");
        System.out.println("Najniższa temperatura: "+minimalny+"C w dniu: "+mindzien);
        System.out.println("Najwyższa temperatura: "+maksymalny+"C w dniu: "+maxdzien);
    }
}