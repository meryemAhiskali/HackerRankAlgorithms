/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below.

compareTriplets has the following parameter(s):

int a[3]: Alice's challenge rating
int b[3]: Bob's challenge rating
Return

int[2]: Alice's score is in the first position, and Bob's score is in the second.
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          int [] array;
          array=compare();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int [] compare(){
       Scanner scan = new Scanner(System.in);
       int alice[]= new int[3];
       int bob[] = new int[3];

        for (int i = 0; i < alice.length; i++) {

            if(i==0)
                System.out.print("Please enter Alice's first point: ");
            if(i==1)
                System.out.print("Please enter Alice's second point: ");
            if(i==2)
                System.out.print("Please enter Alice's third point: ");
            alice[i]=scan.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            if(i==0)
                System.out.print("Please enter Bob's first point: ");
            if(i==1)
                System.out.print("Please enter Bob's second point: ");
            if(i==2)
                System.out.print("Please enter Bob's third point: ");
            bob[i]=scan.nextInt();
        }
        int alicePoint =0, bobPoint=0;
        for (int i = 0; i < alice.length; i++) {
            if(alice[i]>bob[i]){
                alicePoint++;
            }else{
                bobPoint++;
            }

        }
        int result [] = new int[2];

        result[0]=alicePoint;
        result[1]=bobPoint;

        return result;
    }
}
