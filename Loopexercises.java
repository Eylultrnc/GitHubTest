import java.util.Scanner;

public class Loopexercises {
  public static void main(String [] args) {
	// dik üçgen soldan sağa loop'u
	  //int i,j;
	   /*for(i=0;i<5;i++) {
	   for(j=0;j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  // çarpım tablosu
	  for(i=1;i<=10;i++) {
		  for(j=1;j<=10;j++) {
			  System.out.print(i*j + " ");
			  
		  }
		  System.out.println();
	  }
	 
  // 1-100 arası olan çift sayıları yazdırma
	  
	  for(i=1;i<=100;i++) {
		  if(i % 2==0) {
			  System.out.print(i+ " ");
		  }
		}
	 
	 // userdan aldığı sayıların toplamı 100 olana kadar input al 
	  int num;
	  int sum=0;
	  Scanner scanner=new Scanner(System.in);
	  
	 do {
		 System.out.println("Bir integer girin: ");
		  num=scanner.nextInt();
		  sum +=num;
	 } while(sum <=100);
	 
	 
	 System.out.println("Done! "+ sum);
	  
	 
	  // bölenlerinin toplamını yazdıran program
	  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter an integer: ");
	  int num1=scanner.nextInt();
	  int sum=0;
	  for(i=1;i<=num1/2;i++) {
		  if(num1 % i==0) {
			  sum +=i;
		 }
	
	  }
	  System.out.println(sum);
	   
	  // asal sayı olup olmadığını bulan program
	  
	  Scanner scanner=new Scanner(System.in);
	  int num;
	  boolean asalMi=true;
	  
	  System.out.println("Enter an integer: ");
	  num=scanner.nextInt();
	  
	  if(num<1) {
		  asalMi=false;
	  }
	  
	  for(int i=2;i<=num/2;i++) {
		  if(num % i==0) {
			  asalMi=false;
			  break;
		  }
	  }
	  
	 if(asalMi) {
		 System.out.println(num + " sayısı asaldır.");
	 }
	 else {
		 System.out.println(num + " sayısı asal değil.");
	 }
	 
	  // fibonacci dizisi verilen inputa kadar sayı dizisini oluştur.
	  Scanner scanner=new Scanner(System.in);
	  
	  System.out.println("Bir sayı girin: ");
	  int n=scanner.nextInt();
	  
	  int result=0;
	  int firstNumber=1;
	  int secondNumber=1;
	  
	  for(int i=1;i<=n-2;i++) {
		  result=firstNumber+secondNumber;
		  firstNumber=secondNumber;
		  secondNumber=result;
	  }
	  System.out.println("result = " + (result==0 ? 1 : result));// eğer result 0 olursa (loopun çalışmadığı takdirde) result 1'e eşit olur ya da çalışıyorsa result olur.
	 
	  // stringi boşluklu yazdırma 
	  Scanner sc=new Scanner(System.in);
	   
	   int i;
	   System.out.println("Enter some string: ");
	   String s1=sc.nextLine();
	   for(i=0;i<=s1.length()-1;i++) {
		   System.out.print(s1.charAt(i) + " ");
		   
	   }
	 
	  // string reverse etme
	  Scanner sc1=new Scanner(System.in);
	  System.out.print("String girin:");
	  String s =sc1.nextLine();
	  
	  for(int i=s.length()-1;i>=0;i--) {
		  System.out.print(s.charAt(i));
	  }
	   
	  // palindrom string bulma önceden initialize edilmiş bir string
	  Scanner scanner=new Scanner(System.in);
	  String s1="abcd";
	  boolean isPalindrome=true;
	  for(int i=0, j=s1.length()-1;i<j;i++,j--) {
		  if(s1.charAt(i)==s1.charAt(j)) {
			  continue;
		  }
		  else {
			  isPalindrome=false;
			  break;
		  }
		 
	  }
	  System.out.println(isPalindrome ? s1+ " is palindrome" : s1+ " is not palindrome");
	  
	  // dik üçgen N sayısı kadar yazdırma
	  Scanner scanner=new Scanner(System.in);
	  System.out.print("Please enter an integer: ");
	  int s1=scanner.nextInt();
	  
	  for(int i=1;i<=s1;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(i);
		  }
		  System.out.println();
	  }
	
	  //dik üçgen sağdan sola
	   Scanner scanner=new Scanner(System.in);
	   int num;
	   
	   System.out.println("Please enter a number to create triangle: ");
	   num=scanner.nextInt();
	   
	   for(int i=1;i<=num;i++) {
		   for(int j=1;j<=num-i;j++) {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++) {
			   System.out.print("*");
			}
		   System.out.println();
		  }
	 // normal üçgen loopu   
	  Scanner scan=new Scanner(System.in);
	  System.out.print("Enter a number to form a triangle: ");
	  int num1=scan.nextInt();
	  
	  for(int i=1;i<=num1;i++) {
		  for(int j=1;j<=num1-i;j++) {
			  System.out.print(" ");
			  
		  }
		  for(int k=1;k<=2*i-1;k++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	 
	  // sınırları belli içi boş olan üçgen çizme
	  
	  Scanner scanner=new Scanner(System.in);
	  int n;
	  System.out.println("Enter an integer: ");
	  n=scanner.nextInt();
	  
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=n-i;j++) {
			  System.out.print(" ");
			  
		  }
		  for(int k=1;k<=2*i-1;k++) {
			  if(i==n) {
				  System.out.print("*");  
			  }
			  else if (k==1 || k==2*i-1) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		 }
		  System.out.println();
	  }
	 
	  // içi boş kare programı
	  Scanner scanner=new Scanner(System.in);
	  int v1;
	  
	  System.out.println("Enter a number: ");
	  v1=scanner.nextInt();
	  
	  for(int i=1;i<=v1;i++) {
		 if(i==v1 || i==1) {
			 for(int j=1;j<=v1;j++) {
				 System.out.print("*");
			 }
		 }
		 else {
			for(int j=1;j<=v1;j++) {
				if(j==1 || j==v1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
				
			}
		 System.out.println();
		 }
		
	  // armstrong sayısını bulma
	  Scanner scan=new Scanner(System.in) ;
	  System.out.println("Sayı giriniz: ");
	  int s1=scan.nextInt();
	  int temp=s1;
	  int sum=0;
	  int rem;
	 int length=0;
	  boolean isArmstrong=true;
	  
	  while(temp!=0) {
		 temp=temp/10;
		 length++;
	  }
	 System.out.println(length);
	 do {
		  rem =temp %10;
		  temp /=10; 
		  sum += Math.pow(rem, length);
		 
	  } while(temp>0);
	 
	 if(isArmstrong) {
		 sum=s1;
	 }
	 else {
		 isArmstrong=false;
		
	 }
	 System.out.print(isArmstrong ? s1+ " is an armstrong number" : s1+ " is not an armstrong number.");
		    */
	  // faktoriyel hesabı
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.print("Numara giriniz: ");
	  int num=scan.nextInt();
	  int result=1;
	  for(int i=1;i<=num;i++) {
		  result=result *i;
	  }
		  System.out.println(result);
	  
	  
	   }
}



