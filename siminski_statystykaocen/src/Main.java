import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba2 = 0, liczba3 = 0, liczba4 = 0, liczba5 = 0, poprawnie = 0,  petla = 0;
        do {
        do {
            System.out.println("Podaj ocene: ");
            int ocena = sc.nextInt();
            if(ocena>=2 && ocena<=5){
                poprawnie++;
                if(ocena==2){
                    liczba2++;
                }else
                if(ocena==3){
                    liczba3++;
                }else
                if(ocena==4){
                    liczba4++;
                }else
                {
                    liczba5++;
                }
            }else
            {petla=1;}
        }while(petla==0);
        }while(poprawnie<15);
        {
            System.out.println("Liczba ocen '2': " + liczba2);
            System.out.println("Liczba ocen '3': " + liczba3);
            System.out.println("Liczba ocen '4': " + liczba4);
            System.out.println("Liczba ocen '5': " + liczba5);
        }

    } // VOID END
}