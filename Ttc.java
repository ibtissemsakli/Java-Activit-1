import java.util.Scanner;

public class Ttc{
public static void main(String[] args)
{

//Méthade par la saisie sur le clavier:
// Prix TTC = Prix HT * ( 1 + TVA/100 )

Scanner sc = new Scanner(System.in);
System.out.println("Saisissez le prix HT : ");
double pht = sc.nextInt();
System.out.println("Saisissez le TVA: ");
double tva = sc.nextInt();
double ttc = pht * (1+tva/100);
System.out.println("Le prix hor taxe :" + ttc );

}
}
