import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  private static String choosePrime()
  {
    try {
      Scanner scanner = new Scanner(new File("Primes_5Digits.txt"));
      ArrayList<String> nums = new ArrayList<String>();  
      String num;
      while (scanner.hasNext()) 
      {
        num = scanner.next();
        nums.add(num);
      }
      return nums.get((int)(Math.random()*8364));
    }
    catch(FileNotFoundException ex) 
      {
        return "File is not found!";
      }
  }
  public static void main(String[] args) 
  {
    //answer
    String str = choosePrime();
    //used for keeping track of the answer
    int zero=0,one=0,two=0,three=0,four=0,five=0, six=0,seven=0,eight=0,nine=0; 
    int [] numbers = {0,0,0,0,0,0,0,0,0,0};
    String [] numbs = {"0","1","2","3","4","5","6","7","8","9"};
    //used to keep track of guess'
    int turnCount = 0;
    //list of all 5 digit primes
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nums = new ArrayList<String>();
    try {           
          Scanner scanner = new Scanner(new 
          File("Primes_5Digits.txt"));  
          String num;
          while (scanner.hasNext()) 
          {
            num = scanner.next();
            nums.add(num);
          }
        }
      catch(FileNotFoundException ex) 
      {
        System.out.println("File is not found!");
      }
    //user's guess
    String userInput = "";
    
    System.out.println("Do you want to play a game???");
    System.out.println("This is Primel, a numerical version of wordle. Every day there is a new 5 digit prime, and it's your job to find it. Guess a 5 digit prime. If a number is in the right place, a ! will appear. If it is in the number but not in the right place, a ? will appear. If it is not in the number, an X will appear. Good luck!");
    
    while(turnCount < 5 && !userInput.equals(str))
    {
      for(int i = 0; i<5; i++)
      {
        switch(str.substring(i,i+1))
        {
          case "0": zero = zero + 1; numbers[0]+=1;break;
          case "1": one = one + 1;numbers[1]+=1;break;
          case "2": two = two + 1;numbers[2]+=1;break;
          case "3": three = three + 1;numbers[3]+=1;break;
          case "4": four = four + 1;numbers[4]+=1;break;
          case "5": five = five + 1;numbers[5]+=1;break;
          case "6": six = six + 1;numbers[6]+=1;break;
          case "7": seven = seven + 1;numbers[7]+=1;break;
          case "8": eight = eight + 1;numbers[8]+=1;break;
          case "9": nine = nine + 1;numbers[9]+=1;break; 
        }
      }
      System.out.println("Enter a five digit prime here: ");
      userInput = sc.nextLine();
      if(nums.indexOf(userInput)<0)
      {
        System.out.println("Try again....NOW");
      }
      else
      {
        System.out.println();
        for(int i = 0; i < 5; i++)
          {
            if(str.indexOf(userInput.substring(i,i+1)) == -1)
              System.out.print("X");
            else
            {
              if(str.indexOf(userInput.substring(i,i+1)) == i)
              {
                System.out.print("!");
                switch(userInput.substring(i,i+1))
                {
                    case "0": zero = zero - 1;break;
                    case "1": one = one - 1;break;
                    case "2": two = two - 1;break;
                    case "3": three = three - 1;break;
                    case "4": four = four - 1;break;
                    case "5": five = five - 1;break;
                    case "6": six = six - 1;break;
                    case "7": seven = seven - 1;break;
                    case "8": eight = eight - 1;break;
                    case "9": nine = nine - 1;break; 
                }
              }
              else
              {
                //index of w two arrays
                System.out.print("?");
                switch(userInput.substring(i,i+1))
                {
                  case "0": zero = zero - 1;break;
                  case "1": one = one - 1;break;
                  case "2": two = two - 1;break;
                  case "3": three = three - 1;break;
                  case "4": four = four - 1;break;
                  case "5": five = five - 1;break;
                  case "6": six = six - 1;break;
                  case "7": seven = seven - 1;break;
                  case "8": eight = eight - 1;break;
                  case "9": nine = nine - 1;break; 
                }
              }
            }
          }
          System.out.println();
        
          turnCount++;
          
        }
      }
    if(str.equals(userInput))
      System.out.println("YOU WIN!");
    else 
      System.out.println("you suck.");
    }
  }
