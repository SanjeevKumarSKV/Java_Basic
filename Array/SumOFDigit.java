import java.util.*;
public class SumOFDigit{
					public static void main(String args[]) {
						Scanner sk = new Scanner(System.in);
						System.out.println(" enter the number ");
						int n = sk.nextInt();
						int a[] = {n};

						int i;
						int sum = 0;
						for (i = 0; i < a.length; i++) {

							sum = sum + a[i];
						}

						System.out.println(" sum " + sum);
					}
				}