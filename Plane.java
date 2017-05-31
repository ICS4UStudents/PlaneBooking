import java.io.*;
public class Plane{ 
  public int FULL_PLANE = 10; //Maximum seats
  String[][] seats = new String[2][5];
  /*Plane's seats will resemble
   * | [A1] [B1] [C1] [D1] [E1] |
   * | [A2] [B2] [C2] [D2] [E2] |
   */
//Flights as objects
	public String flight1;
	public String flight2;
	public String flight3;
  public static void main(String[] args){
	        InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
	     do {                        
         System.out.println("1 = Flight#AC006 2 = Flight#AC023 3 = Flight#AC064");
	try{
         String Flight = bufRead.readLine();
         int choiceFlight =  Integer.parseInt(choiceFlight);
             } while(choiceFlight != 3)
		
	    if(choiceFlight == 1)
         {
		    //Needs to be a way where flight#1 holds all this info
		    do{
          printMenu();
          String enterType = bufRead.readLine();
	  int choiceNumber = Integer.parseInt(enterType);
        if(choiceNumber = 1)
        {
         makeSeatReservation(seats);
        }
      
         if(choiceNumber == 2)
        {
          cancel(seats);
        }
      
         if(choiceNumber == 3)
        {
          printSeating(seats);
        }
	 if(choiceNumber == 4)
        {
          FlightCancel(seats);       
        }
	 if(choiceNumber == 5)
	 {
	  FlightTakeoff();
	 }
	  if(choiceNumber == 6)
        {
          
          System.exit(0);
        }
        else
        {
          System.out.println("Invalid number, please type again.")
        }
    }while(choiceNumber != 6)
	     }
	  catch(IOException e){
				 System.out.println("Error Reading");
				 }
				 catch(NumberFormatException err) {
				 System.out.println("Error Converting Number");
				 }
         }
	  
         if(choiceFlight == 2)
         {
		 //Needs to be a way where flight#2 holds all this info
           do{
          printMenu();
          String enterType2 = bufRead.readLine();
	  int choiceNumber2 = Integer.parseInt(enterType2);
        if(choiceNumber2 = 1)
        {
         makeSeatReservation(seats);
        }
      
         if(choiceNumber2 == 2)
        {
          cancel(seats);
        }
      
         if(choiceNumber2 == 3)
        {
          printSeating(seats);
        }
	 if(choiceNumber2 == 4)
        {
          FlightCancel(seats);       
        }
	 if(choiceNumber2 == 5)
	 {
	  FlightTakeoff();
	 }
	  if(choiceNumber2 == 6)
        {
          
          System.exit(0);
        }
        else
        {
          System.out.println("Invalid number, please type again.")
        }
    }while(choiceNumber2 != 6)
	     }
	  catch(IOException e){
				 System.out.println("Error Reading");
				 }
				 catch(NumberFormatException err) {
				 System.out.println("Error Converting Number");
				 }
         }
	
         if(choiceFlight == 3)
		 //Needs to be a way where flight#3 holds all this info
         {         
           do{
          printMenu();
          String enterType3 = bufRead.readLine();
	  int choiceNumber3 = Integer.parseInt(enterType);
        if(choiceNumber3 = 1)
        {
         makeSeatReservation(seats);
        }
      
         if(choiceNumber3 == 2)
        {
          cancel(seats);
        }
      
         if(choiceNumber3 == 3)
        {
          printSeating(seats);
        }
	 if(choiceNumber3 == 4)
        {
          FlightCancel(seats);       
        }
	 if(choiceNumber3 == 5)
	 {
	  FlightTakeoff();
	 }
	  if(choiceNumber3 == 6)
        {
          
          System.exit(0);
        }
        else
        {
          System.out.println("Invalid number, please type again.")
        }
    }while(choiceNumber3 != 6)
	     }
	  catch(IOException e){
				 System.out.println("Error Reading");
				 }
				 catch(NumberFormatException err) {
				 System.out.println("Error Converting Number");
				 }
         }
   
	    /**
     * Menu
     */
      
   }
  public void printMenu();
  {
 System.out.println(" Booking Menu "); 
 System.out.println("                ");
 System.out.println("Please press the corresponding numbers to perform a specific action");
 System.out.println("1. Make a reservation");
 System.out.println("2. Cancel a reserved seat");
 System.out.println("3. View the current available/reserved seats remaining");
 System.out.println("4. Cancel the flight");
 System.out.println("5. Flight takeoff");
 System.out.println("6. Quit"); //More options can be added
  }
  /**
     * Make a reservation
     */
    public void makeSeatReservation(String[][] seats) {
          // Enter Yi's code for reserving a seat ++  *(SeatIndex is not a actually variable)
	     InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
        if (seatsIndex == seats.length) {
            System.out.println("All seats are full. Sorry, for the inconvenience...");
        } else {
		    String choiceSeat;
		
		int full = 0;
		while(full == 0){
			try {
				choiceSeat = bufRead.readLine();
				if(choiceSeat.equals("A1"))
			    {
					if(seats[0][0] == null)
					{	
						System.out.println("In order to book this seat, please type in the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();   
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				
				if(choiceSeat.equals("A2"))
			    {
					if(seats[1][0] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();						   
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("B1"))
			    {
					if(seats[0][1] == null)
					{
						System.out.println("In order to book this seat, please type in the customers, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("B2"))
			    {
					if(seats[1][1] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();						  
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("C1"))
			    {
					if(seats[0][2] == null)
					{
						System.out.println("In order to book this seat, please type in the customers, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();						  
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("C2"))
			    {
					if(seats[1][2] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();						   
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("D1"))
			    {
					if(seats[0][3] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("D2"))
			    {
					if(seats[1][3] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("E1"))
			    {
					if(seats[0][4] == null)
					{
						System.out.println("In order to book this seat, please type the customers name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
				if(choiceSeat.equals("E2"))
			    {
					if(seats[1][4] == null)
					{
						System.out.println("In order to book this seat, please type in the customers, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose another seat.");
					}
			    }
			}
			
			catch(IOException e){
				 System.out.println("Error Reading");
				 }
				 catch(NumberFormatException err) {
				 System.out.println("Error Converting Number");
				 }
		}
	}
    }
//If the seat is full, you need a way to allow the attendant to choose another seat
     /**
     * Cancel a reservation
     */

    int getCancel() { //THIS METHOD ISNT COMPLETED!!! THIS IS JUST HOW THE METHOD WILL FUNCTION
                InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
	    boolean valid = false;  // is the seat number valid?
        int seat;               // seat number to cancel
        do {
            System.out.print("Enter the seat to cancel: ");
       //     seat = add buffer reader
            if (1 <= seat && seat <= FULL_PLANE) {
                valid = true;
            } else {
                System.out.println("Invalid seat number");
            }
        } while (!valid);
 
        return seat-1;
    }
	    /**
     * Cancel a Flight
     */
	    int getFlightCancel(){
		    //Mikes beginning code 
		    
		    
		    
		    
		    
	    }
	/**
     * Flight Print out (Take off time)
     */
	int getFlightTakeoff(String[][] seats){
		//Prints passengers seats and who has it
	//Needs customer objects in order to do 
		 InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
		System.out.println("Is the plane ready to takeoff?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		 String done = bufRead.readLine();
	  int confirmDone = Integer.parseInt(done);
		if(confirmDone == 1)
		{
		//passengers manifest
		}
		if(confirmDone == 2)
		{
		//return to printMenu();
		}
		
	}
    }
