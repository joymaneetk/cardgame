package javacardgame;
import java.util.*;
/**
*
*/
public class javacardgame {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
System.out.println("A 11 is Jack, a 12 is a Queen, and a 13 is a King. A straight flush is
higher than a three of a kind which is higher than a straight, which is higher than a flush, which
is higher than a pair, which is higher than just a high card.");

//for the true false statement
int score= 0;
for (int counter=2; counter>1; counter++) {
int cpuvalue= 0;
int uservalue=0;
int[] cardvalues= new int [13];
cardvalues[0]= 1;
cardvalues[1]= 2;
cardvalues[2]= 3;
cardvalues[3]= 4;
cardvalues[4]= 5;
cardvalues[5]= 6;
cardvalues[6]= 7;
cardvalues[7]= 8;
cardvalues[8]= 9;
cardvalues[9]= 10;
cardvalues[10]= 11;
cardvalues[11]= 12;
cardvalues[12]= 13;

String[] cardsuits= new String [4];
cardsuits[0]= " of spades ";
cardsuits[1]= " of clubs ";
cardsuits[2]= " of hearts “;
cardsuits[3]= " of diamonds ";

String[] cpusayings= new String [9];
cpusayings[0]= "Your opponent smirks ";
cpusayings[1]= "Your opponent laughs ";
cpusayings[2]= "Your opponent has a sad face ";
cpusayings[3]= "Your opponent intimidates you";
cpusayings[4]= "Your opponent makes a scary face";
cpusayings[5]= "Your opponent eats a burger ";
cpusayings[6]= "Your opponent bites his hand";
cpusayings[7]= "Your opponent licks his lips";
cpusayings[8]= "Your opponent glares at your hand";

int cpucardvalue1 = cardvalues[(int) (0 + Math.random( ) * 13)];
String cpucardsuit1 = cardsuits[(int) (0 + Math.random( ) * 4)];
int cpucardvalue2 = cardvalues[(int) (0 + Math.random( ) * 13)];
String cpucardsuit2 = cardsuits[(int) (0 + Math.random( ) * 4)];
int cpucardvalue3 = cardvalues[(int) (0 + Math.random( ) * 13)];
String cpucardsuit3 = cardsuits[(int) (0 + Math.random( ) * 4)];
int usercardvalue1 = cardvalues[(int) (0 + Math.random( ) * 13)];
String usercardsuit1 = cardsuits[(int) (0 + Math.random( ) * 4)];
int usercardvalue2 = cardvalues[(int) (0 + Math.random( ) * 13)];
String usercardsuit2 = cardsuits[(int) (0 + Math.random( ) * 4)];
int usercardvalue3 = cardvalues[(int) (0 + Math.random( ) * 13)];
String usercardsuit3 = cardsuits[(int) (0 + Math.random( ) * 4)];
int[] cpuarray= new int [3];
cpuarray[0]= cpucardvalue1;
cpuarray[1]= cpucardvalue2;
cpuarray[2]= cpucardvalue3;
Arrays.sort(cpuarray);
int cpudifference1 = cpuarray[1]-cpuarray[0];
int cpudifference2 = cpuarray[2]-cpuarray[1];
int[] userarray= new int [3];
userarray[0]= usercardvalue1;
userarray[1]= usercardvalue2;
userarray[2]= usercardvalue3;
Arrays.sort(userarray);
int userdifference1 = userarray[1]-userarray[0];
int userdifference2 = userarray[2]-userarray[1];
System.out.println("These are your cards " + usercardvalue1 +usercardsuit1+ usercardvalue2 + usercardsuit2 + usercardvalue3+ usercardsuit3 );
//this is determining what the cpu has
if(cpucardvalue1==cpucardvalue2 && cpucardvalue2==cpucardvalue3){
cpuvalue= 4;}
else{
if(cpucardsuit1.equals(cpucardsuit2)&& cpucardsuit2.equals(cpucardsuit3)){
cpuvalue=2;
if(cpudifference1==1 && cpudifference2==1){
cpuvalue=5;}
}
}
if(cpudifference1==1 && cpudifference2==1 && !cpucardsuit1.equals(cpucardsuit2) &&!
cpucardsuit2.equals(cpucardsuit3)){
cpuvalue=3;
}

if(cpucardvalue1==cpucardvalue2 || cpucardvalue2==cpucardvalue3 ||
cpucardvalue1==cpucardvalue3){
cpuvalue=1;
}
//cpu sayingz
if(cpuvalue<2){
System.out.println(cpusayings[(int) (0 + Math.random( ) * 5)]);
}
else{
System.out.println(cpusayings[(int) (5 + Math.random( ) * 5)]);
}
//user order of cards
if(usercardvalue1==usercardvalue2 && usercardvalue2==usercardvalue3 && uservalue !
= 2 && uservalue != 4){
uservalue= 4;
System.out.println("You have three of a kind.");
}
else{
if(usercardsuit1.equals(usercardsuit2)&& usercardsuit2.equals(usercardsuit3)){
uservalue=2;
System.out.println("You have a flush.");
if(userdifference1==1 && userdifference2==1){
uservalue=5;
System.out.println("You have a straight flush.”);}

}
}
if(userdifference1==1 && userdifference2==1 && !cpucardsuit1.equals(cpucardsuit2)
&& !cpucardsuit2.equals(cpucardsuit3)){
uservalue=3;
System.out.println("You have a straight.");
}

else{
if(usercardvalue1==usercardvalue2 || usercardvalue2==usercardvalue3 ||
usercardvalue1==usercardvalue3 && uservalue != 2 && uservalue != 4){
uservalue=1;
System.out.println("You have a pair.");
}
if(uservalue==0){
System.out.println("You have your high card.");
}
}
//whether you want to fold or not
Scanner userInput = new Scanner (System.in);
System.out.println("Please enter yes if you want to fold or no if you don't want to");
String answer = userInput.nextLine();
switch(answer){
case "yes": { System.out.println("These were your opponent's cards " + cpucardvalue1
+cpucardsuit1+ cpucardvalue2 + cpucardsuit2 + cpucardvalue3+ cpucardsuit3 );}break;
case "no":{
System.out.println("These are your opponent's cards " + cpucardvalue1
+cpucardsuit1+ cpucardvalue2 + cpucardsuit2 + cpucardvalue3+ cpucardsuit3);
if(uservalue>cpuvalue){
System.out.println("You win");
score = score +1 ;}
if(cpuvalue>uservalue){
System.out.println("You lose.");
}
if(uservalue==cpuvalue && uservalue != 1 ){
if(userarray[2]>cpuarray[2]){
System.out.println("You win");
score = score +1 ;
}
else {
if (userarray[2]==cpuarray[2]){
System.out.println("Its a tie");
}
else {
if(userarray[2]<cpuarray[2]){
System.out.println("You lose."); }
}
}
}
if(uservalue == cpuvalue && uservalue == 1){
if(userarray[1]> cpuarray[1]){
System.out.println("You win");
score = score +1 ;
}
else
if(userarray[1]<cpuarray[1]){
System.out.println("You Lose");
}
else
if(userarray[1]==cpuarray[1]){
System.out.println("It is a tie");
}
}
}break;
default: System.out.println("ONLY INPUT YES OR NO");
}
if(answer.equals("yes") || answer.equals("no")){
Scanner userInput2 = new Scanner (System.in);
System.out.println("Please enter true if you want to play again and false if you don't want
to.");
boolean yesno = userInput2.nextBoolean();
if(yesno)
{counter=counter+1;}
else
{counter=0;
System.out.println("This is how many games you won: " + score);}
}
}
}
}
