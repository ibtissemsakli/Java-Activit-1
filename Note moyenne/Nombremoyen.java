import java.util.Scanner;
public class Nombremoyen{
public static void main(String[] args)
{
/*Nombre  Moyen de trois examens */
Scanner sc = new Scanner(System.in);
System.out.println("Saisissez la notre du TD: ");
double Td = sc.nextInt();
System.out.println("Saisissez la notre du TP: ");
double Tp = sc.nextInt();
System.out.println("Saisissez la notre d'Examen: ");
double Ex = sc.nextInt();
/*les coeficient des trois matières*/
System.out.println("Saisissez la coefficient du TD: ");
double Cotp = sc.nextInt();
System.out.println("Saisissez la coefficient du TP: ");
double Cotd = sc.nextInt();
System.out.println("Saisissez la coefficient du d'Examen: ");
double Coex = sc.nextInt();
System.out.println("Saisissez la coefficient d'Examen: ");
double Sn=Td+Tp+Ex;
double Sc= Cotp+Cotd+Coex;
double NM = Sn/Sc;
/*les valeur  du Nombre Moyen */
System.out.println(" la valeur du Nombre Moyen est: " +NM);
}
}
