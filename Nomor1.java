import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
// Prosedur untuk mencetak deret FizzBuzz
            public static void printFizzBuzz(int n) {
                for (int i = 0; i <= n; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print("FizzBuzz ");
                    } else if (i % 3 == 0) {
                        System.out.print("Fizz ");
                    } else if (i % 5 == 0) {
                        System.out.print("Buzz ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Meminta input nilai n dari pengguna
                System.out.print("Masukan nilai N: ");
                int n = scanner.nextInt();
        
                // Memanggil prosedur untuk mencetak deret FizzBuzz
                printFizzBuzz(n);
        
                scanner.close();
            }
            System.out.println(fizz(n));
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
