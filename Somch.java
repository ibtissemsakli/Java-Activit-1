import java.util.Scanner;
public class Somch{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre de trois chiffres: ");
int Nbre = sc.nextInt();
int Schi=0;
int i=0;
if (Nbre>0)
    { i = Nbre%10;
      Nbre = Nbre/10;
      Schi = Schi+i;
      System.out.println(" la somme des chiffres du nombre est: " +Schi);
    }
else
    {
    System.out.println("la somme des chiffres du nombre est null ");
   }

}

}
