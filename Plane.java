import java.io.*;
public class Plane{ 
  public int FULL_PLANE = 10; //Maximum seats
  String[][] seats = new String[2][5];
  /*Plane's seats will resemble
   * | [A1] [B1] [C1] [D1] [E1] |
   * | [A2] [B2] [C2] [D2] [E2] |
   */
  public static void main(String[] args){
	        InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);                       
        
	  
	  customer A1 = new customer(null, null, null, null);
			
	  customer A2 = new customer(null, null, null, null);
				        
	  customer B1 = new customer(null, null, null, null);
				        
	  customer B2 = new customer(null, null, null, null);
				        
	  customer C1 = new customer(null, null, null, null);
				        
	  customer C2 = new customer(null, null, null, null);
				        
	  customer D1 = new customer(null, null, null, null);
				        
	  customer D2 = new customer(null, null, null, null);
			        
	  customer E1 = new customer(null, null, null, null);
					        
	  customer E2 = new customer(null, null, null, null);
try{   
	do{
	System.out.println("1 = Flight#AC001 2 = Flight#AC002 3 = Flight#AC003");
         String Flight = bufRead.readLine();
         int choiceFlight =  Integer.parseInt(choiceFlight);
 
	    if(choiceFlight == 1)
         {		
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
           printSeating(A1,A2,B1,B2,C1,C2,D1,D2,E1,E2);;
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
    }while(choiceNumber != 6);
	    }
         }
	  
         if(choiceFlight == 2)
         {
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
          printSeating(A1,A2,B1,B2,C1,C2,D1,D2,E1,E2);;
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
    }while(choiceNumber2 != 6);   
         }
         if(choiceFlight == 3)
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
           printSeating(A1,A2,B1,B2,C1,C2,D1,D2,E1,E2);;
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
    }while(choiceNumber3 != 6);
	     }
}while(choiceFlight!=3);
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
	     InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
  
		    String choiceSeat;
		
		String input;
			int full = 0;
			while(full == 0)
			{
				
				try{
					
					System.out.println("Please enter a seat number to book the seat.");
					input = bufRead.readLine();
					if(input.equals("A1"))
				    {
						if(A1.firstName == null)
						{	
							System.out.println("In order to book this seat, please type in the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   A1.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   A1.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   A1.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   A1.phoneNumber = bufRead.readLine();   
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
							   
							  
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					
					else if(input.equals("A2"))
				    {
						if(A2.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   A2.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   A2.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   A2.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   A2.phoneNumber = bufRead.readLine();						   
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
							
						}
				    }
					else if(input.equals("B1"))
				    {
						if(B1.firstName == null)
						{
							System.out.println("In order to book this seat, please type in the customers, address and phone number.");
							
							System.out.println("First name:");
							   
							   B1.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   B1.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   B1.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   B1.phoneNumber = bufRead.readLine();
							  
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("B2"))
				    {
						if(B2.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   B2.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   B2.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   B2.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   B2.phoneNumber = bufRead.readLine();						  
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("C1"))
				    {
						if(C1.firstName == null)
						{
							System.out.println("In order to book this seat, please type in the customers, address and phone number.");
							
							System.out.println("First name:");
							   
							   C1.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   C1.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   C1.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   C1.phoneNumber = bufRead.readLine();						  
							  
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("C2"))
				    {
						if(C1.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   C2.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   C2.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   C2.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   C2.phoneNumber = bufRead.readLine();						   
							  
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("D1"))
				    {
						if(C1.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   D1.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   D1.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   D1.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   D1.phoneNumber = bufRead.readLine();
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("D2"))
				    {
						if(D2.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   D2.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   D2.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   D2.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   D2.phoneNumber = bufRead.readLine();
							  
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("E1"))
				    {
						if(E1.firstName == null)
						{
							System.out.println("In order to book this seat, please type the customers name, address and phone number.");
							
							System.out.println("First name:");
							   
							   E1.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   E1.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   E1.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   E1.phoneNumber = bufRead.readLine();
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					else if(input.equals("E2"))
				    {
						if(E2.firstName == null)
						{
							System.out.println("In order to book this seat, please type in the customers, address and phone number.");
							
							System.out.println("First name:");
							   
							   E2.firstName =bufRead.readLine();
									    
							   System.out.println("Last name:");
							   
							   E2.lastName = bufRead.readLine();
									    
							   System.out.println("Address:");
							   E2.address = bufRead.readLine();
 
							   System.out.println("Phone number:");
							   E2.phoneNumber = bufRead.readLine();
							   
							   System.out.println("Do you want to book another seat? Type 1 to continue booking.");
							   String continueBooking = bufRead.readLine();
							   
							   if(continueBooking == "1")
							   {
								   System.out.println("Next seat:");
							   }
							   else
							   {
								   System.out.println("Thanks for using the programme.");
								   full++;
							   }
						}
						
						else
						{
							System.out.println("The seat has been booked, please choose another seat.");
						}
				    }
					
					else
					{
						System.out.println("Please enter a valid number.");
					}
				}
				
				catch(NumberFormatException err) 
				{
					System.out.println("Error Converting Number");
			    } 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			    }
				
				
			}
			printSeating(A1,A2,B1,B2,C1,C2,D1,D2,E1,E2);
		}
			
				catch(NumberFormatException err) 
				{
					System.out.println("Error Converting Number");
			    }
							
			
		
	}

//If the seat is full, you need a way to allow the attendant to choose another seat
     /**
     * Cancel a reservation
     */

  public void Cancel(String[][] seats) { 
	//Revert all the seats that are taken back to null    (needed: able to go back after choosing a seat)
	    InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
	    System.out.println("Enter the seat that you wish to cancel:");
	     String cancelSeat = bufRead.readLine();
	    if(cancelSeat.equals("A1"))
	    {
		    if(seats[0][0] != null)
		    {
			seats[0][0] = null;
		       System.out.println("The seat is now available again!");	    
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
	    }
	    if(cancelSeat.equals("A2"))
	    {
		    if(seats[1][0] != null)
		    {
			seats[1][0] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
	    }     
		 if(cancelSeat.equals("B1"))
	    {
		    if(seats[0][1] != null)
		    {
			seats[0][1] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	     if(cancelSeat.equals("B2"))
	    {
		    if(seats[1][1] != null)
		    {
			seats[1][1] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	     if(cancelSeat.equals("C1"))
	    {
		    if(seats[0][2] != null)
		    {
			seats[0][2] = null;
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	     if(cancelSeat.equals("C2"))
	    {
		    if(seats[1][2] != null)
		    {
			seats[1][2] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	      if(cancelSeat.equals("D1"))
	    {
		    if(seats[0][3] != null)
		    {
			seats[0][3] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	      if(cancelSeat.equals("D2"))
	    {
		    if(seats[1][3] != null)
		    {
			seats[1][3] = null;
			    System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	        if(cancelSeat.equals("E1"))
	    {
		    if(seats[0][4] != null)
		    {
			seat[0][4] = null;
		   System.out.println("The seat is now available again!");	
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
		 }
	        if(cancelSeat.equals("E2"))
	    {
		    if(seats[1][4] != null)
		    {
			seats[1][4] = null;
			    System.out.println("The seat is now available again!");	
			    
		    }
		    else 
		    {
			System.out.println("This seat hasn't been reserved yet");
		    }
	 }
	    else
	    {
		System.out.println("This seat does not exsist.");
	    }
    }
            
	    /**
     * Cancel a Flight
     */
	    
	
		    
		    
		    
		    
		    
	    }
	/**
     * Flight Print out (Take off time)
     */
	public void FlightTakeoff(customer A1, customer A2, customer B1, customer B2, customer C1, customer C2, customer D1, customer D2, customer E1, customer E2){
		//Prints passengers seats and who has it
		System.out.println("The plane will now begin preparation in order to take off");
	        System.out.println("Passengers attending the flight:");
		System.out.println("Seat A1: " + A1 + " Information: " );
		System.out.println("Seat A2: " + A2 + " Information: " );
		System.out.println("Seat B1: " + B1 + " Information: " );
		System.out.println("Seat B2: " + B2 + " Information: " );
		System.out.println("Seat C1: " + C1 + " Information: " );
		System.out.println("Seat C2: " + C2 + " Information: " );
		System.out.println("Seat D1: " + D1 + " Information: "  );
		System.out.println("Seat D2: " + D2 + " Information: " );
		System.out.println("Seat E1: " + E1 + " Information: " );
		System.out.println("Seat E2: " + E2 + " Information: ");
		
		 System.out.println("Note: This is FINAL no tickets will able to be sold past this point");
		
	}

       /**
       * View the available seats for sale
       */
        public static void printSeating(customer A1, customer A2, customer B1, customer B2, customer C1, customer C2, customer D1, customer D2, customer E1, customer E2) {

		
		if(A1.firstName == null)
		{
			System.out.println("Seat A1 is avaliable.");
		}
		else
		{
			System.out.println("Seat A1 is not avaliable.");
		}
		
		if(A2.firstName == null)
		{
			System.out.println("Seat A2 is avaliable.");
		}
		else
		{
			System.out.println("Seat A2 is not avaliable.");
		}
		
		if(B1.firstName == null)
		{
			System.out.println("Seat B1 is avaliable.");
		}
		else
		{
			System.out.println("Seat B1 is not avaliable.");
		}
		
		if(B2.firstName == null)
		{
			System.out.println("Seat B2 is avaliable.");
		}
		else
		{
			System.out.println("Seat B2 is not avaliable.");
		}
		
		if(C1.firstName == null)
		{
			System.out.println("Seat C1 is avaliable.");
		}
		else
		{
			System.out.println("Seat C1 is not avaliable.");
		}
		
		if(C2.firstName == null)
		{
			System.out.println("Seat C2 is avaliable.");
		}
		else
		{
			System.out.println("Seat C2 is not avaliable.");
		}
		
		if(D1.firstName == null)
		{
			System.out.println("Seat D1 is avaliable.");
		}
		else
		{
			System.out.println("Seat D1 is not avaliable.");
		}
		
		if(D2.firstName == null)
		{
			System.out.println("Seat D2 is avaliable.");
		}
		else
		{
			System.out.println("Seat D2 is not avaliable.");
		}
		
		if(E1.firstName == null)
		{
			System.out.println("Seat E1 is avaliable.");
		}
		else
		{
			System.out.println("Seat E1 is not avaliable.");
		}
		
		if(E2.firstName == null)
		{
			System.out.println("Seat E2 is avaliable.");
		}
		else
		{
			System.out.println("Seat E2 is not avaliable.");
		}
    }
