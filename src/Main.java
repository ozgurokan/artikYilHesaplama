import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if((year % 100 == 0) ){
            if (year % 400 == 0){
                System.out.println(year + ": Bir Artık Yıl");
            }else{
                System.out.println(year + ": Bir Artık Yıl Değil");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + ": Bir Artık Yıl");
        }else {
            System.out.println(year + ": Bir Artık Yıl Değil");
        }
    }
}