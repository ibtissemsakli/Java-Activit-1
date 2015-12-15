import java.util.Scanner;
public class Permutation{
public static void main(String[] args)
{

/*permutation de deux entiers*/
Scanner sc = new Scanner(System.in);
System.out.println("Saisissez la valeur de x : ");
int x = sc.nextInt();
System.out.println("Saisissez la valeur de y: ");
int y = sc.nextInt();
int z;
z=x;
x=y;
y=z;
/*les valeurs après permutation*/
System.out.println(" la valeur de x : " +x);
System.out.println(" la valeur de y : " +y);



}
}
