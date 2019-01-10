import java.util.Scanner;

//teste de commit e push to remote.
public class Main
{
		public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int i, j, NumOriginal;

				System.out.println("digite um numero acima de 0");
				NumOriginal = scan.nextInt();

				for(j=NumOriginal; j>=1; j--)
				{
					for(i=j; i>=1; i--) {
						System.out.print(i * i  + " ");

					}
					System.out.println("");
				}
			}   
}
