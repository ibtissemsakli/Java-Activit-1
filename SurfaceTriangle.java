

import java.util.Scanner;
public class SurfaceTriangle{
public static void main(String[] args)
{
/*int largeur = 10;
int surface = (langueure * largeur)/2;
System.out.println("La surface du rectangle= " + surface);
*/
//Méthade par la saisie sur le clavier
Scanner sc = new Scanner(System.in);
System.out.println("Saisissez la langeur du triangle : ");
int hateur = sc.nextInt();
System.out.println("Saisissez la largeur: ");
int largeur = sc.nextInt();
int surface = (hateur*largeur)/2;
System.out.println("la surface du triaangle est :" + surface );

}
}
