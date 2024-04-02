import java.util.*;
public class StuGrade
{
public static void main(String[]args)
 {
 Scanner sc =new Scanner(System.in);
 System.out.println( "student grade cal" ) ;
 System.out.println( "enter the number" ) ;
 int n =sc.nextInt();
 int C=0 ;
 for(int i=0;i<n;i++) {
 System.out.println( "enter the obtained marks in"+i+"_" ) ;
 int marks =sc.nextInt();
 C=marks;
 }
 double AvgP =(double)C/n ;
 char ch =' ' ;
 if ( AvgP >=90 ) {
  System.out.print( "Student Grade is "+'S' ) ;
  }
  else if( AvgP >=80 ) {
  System.out.print ( "Student Grade is "+'A'  ) ;
  }
  else if ( AvgP >=70 ) {
  System.out.print ( "Student Grade is "+'B' ) ;
  }
  else if( AvgP >=60 ) {
  System.out.print( "Student Grade is "+'C'  ) ;
  }
  else if( AvgP >=50 ) {
  System.out.print ( "Student Grade is "+'D'  ) ;
 }
  else if( AvgP >=40 ) {
 System.out.print( "Student Grade is "+'E'  )  ;
 }
  else {
   System.out.print( "Student is faild") ;
   }
  System.out.println( "totel marks scerod is"+C ) ;
  System.out.println( "avrage presantage is"+AvgP ) ;
  System.out.println( " student Grade is "+ch) ;
  }
  }
 
 