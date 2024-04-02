import java.util.*;
import java.lang.Math ;
public class GameNumber {
public static void main(String[]args){
Scanner in =new Scanner (System.in) ;
int n=10;
int finals=0;
boolean AgainPlay =true;
System.out.println( " welcome to play Game " ); 
System.out.println( " Hello Guys win the Game " +n );
while(AgainPlay) {
int R =getRNum(1,1000) ;
boolean G =false ;
for(int i=0;i<n;i++) { 
System.out.println("n" + (i+1) + " enter the number " );
int U=in.nextInt() ;
if(U==R){
G =true ;
finals+=1;
System.out.println( " you are win Game" );
break ;
}
else if(U>R) {
System.out.println( " TOO HIGH " ); 
}
else {
System.out.println( " TOO LOW " );  
 }
}
if(G==false) {
System.out.println( " sorry Guys you are lost the Game " +R ) ; 
}
System.out.println( " play Agin(yes/no " ) ; 
String AP=in.next() ; 
AgainPlay=AP.equalsIgnoreCase("yes") ;
}
System.out.println( " I thik you are the enjoy play this number Game " ) ;
System.out.println( " Your score play  the Game is " +finals ) ; 
} 
public static int getRNum(int min,int max){
   return (int)(Math.random()*(max-min+1)+min) ;

}
}