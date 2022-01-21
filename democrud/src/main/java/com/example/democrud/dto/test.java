package com.example.democrud.dto;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class test {
    public static void main(String args[])throws IOException

    {
        System.out.println("=========WELCOME TO AB PROJECT============");
        System.out.println("WELCOME TO THE AB CRICKET");
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("I HOPE U HAD PLAYED HAND CRICKET IN YOUR SCHOLL DAYS,REMEMBERED THAT!!!");
        System.out.println("=========================");
        System.out.println("=======================");
        System.out.println("THE RULES OF THE GAME IS SIMILAR TO THE GAME WHICH YOU HAD PLAYED");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.print("ALLOWED TO ENTER A NUMBER BETWEEN 0 TO 10,YOUR SCORE IS ADDED AND");
      System.out.println("WHEN YOU GET OUTTED AND AUTOMATICALLY YOU WILL BE GO BOWLING.IF COMPUTER PART SCORE MORE THAN");
       System.out.println("YOU ..YOUWILL BE LOST....OTHER..WISE YOU WILL BE WIN!!!!!!!!");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("YOUR OPPONENT NAME JAZZ");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("ENJOY YOUR GAME!!!!!!!!!!!!!!!!");
        System.out.println("============================");
        System.out.println("=========================");
        Scanner br=new Scanner(System.in);
        String playername;
        int a,b,i,wronginput,score1,score2,c,choice;
        double randomnum;
        int looping=1;


        while(looping>0)
        {

            playername=" ";
            a=0;
            i=0;
            b=0;
            randomnum=0;
            wronginput=0;
            score1=0;
            score2=0;
            c=0;
            choice=0;
            looping=1;
            System.out.println("=========================");
            System.out.println("=======================");
            System.out.println("| WELCOME MY DEAR FRIENDS TO THE GAME  |");
            System.out.println("=======================");
            System.out.println("=========================");
            System.out.print("Enter Your Name: ");
            playername=br.nextLine();

            for(c=0;c<=2;c++)
            {
                System.out.println("====================================");
            }

            System.out.println("Hello "+playername+",");


            for(c=0;c<=2;c++)
            {
                System.out.println("====================================");
            }

            System.out.println("YOU ARE BATTING NOW:");

            for(c=0;c<=2;c++)
            { System.out.println("===================================="); }
            for(i=1;i>0;i++)
            {
                System.out.println("");
                System.out.print("Enter the number which you need to ADD TO YOUR TOTAL SCORE : ");
                b=Integer.parseInt(br.nextLine());
                randomnum=((Math.random())*10);
                randomnum=randomnum+1;
                a=(int)(randomnum);
                System.out.println("");
                System.out.println("jazzzz number: "+a);
                System.out.println("");
                System.out.println("**********");
                System.out.println("");
                if(b==a)
                {
                    System.out.println(" ");
                    System.out.println("OUTTTTTTTTTT!!!!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                else if(b>0&&b<=10) { score1=score1+b; } else if(b>10||b<=0)
                {
                    for(c=0;c<=2;c++)
                    {
                        System.out.println("====================================");
                    }
                    System.out.println("you have entered wrong number or the input is wrong");
                    wronginput++;
                    break;
                }
                System.out.println(" YOUR Current Score Is "+score1);
                System.out.println("");
                System.out.println("**********");
            }

            for(c=0;c<=2;c++) { if(wronginput>0)
            {
                break;
            }
                System.out.println("====================================");
            }

            for(c=0;c<1;c++) { if(wronginput>0)
            {
                break;
            }
                System.out.println("YOU ARE BOWLING: ");
            }

            for(c=0;c<=2;c++) { if(wronginput>0)
            {
                break;
            }
                System.out.println("====================================");
            }

            for(i=1;i>0;i++)
            {
                if(wronginput>0)
                {
                    break;
                }

                System.out.println("");
                System.out.print("Enter the Number which you need to BOWL: ");
                b=Integer.parseInt(br.nextLine());
                randomnum=((Math.random())*10);
                randomnum=randomnum+1;
                a=(int)(randomnum);
                System.out.println("");
                System.out.println("jass number: "+a);
                System.out.println("");
                System.out.println("**********");
                System.out.println("");

                if(a==b)
                {
                    System.out.println(" ");
                    System.out.println("JASS IS OUTT!!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("JASS FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                else if(b>0&&b<=10) {
                    score2=score2+a; }
                else if(b>10||b<=0)
                {
                    for(c=0;c<=2;c++) { System.out.println("===================================="); }
                    System.out.println("you have entered wrong number or the input is wrong"); wronginput++; break; }
                if(score2>score1)
                {
                    System.out.println(" ");
                    System.out.println("JASS HAS SCORED MORE THAN YOUU!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("JASS FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                System.out.println("jass Current Score Is "+score2);
                System.out.println("");
                System.out.println("**********");
            }

            for(c=0;c<=2;c++) { if(wronginput>0)
            {
                break;
            }

                System.out.println("====================================");
            }

            for(i=0;i<1;i++) { if(wronginput>0)
            {
                break;
            }

                System.out.println(" ");
                System.out.println("################");
                System.out.println("################");
                System.out.println(" YOUR FINAL SCORE = "+score1);
                System.out.println("JASS FINAL SCORE = "+score2);
                System.out.println("################");
                System.out.println("################");
                System.out.println(" ");
                if((score1)>(score2))
                {
                    System.out.println("Congratulations "+playername+"!! You Have Defeated JASS!!");
                }

                else if((score1)<(score2))
                {
                    System.out.println("Sorry "+playername+", JASS Has Defeated You..!");
                }

                else
                {
                    System.out.println("It's a Tie..! :(");
                }

            }

            for(c=0;c<=2;c++)
            {
                System.out.println("====================================");
            }                                                                                                                                                  

            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.nextLine());
            System.out.println("");

            if(choice==1)
            {
                System.out.print('\f');
            }

            else
            {
                System.out.print('\f');
                System.out.println("Good Bye!");
                break;
            }

        }
    }
}
