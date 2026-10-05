
interface Samsung { 
     int add (int a, int b);
     default void display(){
         System.out.println("this is a add method");
     }
 }
 class Main10{
     static void main(String [] args){
         Samsung s1 = (a,b) -> a+b;
         System.out.println(s1.add(10,50));
     }
 }