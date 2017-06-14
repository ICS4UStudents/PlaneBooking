import java.io.*;
public class Plane{ 
  /*Plane's seats will resemble
   * | [A1] [B1] [C1] [D1] [E1] |
   * | [A2] [B2] [C2] [D2] [E2] |
   */
  public static void main(String[] args){
                          
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
  
  }
       /**
     * Menu
     */
      
  public void printMenu()
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
  public void makeSeatReservation(customer A1, customer A2, customer B1, customer B2, customer C1, customer C2, customer D1, customer D2, customer E1, customer E2) {
      InputStreamReader inStream = new InputStreamReader(System.in);
  BufferedReader bufRead = new BufferedReader(inStream);
  
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
							   String enterType = bufRead.readLine();
							   int continueBooking = Integer.parseInt(enterType);
							
							   
							   if(continueBooking == 1)
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
				printSeating(A1,A2,B1,B2,C1,C2,D1,D2,E1,E2);
				
			}
			
		}				
		
	}

//If the seat is full, you need a way to allow the attendant to choose another seat
     /**
     * Cancel a reservation
     */

  public void Cancel(customer A1, customer A2, customer B1, customer B2, customer C1, customer C2, customer D1, customer D2, customer E1, customer E2) { 
 //Revert all the seats that are taken back to null    (needed: able to go back after choosing a seat)
     InputStreamReader inStream = new InputStreamReader(System.in);
  BufferedReader bufRead = new BufferedReader(inStream);
    try{
     System.out.println("Enter the seat that you wish to cancel:");
      String cancelSeat = bufRead.readLine();
     if(cancelSeat.equals("A1"))
     {
      if(A1.firstName != null)
      {
  A1.firstName = null;
  A1.lastName = null;
  A1.address = null;
  A1.phoneNumber =  null;	      
         System.out.println("The seat is now available again!");  
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
         
      }
     }
     if(cancelSeat.equals("A2"))
     {
      if(A2.firstName != null)
      {
  A2.firstName = null;
  A2.lastName = null;	
  A2.address = null;
  A2.phoneNumber =  null;
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
     }     
   if(cancelSeat.equals("B1"))
     {
      if(B1.firstName != null)
      {
   B1.firstName = null;
   B1.lastName = null;
   B1.address = null;
   B1.phoneNumber =  null;
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
      if(cancelSeat.equals("B2"))
     {
      if(B2.firstName != null)
      {
   B2.firstName = null;
   B2.lastName = null;
  B2.address = null;
  B2.phoneNumber =  null
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
      if(cancelSeat.equals("C1"))
     {
      if(C1.firstName != null)
      {
   C1.firstName = null;
  C1.lastName = null;
  C1.address = null;
  C1.phoneNumber =  null;
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
      if(cancelSeat.equals("C2"))
     {
      if(C2.firstName != null)
      {
  C2.firstName = null;
  C2.lastName = null;
  C2.address = null;
  C2.phoneNumber =  null;
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
       if(cancelSeat.equals("D1"))
     {
      if(D1.firstName != null)
      {
     D1.firstName = null;
     D1.lastName = null;
     D1.address = null;
     D1.phoneNumber =  null;
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
       if(cancelSeat.equals("D2"))
     {
      if(D2.firstName != null)
      {
   D2.firstName = null;
   D2.lastName = null;
   D2.address = null;
   D2.phoneNumber =  null;
       System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
         if(cancelSeat.equals("E1"))
     {
      if(E1.firstName != null)
      {
   E1.firstName = null;
   E1.lastName = null;
   E1.address = null;
   E1.phoneNumber =  null;
     System.out.println("The seat is now available again!"); 
      }
      else 
      {
   System.out.println("This seat hasn't been reserved yet");
      }
   }
         if(cancelSeat.equals("E2"))
     {
      if(E2.firstName != null)
      {
   E2.firstName = null;
  E2.lastName = null;
  E2.address = null;
  E2.phoneNumber =  null;
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
    catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
       }
  }
     /**
     * Cancel a Flight
     */
     
 
      
      
      
      
      
 /**
     * Flight Print out (Take off time)
     */
  public void FlightTakeoff(customer A1, customer A2, customer B1, customer B2, customer C1, customer C2, customer D1, customer D2, customer E1, customer E2){
  //Prints passengers seats and who has it
  System.out.println("The plane will now begin preparation in order to take off");
         System.out.println("Passengers attending the flight:");
  System.out.println("Seat A1: " + A1 + " Information: " + A1.firstName + A1.lastName + A1.address + A1.phoneNumber);
  System.out.println("Seat A2: " + A2 + " Information: " + A2.firstName + A2.lastName + A2.address + A2.phoneNumber);
  System.out.println("Seat B1: " + B1 + " Information: " + B1.firstName + B1.lastName + B1.address + B1.phoneNumber);
  System.out.println("Seat B2: " + B2 + " Information: " + B2.firstName + B2.lastName + B2.address + B2.phoneNumber);
  System.out.println("Seat C1: " + C1 + " Information: " + C1.firstName + C1.lastName + C1.address + C1.phoneNumber);
  System.out.println("Seat C2: " + C2 + " Information: " + C2.firstName + C2.lastName + C2.address + C2.phoneNumber);
  System.out.println("Seat D1: " + D1 + " Information: " + D1.firstName + D1.lastName + D1.address + D1.phoneNumber);
  System.out.println("Seat D2: " + D2 + " Information: " + D2.firstName + D2.lastName + D2.address + D2.phoneNumber);
  System.out.println("Seat E1: " + E1 + " Information: " + E1.firstName + E1.lastName + E1.address + E1.phoneNumber);
  System.out.println("Seat E2: " + E2 + " Information: " + E2.firstName + E2.lastName + E2.address + E2.phoneNumber);
  
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
}

