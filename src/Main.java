import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("🔢 ¡Adivina el número! 🔢\n");

        System.out.println("¡Es momento de adivinar qué número tengo!");

        Random generadorNumeroAleatorio = new Random();
        int numeroQueAdivinar = generadorNumeroAleatorio.nextInt(100) + 1;

        int numeroAdivinado = 0;
        boolean numeroHaSidoAdivinado = false;

        for (int oportunidad = 30; oportunidad > 0; oportunidad--) {
            System.out.print("Escribe el número a continuación entre 1 y 100: ");

            numeroAdivinado = escaner.nextInt();

            if(numeroAdivinado < numeroQueAdivinar) {
                System.out.println("¡Muy bajo!");
            }
            else if (numeroAdivinado > numeroQueAdivinar) {
                System.out.println("¡Muy alto!");
            }
            else if (numeroAdivinado == numeroQueAdivinar){
                System.out.println("¡Lo adivinaste!");
                numeroHaSidoAdivinado = true;

                break;
            }
        }

        if (numeroHaSidoAdivinado == true) {
            System.out.println("¡Felicitaciones! 🎆🎉🥳");
        } else if (numeroHaSidoAdivinado == false) {
            System.out.println("¡Buena suerte para la próxima!");
        }
    }
}