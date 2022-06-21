//Czy liczba jest parzysta wpisujac z klawiatury

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe :");
int liczba = scanner.nextInt();
if( liczba % 2 == 0 ) System.out.println("Podana liczba jest parzysta.");
  
else System.out.println("Podana liczba nie jest parzysta.");
    
  }
}

//Czy liczba jest parzysta wpisujac z tablicy (podane wczesniej)

public class Main { 
public static void main(String[] args) {
   int[] tablica = { 1, 2, 3, 4, 5 };
   int n = tablica.length;
  System.out.println("Liczby parzyste");
  for (int i = 0; i < n; i++) {
    if (tablica[i] %2 == 0)
            System.out.print(" "+tablica[i]);
    
            
  }
  System.out.println("\nLiczby nieparzyste");
  for (int i = 0; i < n; i++)
    if (tablica[i] %2 != 0)
       System.out.print(" "+tablica[i]);
}
}

//Czy liczba jest dodatnia czy ujemna z klawiatury

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe :");
int liczba = scanner.nextInt();
if(liczba > 0 ) System.out.println("Podana liczba jest dodatnia.");
if(liczba <0) System.out.println("Podana liczba jest ujemna.");
if(liczba ==0) System.out.println("Podana liczba jest 0.");

    
  }
}

//Czy liczba jest dodatnia czy ujemna z tablicy(podane wczesniej):

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
int[] tablica = { 10, -2, 3, 42, 0 };
   int n = tablica.length;
   System.out.println("Liczby dodatnie:");
    for (int i = 0; i < n; i++){
      if(tablica[i] > 0 ) 
      System.out.print(" "+tablica[i]);
    }
    System.out.println("\nLiczby ujemne:");
    for (int i = 0; i < n; i++){
      if(tablica[i] < 0 ) 
      System.out.print(" "+tablica[i]);
  }
    System.out.println("\nLiczba 0:");
    for (int i = 0; i < n; i++){
      if(tablica[i] == 0 ) 
      System.out.print(" "+tablica[i]);
    }
}
}

//Kalkulator dodawanie odejmowanie dzielenie mnozenie bez switch case:

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj pierwszą liczbe :");
double liczba1 = scanner.nextInt();
System.out.println("Podaj drugą liczbe :");
double liczba2 = scanner.nextInt();

double dodawanie;
double odejmowanie1;
double odejmowanie2;
double mnozenie;
double dzielenie1;
double dzielenie2;
    
dodawanie=liczba1+liczba2;
odejmowanie1=liczba1-liczba2;
odejmowanie2=liczba2-liczba1; 
mnozenie=liczba1*liczba2;
dzielenie1=liczba1/liczba2;
dzielenie2=liczba2/liczba1;
System.out.println("Dodawanie "+dodawanie);
System.out.println("Odejmowanie1od2 "+odejmowanie1);
System.out.println("Odejmowanie2od1 "+odejmowanie2); 
System.out.println("Mnozenie "+mnozenie);
System.out.println("Dzielenie1przez2 "+dzielenie1);
System.out.println("Dzielenie2przez1 "+dzielenie2); 
}
}

//Kalkulator dodawanie odejmowanie dzielenie mnozenie z switch case:
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
  System.out.println("Podaj co chcesz zrobic:");
  System.out.println("1.Dodawanie:");
  System.out.println("2.Odejmowaniel1-l2:");
  System.out.println("3.Odejmowaniel2-l1:");
  System.out.println("4.Mnożenie:");
  System.out.println("5.Dzieleniel1/l2:");
  System.out.println("6.Dzielenie l2/l1:");
  Scanner scanner = new Scanner(System.in);
  int x = scanner.nextInt();
  System.out.println("Podaj pierwszą liczbe :");
  double liczba1 = scanner.nextInt();
  System.out.println("Podaj drugą liczbe :");
  double liczba2 = scanner.nextInt();
    switch (x){
      
case 1:  
  double dodawanie;
  dodawanie=liczba1+liczba2;
  System.out.println("Dodawanie "+dodawanie);
  break;
case 2: 
  double odejmowanie1;
odejmowanie1=liczba1-liczba2;
  System.out.println("Odejmowanie1od2 "+odejmowanie1);
break;
case 3: 
  double odejmowanie2;
odejmowanie2=liczba2-liczba1; 
  System.out.println("Odejmowanie2od1 "+odejmowanie2); 
break;
case 4: 
  double mnozenie;
mnozenie=liczba1*liczba2;
System.out.println("Mnozenie "+mnozenie);
break;
case 5: 
  double dzielenie1;
dzielenie1=liczba1/liczba2;
System.out.println("Dzielenie1przez2 "+dzielenie1);
 break;
case 6: 
double dzielenie2;
dzielenie2=liczba2/liczba1;
System.out.println("Dzielenie2przez1 "+dzielenie2); 
break;
  }
}
  }

//Masz 3 liczby znalezc najwieksza i najmniejsza.

import java.util.Scanner;
public class Main {
public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj piewrsza liczbe :");
int liczba1 = scanner.nextInt();
System.out.println("Podaj druga liczbe :");
int liczba2  = scanner.nextInt();
System.out.println("Podaj trzecie liczbe :");
int liczba3  = scanner.nextInt();
if(liczba1 > liczba2 && liczba1 >liczba3){
  System.out.println("Najwieksza  liczba to :"+liczba1);
}
if(liczba3 > liczba1 && liczba3 >liczba2){
  System.out.println("Najwieksza liczba to :"+liczba3);
}
if(liczba2 > liczba1 && liczba2 >liczba3){
  System.out.println("Najwieksza  liczba to :"+liczba2);
}
if(liczba1 < liczba2 && liczba1 <liczba3){
  System.out.println("Najmniejsza liczba to :"+liczba1);
}
if(liczba3 < liczba1 && liczba3 <liczba2){
  System.out.println("Najmniejsza liczba to :"+liczba3);
}
if(liczba2 < liczba1 && liczba2 <liczba3){
  System.out.println("Najmniejsza liczba to :"+liczba2);
}

//Zamiana z m/s na km/h

import java.util.Scanner;
public class Main {
public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj predkosc w m/s :");
double liczba1 = scanner.nextDouble();
System.out.println("Podaj predkosc w km/h :");
double liczba2 = scanner.nextDouble();
  
double liczba3 = liczba1 *(3.6);
double liczba4=  liczba2/(3.6);
System.out.println("Zamiana z m/s na km/h :"+liczba3);
System.out.println("Zamiana z km/h na m/s :"+liczba4);
  

  }
}

//Czy jest Palindromem

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String a = scanner.nextLine();
        String b=(a.toLowerCase());
        int h = b.length();
        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {
            if (b.charAt(i) != b.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }
        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }
    }
}

//Czy sa Angramami
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj 1 wyraz: ");
    String a = scanner.nextLine();
    System.out.println("Podaj 2 wyraz: ");
    String b = scanner.nextLine();
    
    a = a.toLowerCase();
    b = b.toLowerCase();

    // sprawdza dlugosc
    if(a.length() == b.length()) {

      // convertuje stringa na znaki
      char[] charArray1 = a.toCharArray();
      char[] charArray2 = b.toCharArray();

      // sortuje znaki
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(a + " i " + b + " sa anagrami.");
      }
      else {
        System.out.println(a + " i " + b + " nie sa anagrami.");
      }
    }
    else {
      System.out.println(a + " i " + b + " nie sa  anagrami.");
    }
  }
}



//Czy liczba jest pierwsza

import java.util.Scanner;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe: ");
    int liczba = scanner.nextInt();
    boolean n=true;
    for(int i=2; i<Math.sqrt(liczba); i++)
      if((liczba % i==0))
      {
        n=false;
      }
  if(n)
    System.out.println("Liczba jest pierwsza ");  
    else System.out.println("Nie jest pierwsza ");  
        
  }
}

//ax2+bx+c=0

import java.util.Scanner;
import java.math.*;
class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj a :");
double a = scanner.nextDouble();
System.out.println("Podaj b :");
double b = scanner.nextDouble();
System.out.println("Podaj c :");
double c = scanner.nextDouble();
double delta=0;
double x =0;
double x1 =0;
double x2 =0;
double pierwdelta=0;
delta = (b*b)-4*(a*c);
pierwdelta = Math.sqrt(delta);
    if (delta < 0){
    System.out.println("Brak rozwiazan");
    }
    if (delta == 0){
    x=(-b)/(2*a);
    System.out.println("Jedno Rozwiązanie"+x);}
    if (delta > 0){
    x1= ((-b)-(pierwdelta))/(2*a);
    x2= ((-b)+(pierwdelta))/(2*a);
    System.out.println("Dwa rozwiazania "+x1  +x2);}
    
      
    
  }
}

//Czy trojkat istnieje

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj a :");
double a = scanner.nextDouble();   
System.out.println("Podaj b :");
double b = scanner.nextDouble();   
System.out.println("Podaj c :");
double c = scanner.nextDouble();   
if(a + b > c && a + c > b && b + c > a)
System.out.println("Trojkat istnieje");
else
System.out.println("Trojkat nie istnieje");
      
  }
}

//Czy rok jest przestepny?

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj rok:");
int rok = scanner.nextInt();   
    if (rok % 4 == 0 && rok > 0) 
    System.out.println("Rok jest przestepny");
    else
    System.out.println("Rok nie jest przestepny");

      
  }
}
 
//Silnia na while

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe:");
int liczba = scanner.nextInt();   
    
   int i=1, s=1;
    while(i<=liczba){
      s=s*i;
      i++;
    }
    System.out.print(liczba);
    System.out.print("! = ");
    System.out.println(s);
  

      
  }
}

//Silnia na for

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe:");
int liczba = scanner.nextInt();  
int silnia=1;
int i;
    
  for (i=1;i<=liczba;i++)
  {
      
    silnia=silnia*i;
  }
       
    System.out.println("Silnia liczby "+liczba+" to: "+silnia);
    

      
  }
}


//Losowanie liczb z klawiatury

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj ile liczb");
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    int min=-100;
    int max=100;
    int liczbydodatnie=0;
    int liczbyujemne=0;
    int liczbamaksymalna=0;
    int liczbaminimalna=0;
    for(int i=0;i<liczba;i++)
      {
        int los = (int)(Math.random() * 200) + min;
      

    if(los>0)
    {
      liczbydodatnie++;
    }
    else if (los<0)
    {
      liczbyujemne++;
    }

   if ( los> liczbamaksymalna)
   {
     liczbamaksymalna=los;
   }
    else if(los<liczbaminimalna)
    {
      liczbaminimalna=los;
    }
        
        System.out.println("Wylosowano "+los);
         
      }
 System.out.println("Liczba dodtatnich jest"+liczbydodatnie);
 System.out.println("Liczba ujemnych jest"+liczbyujemne);
System.out.println("Maksymalna liczba"+liczbamaksymalna);
    System.out.println("Minimalna liczba"+liczbaminimalna);
  }
}


 //Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
//Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
//podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.       

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj Liczbę");
    Scanner scanner = new Scanner(System.in);
    int liczba=0;
    int srednia=0;
    int suma=0;
    int przez3=0;
    int i=0;
    liczba=scanner.nextInt();
 while(liczba!=150)
   {
   
    suma=liczba+suma;
    if(liczba%3==0)
      
    przez3++;
    i++;
     liczba=scanner.nextInt();
   }
  srednia=suma/i;
  System.out.println("Suma   "+suma);
  System.out.println("srednia   "+srednia);
  System.out.println("Podzielne przez trzy   "+przez3);
  }
}
//1. Napisać program wczytujący od użytkownika liczbę x i rysujący na ekranie (przy pomocy znaku 'o')
//trójkąt prostokątny, w którym obydwie przyprostokątne są długości x. 

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczbe x");
    Scanner scanner = new Scanner(System.in);
    int x=scanner.nextInt();
    for(int i=0;i<x+1;i++)
      {
        for(int j=0;j<i;j++)
          {
            System.out.print(" o ");
          }
        System.out.println("");
      }
  }
}

//Napisać program, który nie używając tablic wyznacza drugą co do wielkości (lub przedostatnią) liczbę
//w ciągu. Ciąg zakończony jest liczbą 123, która nie jest brana pod uwagę w obliczeniach. 


import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe x");
    int liczba=0;
    int najwieksza=0;
    int prawienajwieksza=0;
    int i=0;
    liczba=scanner.nextInt();
    while(liczba!=123)
      {
        if(liczba>najwieksza)
        {
          prawienajwieksza=najwieksza;
          najwieksza=liczba;
          
        }
         if(liczba<najwieksza)
        {
          prawienajwieksza=najwieksza;
          najwieksza=liczba;
          
        }
        i++;
        liczba=scanner.nextInt();
      }
     System.out.println("Najwieksza "+najwieksza);
    System.out.println("Prawie najwieksza "+prawienajwieksza);
  }
}

//Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich. Liczby wczytywane są od użytkownika, koniec wczytywania oznacza podanie liczby 0. 
import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe ");
    int iloczyn=1;
    int srednia=0;
    int i=0;
    int suma=0;
    int liczba=scanner.nextInt();
    while(liczba!=0)
          { 
      if(liczba>0)
      {
      iloczyn=iloczyn*liczba;
      }
      if(liczba<0)
      {
      suma=liczba+suma;
        i++;
      }
      
      
     liczba=scanner.nextInt();
          }
  srednia=suma/i;
     System.out.println("Suma  "+suma);
    System.out.println("Srednia  "+srednia);
    System.out.println("Iloczyn  "+iloczyn);
  }
}

//Napisać wczytujący łańcuch liter, a następnie zamieniający litery (z małych na duże) znajdujące się na pozycjach podzielnych przez 3. Ponadto program zlicza liczbę wystąpień liter 'a', 'c', 'g', 'j' oraz 'z'. 

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj lancuch liter ");
    String lancuch=scanner.nextLine();
    char[] tablica = lancuch.toCharArray();
   int dlugosc=tablica.length;
    int ilosc=0;
    for(int i=0;i<dlugosc;i++)
    {
      if(i%3==0)
      {
       tablica[i]= Character.toUpperCase(tablica[i]);
      }


    if (tablica[i]=='a' || tablica[i]=='c'|| tablica[i]=='g'||tablica[i]=='j'||tablica[i]=='z');
    {
     ilosc++;
    }
       
      }
    for(int i=0;i<dlugosc;i++)
       {
          System.out.print(""+tablica[i]);
       }
    System.out.println(" ");
    System.out.println(""+ilosc);
  }
}
