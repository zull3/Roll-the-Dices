class Main{
  public static void main (String args []){

    // Define the range
    int max = 10;
    int min = 1;
    int range = 0;
   
    int rand1 = 0; 
    int rand2 = 0;
    int rand3 = 0;
    
    range = max - min +1;  

    // Generate random numbers within min(1) to max (10)
    rand1 = (int)(Math.random() * range) + min;
    rand2 = (int)(Math.random() * range) + min;
    rand3 = (int)(Math.random() * range) + min;

    //Output is different everytime this code executes
    System.out.println("Roll the Dices");
    System.out.printf("%-3s", rand1); 
    System.out.printf("%-3s", rand2); 
    System.out.printf("%-3s%n", rand3); 

    System.out.print("The sum of the dices is: " + (rand1 + rand2 + rand3));
    

  }
}