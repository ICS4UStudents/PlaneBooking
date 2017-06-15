import java.io.*;
public class Plane{ 
  /*Plane's seats will resemble
   * | [A1] [B1] [C1] [D1] [E1] |
   * | [A2] [B2] [C2] [D2] [E2] |
   */
  public static void main(String[] args){
                          
  flight1 A1 = new flight1(null, null, null, null);
 
 	   flight1 A2 = new flight1(null, null, null, null);
 	            
 	   flight1 B1 = new flight1(null, null, null, null);
 	            
 	   flight1 B2 = new flight1(null, null, null, null);
 	            
 	   flight1 C1 = new flight1(null, null, null, null);
 	            
 	   flight1 C2 = new flight1(null, null, null, null);
 	            
 	   flight1 D1 = new flight1(null, null, null, null);
	            
 	   flight1 D2 = new flight1(null, null, null, null);
 	           
 	   flight1 E1 = new flight1(null, null, null, null);
 	             
 	   flight1 E2 = new flight1(null, null, null, null);
 	   
 
 	   flight2 A11 = new flight2(null, null, null, null);
 		 
 	   flight2 A22 = new flight2(null, null, null, null);
 	            
 	   flight2 B11 = new flight2(null, null, null, null);
 	            
 	   flight2 B22 = new flight2(null, null, null, null);
 	            
 	   flight2 C11 = new flight2(null, null, null, null);
 	            
 	   flight2 C22 = new flight2(null, null, null, null);
 	            
 	   flight2 D11 = new flight2(null, null, null, null);
 	            
 	   flight2 D22 = new flight2(null, null, null, null);
 	           
 	   flight2 E11 = new flight2(null, null, null, null);
 	             
 	   flight2 E22 = new flight2(null, null, null, null);
 	  
 	   
 	   flight3 A111 = new flight3(null, null, null, null);
 		 
 	   flight3 A222 = new flight3(null, null, null, null);
 	            
 	   flight3 B111 = new flight3(null, null, null, null);
 	            
	   flight3 B222 = new flight3(null, null, null, null);
 	            
 	   flight3 C111 = new flight3(null, null, null, null);
 	            
 	   flight3 C222 = new flight3(null, null, null, null);
 	            
 	   flight3 D111 = new flight3(null, null, null, null);
	            
 	   flight3 D222 = new flight3(null, null, null, null);
 	           
 	   flight3 E111 = new flight3(null, null, null, null);
 	             
 	   flight3 E222 = new flight3(null, null, null, null);
	  
	  printMenu();
	  InputStreamReader inStream = new InputStreamReader(System.in);
	  BufferedReader bufRead = new BufferedReader(inStream);
	  try
	  {
		  String enter = bufRead.readLine();
		  int enter1 = Integer.parseInt(enter);
		  if(enter==1)
		  {
 makeSeatReservation(flight1 A1, flight1 A2, flight1 B1, flight1 B2, flight1 C1, flight1 C2, flight1 D1, flight1 D2, flight1 E1, flight1 E2,flight2 A11, flight2 A22, flight2 B11, flight2 B22, flight2 C11, flight2 C22, flight2 D11, flight2 D22, flight2 E11, flight2 E22,flight3 A111, flight3 A222, flight3 B111, flight3 B222, flight3 C111, flight3 C222, flight3 D111, flight3 D222, flight3 E111, flight3 E222)
		  }
  
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
   public void makeSeatReservation(flight1 A1, flight1 A2, flight1 B1, flight1 B2, flight1 C1, flight1 C2, flight1 D1, flight1 D2, flight1 E1, flight1 E2,flight2 A11, flight2 A22, flight2 B11, flight2 B22, flight2 C11, flight2 C22, flight2 D11, flight2 D22, flight2 E11, flight2 E22,flight3 A111, flight3 A222, flight3 B111, flight3 B222, flight3 C111, flight3 C222, flight3 D111, flight3 D222, flight3 E111, flight3 E222) {
	      InputStreamReader inStream = new InputStreamReader(System.in);
	  BufferedReader bufRead = new BufferedReader(inStream);
	  
	  System.out.println("Please select which flight you want to choose.");
	  
	  try{
		  String enterType1 = bufRead.readLine();
		  int flightInput = Integer.parseInt(enterType1);
		  if(flightInput == 1)
		  {
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
		  
		  else if(flightInput == 2)
		  {
			  String input;
				int full = 0;
				
				while(full == 0)
				{
					
					try{
						
						System.out.println("Please enter a seat number to book the seat.");
						input = bufRead.readLine();
						if(input.equals("A1"))
					    {
							if(A11.firstName == null)
							{	
								System.out.println("In order to book this seat, please type in the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   A11.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   A11.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   A11.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   A11.phoneNumber = bufRead.readLine();   
								   
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
							if(A22.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   A22.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   A22.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   A22.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   A22.phoneNumber = bufRead.readLine();						   
								   
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
							if(B11.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   B11.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   B11.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   B11.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   B11.phoneNumber = bufRead.readLine();
								  
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
							if(B22.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   B22.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   B22.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   B22.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   B22.phoneNumber = bufRead.readLine();						  
								   
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
							if(C11.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   C11.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   C11.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   C11.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   C11.phoneNumber = bufRead.readLine();						  
								  
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
							if(C22.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   C22.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   C22.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   C22.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   C22.phoneNumber = bufRead.readLine();						   
								  
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
							if(D11.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   D11.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   D11.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   D11.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   D11.phoneNumber = bufRead.readLine();
								   
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
							if(D22.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   D22.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   D22.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   D22.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   D22.phoneNumber = bufRead.readLine();
								  
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
							if(E11.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   E11.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   E11.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   E11.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   E11.phoneNumber = bufRead.readLine();
								   
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
							if(E22.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   E22.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   E22.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   E22.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   E22.phoneNumber = bufRead.readLine();
								   
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

					
				}
				
			}	
		  
		  else if(flightInput == 3)
		  {
			  String input;
				int full = 0;
				
				while(full == 0)
				{
					
					try{
						
						System.out.println("Please enter a seat number to book the seat.");
						input = bufRead.readLine();
						if(input.equals("A1"))
					    {
							if(A111.firstName == null)
							{	
								System.out.println("In order to book this seat, please type in the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   A111.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   A111.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   A111.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   A111.phoneNumber = bufRead.readLine();   
								   
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
							if(A222.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   A222.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   A222.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   A222.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   A222.phoneNumber = bufRead.readLine();						   
								   
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
							if(B111.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   B111.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   B111.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   B111.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   B111.phoneNumber = bufRead.readLine();
								  
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
							if(B222.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   B222.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   B222.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   B222.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   B222.phoneNumber = bufRead.readLine();						  
								   
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
							if(C111.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   C111.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   C111.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   C111.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   C111.phoneNumber = bufRead.readLine();						  
								  
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
							if(C222.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   C222.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   C222.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   C222.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   C222.phoneNumber = bufRead.readLine();						   
								  
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
							if(D111.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   D111.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   D111.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   D111.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   D111.phoneNumber = bufRead.readLine();
								   
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
							if(D222.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   D222.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   D222.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   D222.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   D222.phoneNumber = bufRead.readLine();
								  
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
							if(E111.firstName == null)
							{
								System.out.println("In order to book this seat, please type the customers name, address and phone number.");
								
								System.out.println("First name:");
								   
								   E111.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   E111.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   E111.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   E111.phoneNumber = bufRead.readLine();
								   
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
							if(E222.firstName == null)
							{
								System.out.println("In order to book this seat, please type in the customers, address and phone number.");
								
								System.out.println("First name:");
								   
								   E222.firstName =bufRead.readLine();
										    
								   System.out.println("Last name:");
								   
								   E222.lastName = bufRead.readLine();
										    
								   System.out.println("Address:");
								   E222.address = bufRead.readLine();

								   System.out.println("Phone number:");
								   E222.phoneNumber = bufRead.readLine();
								   
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
		

//If the seat is full, you need a way to allow the attendant to choose another seat
     /**
     * Cancel a reservation
     */

   public void Cancel(flight1 A1, flight1 A2, flight1 B1, flight1 B2, flight1 C1, flight1 C2, flight1 D1, flight1 D2, flight1 E1, flight1 E2,flight2 A11, flight2 A22, flight2 B11, flight2 B22, flight2 C11, flight2 C22, flight2 D11, flight2 D22, flight2 E11, flight2 E22,flight3 A111, flight3 A222, flight3 B111, flight3 B222, flight3 C111, flight3 C222, flight3 D111, flight3 D222, flight3 E111, flight3 E222) throws IOException { 
		  //Revert all the seats that are taken back to null    (needed: able to go back after choosing a seat)
		      InputStreamReader inStream = new InputStreamReader(System.in);
		   BufferedReader bufRead = new BufferedReader(inStream);
		     System.out.println("Please select a flight to cancel the seat.");
		     String enterType = bufRead.readLine();
			 int flightInput = Integer.parseInt(enterType);
	
			 int full = 0;			 
			 while(full == 0)
		     {		    	 
				 if(flightInput == 1)			     
				 {			    
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
					   					          
								 System.out.println("You canceled the seat successfully.");
					          
								 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					          
								 String enterType1 = bufRead.readLine();
					          
								 int continueCanceling = Integer.parseInt(enterType);					
					   					            
								 if(continueCanceling == 1)					           
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
					   					    
								 System.out.println("You canceled the seat successfully.");			            
								 					    
								 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			            
					    									
								 String enterType1 = bufRead.readLine();			            
					    
								 int continueCanceling = Integer.parseInt(enterType);
						   			            					    		
								 if(continueCanceling == 1)			            
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
					    				    		  
								System.out.println("You canceled the seat successfully.");						   
					    		  
								System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");						  
					    		  
								System.out.println("You canceled the seat successfully.");				           
					    		  
								System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");				            
					    		  
								String enterType1 = bufRead.readLine();				           
					    		 
								int continueCanceling = Integer.parseInt(enterType);				
				   				            					    		 
								if(continueCanceling == 1)			            					    		  
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
					    	
								 B2.phoneNumber =  null;					  
					    	
								 System.out.println("You canceled the seat successfully.");			           
					    		
								 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			           
					    		
								 String enterType1 = bufRead.readLine();			            
					    	
								 int continueCanceling = Integer.parseInt(enterType);			
			   			          					    		
								 if(continueCanceling == 1)			           					    		
								 {				       					    		
									 System.out.println("Next seat:");			          					    		
								 }  			           
					    		
								 else			            					    		
								 {				        					    		
									 System.out.println("Thanks for using the programme.");				       					    		
									 full++;			          					    		
								 }			        					    	 
							 }					 
					    	 
							 System.out.println("This seat hasn't been reserved yet");					  					   					     
						 }					 		    				    	 
					 
						 if(cancelSeat.equals("C1"))					  
						 {					  			    		
							 if(C1.firstName != null)					  			    	
							 {								    		
								C1.firstName = null;												 			    		
								 
								C1.lastName = null;
									    			 
								C1.address = null;					
				    			
								C1.phoneNumber =  null;					   					
				    			
								System.out.println("You canceled the seat successfully.");			      
				    		
								System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
				      			    		
								String enterType1 = bufRead.readLine();			     
				    		
								int continueCanceling = Integer.parseInt(enterType);						   			        
				    			
								if(continueCanceling == 1)			        			    			
								{				     			    			
									System.out.println("Next seat:");			         			    			
								}  
				         			    			
								else			         			    			
								{				      			    			
									System.out.println("Thanks for using the programme.");				     			    			
									full++;			         			    		
								}			       										    		
							 }								    	 
						 }								    	
						 else 								    	
						 {								    	
							 System.out.println("This seat hasn't been reserved yet");					 
				    	 }		
						 
						 if(cancelSeat.equals("C2"))					  
				    	 {					  
				    		 if(C2.firstName != null)					 
				    		 {					  
				    			 C2.firstName = null;
							 
				    			 C2.lastName = null;
							
				    			 C2.address = null;
							 
				    			 C2.phoneNumber =  null;
							 
				    			 System.out.println("You canceled the seat successfully.");
					          
				    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					          
				    			 String enterType1 = bufRead.readLine();
					          
				    			 int continueCanceling = Integer.parseInt(enterType);			
					   			           
				    			 if(continueCanceling == 1)			           
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
							     
				    			 System.out.println("You canceled the seat successfully.");
						          
				    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						        
				    			 String enterType1 = bufRead.readLine();
						       
				    			 int continueCanceling = Integer.parseInt(enterType);								   
						          
				    			 if(continueCanceling == 1)				          
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
							 
				    			 System.out.println("You canceled the seat successfully.");
					          
				    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					          
				    			 String enterType1 = bufRead.readLine();
					          
				    			 int continueCanceling = Integer.parseInt(enterType);			
					   			          
				    			 if(continueCanceling == 1)			         
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
							
				    			 System.out.println("You canceled the seat successfully.");
					       
				    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					     
				    			 String enterType1 = bufRead.readLine();
					    
				    			 int continueCanceling = Integer.parseInt(enterType);			
					   			           
				    			 if(continueCanceling == 1)			       
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
							 
				    			 System.out.println("You canceled the seat successfully.");		         
							 
				    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					         
				    			 String enterType1 = bufRead.readLine();
					        
				    			 int continueCanceling = Integer.parseInt(enterType);			
					   			        
				    			 if(continueCanceling == 1)			        
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
				    			 System.out.println("This seat hasn't been reserved yet");					
				    		 }				
				    	 }
						
				    	 else				
				    	 {				
				    		 System.out.println("This seat does not exsist.");				
				    	 }				
					 
				 }
				 
				 
					 else if(flightInput == 2)			     
					 {			    
						 try{					   			    	
							 System.out.println("Enter the seat that you wish to cancel:");					      			    		
							 String cancelSeat = bufRead.readLine();					  
							 
							 if(cancelSeat.equals("A1"))					   
							 {					       
								 if(A11.firstName != null)					        
								 {					         
									 A11.firstName = null;
						         
									 A11.lastName = null;
						         
									 A11.address = null;
						        
									 A11.phoneNumber =  null;	      
						   					          
									 System.out.println("You canceled the seat successfully.");
						          
									 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						          
									 String enterType1 = bufRead.readLine();
						          
									 int continueCanceling = Integer.parseInt(enterType);					
						   					            
									 if(continueCanceling == 1)					           
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
									 System.out.println("This seat hasn't been reserved yet");
						         }					     
							 }					     
							 
							 if(cancelSeat.equals("A2"))					    
							 {					    	
								 if(A22.firstName != null)					    	
								 {					         					    
									 A22.firstName = null;					   					    
														
									 A22.lastName = null;						   					    
									 
									 A22.address = null;					   					    
									 
									 A22.phoneNumber =  null;
						   					    
									 System.out.println("You canceled the seat successfully.");			            
									 					    
									 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			            
						    									
									 String enterType1 = bufRead.readLine();			            
						    
									 int continueCanceling = Integer.parseInt(enterType);
							   			            					    		
									 if(continueCanceling == 1)			            
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
									 System.out.println("This seat hasn't been reserved yet");					      					    	  
								 }					     					      
							 }     
						   					      
							 if(cancelSeat.equals("B1"))					   
							 {					      					    	  
								 if(B11.firstName != null)					    	  
								 {					    					    		  
									B11.firstName = null;					  					    		  
									
									B11.lastName = null;
									
									B11.address = null;
						    													    		  
									B11.phoneNumber =  null;					    
						    				    		  
									System.out.println("You canceled the seat successfully.");						   
						    		  
									System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");						  
						    		  
									System.out.println("You canceled the seat successfully.");				           
						    		  
									System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");				            
						    		  
									String enterType1 = bufRead.readLine();				           
						    		 
									int continueCanceling = Integer.parseInt(enterType);				
					   				            					    		 
									if(continueCanceling == 1)			            					    		  
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
									 System.out.println("This seat hasn't been reserved yet");					     					    	 
								 }					   					     
							 }					     
						     
							 if(cancelSeat.equals("B2"))					    					     
							 {					     					    	 
								 if(B22.firstName != null)					      					    	
								 {					   					    	
									 B22.firstName = null;					   
						    	
									 B22.lastName = null;					  
						    	
									 B22.address = null;					  
						    	
									 B22.phoneNumber =  null;					  
						    	
									 System.out.println("You canceled the seat successfully.");			           
						    		
									 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			           
						    		
									 String enterType1 = bufRead.readLine();			            
						    	
									 int continueCanceling = Integer.parseInt(enterType);			
				   			          					    		
									 if(continueCanceling == 1)			           					    		
									 {				       					    		
										 System.out.println("Next seat:");			          					    		
									 }  			           
						    		
									 else			            					    		
									 {				        					    		
										 System.out.println("Thanks for using the programme.");				       					    		
										 full++;			          					    		
									 }			        					    	 
								 }					 
						    	 
								 System.out.println("This seat hasn't been reserved yet");					  					   					     
							 }					 		    				    	 
						 
							 if(cancelSeat.equals("C1"))					  
							 {					  			    		
								 if(C11.firstName != null)					  			    	
								 {								    		
									C11.firstName = null;												 			    		
									 
									C11.lastName = null;
										    			 
									C11.address = null;					
					    			
									C11.phoneNumber =  null;					   					
					    			
									System.out.println("You canceled the seat successfully.");			      
					    		
									System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
					      			    		
									String enterType1 = bufRead.readLine();			     
					    		
									int continueCanceling = Integer.parseInt(enterType);						   			        
					    			
									if(continueCanceling == 1)			        			    			
									{				     			    			
										System.out.println("Next seat:");			         			    			
									}  
					         			    			
									else			         			    			
									{				      			    			
										System.out.println("Thanks for using the programme.");				     			    			
										full++;			         			    		
									}			       										    		
								 }								    	 
							 }								    	
							 else 								    	
							 {								    	
								 System.out.println("This seat hasn't been reserved yet");					 
					    	 }		
							 
							 if(cancelSeat.equals("C2"))					  
					    	 {					  
					    		 if(C22.firstName != null)					 
					    		 {					  
					    			 C22.firstName = null;
								 
					    			 C22.lastName = null;
								
					    			 C22.address = null;
								 
					    			 C22.phoneNumber =  null;
								 
					    			 System.out.println("You canceled the seat successfully.");
						          
					    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						          
					    			 String enterType1 = bufRead.readLine();
						          
					    			 int continueCanceling = Integer.parseInt(enterType);			
						   			           
					    			 if(continueCanceling == 1)			           
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
					    			 System.out.println("This seat hasn't been reserved yet");				
					    		 }					   
					    	 }
								    
					    	 if(cancelSeat.equals("D1"))					    
					    	 {					    
					    		 if(D11.firstName != null)					     
					    		 {					    
					    			 D11.firstName = null;
								    
					    			 D11.lastName = null;
								    
					    			 D11.address = null;
								    
					    			 D11.phoneNumber =  null;
								     
					    			 System.out.println("You canceled the seat successfully.");
							          
					    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							        
					    			 String enterType1 = bufRead.readLine();
							       
					    			 int continueCanceling = Integer.parseInt(enterType);								   
							          
					    			 if(continueCanceling == 1)				          
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
					    			 System.out.println("This seat hasn't been reserved yet");					  
					    		 }					 
					    	 }
								
					    	 if(cancelSeat.equals("D2"))					 
					    	 {					 
					    		 if(D22.firstName != null)					
					    		 {					
					    			 D22.firstName = null;
								 
					    			 D22.lastName = null;
								 
					    			 D22.address = null;
								 
					    			 D22.phoneNumber =  null;
								 
					    			 System.out.println("You canceled the seat successfully.");
						          
					    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						          
					    			 String enterType1 = bufRead.readLine();
						          
					    			 int continueCanceling = Integer.parseInt(enterType);			
						   			          
					    			 if(continueCanceling == 1)			         
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
					    			 System.out.println("This seat hasn't been reserved yet");				
					    		 }				
					    	 }
								
					    	 if(cancelSeat.equals("E1"))				
					    	 {				
					    		 if(E11.firstName != null)				
					    		 {				
					    			 E11.firstName = null;
							
					    			 E11.lastName = null;
							
					    			 E11.address = null;
												 
					    			 E11.phoneNumber =  null;					 
								
					    			 System.out.println("You canceled the seat successfully.");
						       
					    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						     
					    			 String enterType1 = bufRead.readLine();
						    
					    			 int continueCanceling = Integer.parseInt(enterType);			
						   			           
					    			 if(continueCanceling == 1)			       
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
					    			 System.out.println("This seat hasn't been reserved yet");						    		
					    		 }					
					    	 }
							
					    	 if(cancelSeat.equals("E2"))					    
					    	 {					 		    		
					    		 if(E22.firstName != null)					
					    		 {					
					    			 E22.firstName = null;
								
					    			 E22.lastName = null;
								
					    			 E22.address = null;
								
					    			 E22.phoneNumber =  null;					
								 
					    			 System.out.println("You canceled the seat successfully.");		         
								 
					    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						         
					    			 String enterType1 = bufRead.readLine();
						        
					    			 int continueCanceling = Integer.parseInt(enterType);			
						   			        
					    			 if(continueCanceling == 1)			        
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
					    			 System.out.println("This seat hasn't been reserved yet");					
					    		 }				
					    	 }
							
					    	 else				
					    	 {				
					    		 System.out.println("This seat does not exsist.");				
					    	 }				
					       
					 }
					 
				 
						 else if(flightInput == 3)			     
						 {			    
							 try{					   			    	
								 System.out.println("Enter the seat that you wish to cancel:");					      			    		
								 String cancelSeat = bufRead.readLine();					  
								 
								 if(cancelSeat.equals("A1"))					   
								 {					       
									 if(A111.firstName != null)					        
									 {					         
										 A111.firstName = null;
							         
										 A111.lastName = null;
							         
										 A111.address = null;
							        
										 A111.phoneNumber =  null;	      
							   					          
										 System.out.println("You canceled the seat successfully.");
							          
										 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							          
										 String enterType1 = bufRead.readLine();
							          
										 int continueCanceling = Integer.parseInt(enterType);					
							   					            
										 if(continueCanceling == 1)					           
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
										 System.out.println("This seat hasn't been reserved yet");
							         }					     
								 }					     
								 
								 if(cancelSeat.equals("A2"))					    
								 {					    	
									 if(A222.firstName != null)					    	
									 {					         					    
										 A222.firstName = null;					   					    
															
										 A222.lastName = null;						   					    
										 
										 A222.address = null;					   					    
										 
										 A222.phoneNumber =  null;
							   					    
										 System.out.println("You canceled the seat successfully.");			            
										 					    
										 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			            
							    									
										 String enterType1 = bufRead.readLine();			            
							    
										 int continueCanceling = Integer.parseInt(enterType);
								   			            					    		
										 if(continueCanceling == 1)			            
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
										 System.out.println("This seat hasn't been reserved yet");					      					    	  
									 }					     					      
								 }     
							   					      
								 if(cancelSeat.equals("B1"))					   
								 {					      					    	  
									 if(B111.firstName != null)					    	  
									 {					    					    		  
										B111.firstName = null;					  					    		  
										
										B111.lastName = null;
										
										B111.address = null;
							    													    		  
										B111.phoneNumber =  null;					    
							    				    		  
										System.out.println("You canceled the seat successfully.");						   
							    		  
										System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");						  
							    		  
										System.out.println("You canceled the seat successfully.");				           
							    		  
										System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");				            
							    		  
										String enterType1 = bufRead.readLine();				           
							    		 
										int continueCanceling = Integer.parseInt(enterType);				
						   				            					    		 
										if(continueCanceling == 1)			            					    		  
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
										 System.out.println("This seat hasn't been reserved yet");					     					    	 
									 }					   					     
								 }					     
							     
								 if(cancelSeat.equals("B2"))					    					     
								 {					     					    	 
									 if(B222.firstName != null)					      					    	
									 {					   					    	
										 B222.firstName = null;					   
							    	
										 B222.lastName = null;					  
							    	
										 B222.address = null;					  
							    	
										 B222.phoneNumber =  null;					  
							    	
										 System.out.println("You canceled the seat successfully.");			           
							    		
										 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");			           
							    		
										 String enterType1 = bufRead.readLine();			            
							    	
										 int continueCanceling = Integer.parseInt(enterType);			
					   			          					    		
										 if(continueCanceling == 1)			           					    		
										 {				       					    		
											 System.out.println("Next seat:");			          					    		
										 }  			           
							    		
										 else			            					    		
										 {				        					    		
											 System.out.println("Thanks for using the programme.");				       					    		
											 full++;			          					    		
										 }			        					    	 
									 }					 
							    	 
									 System.out.println("This seat hasn't been reserved yet");					  					   					     
								 }					 		    				    	 
							 
								 if(cancelSeat.equals("C1"))					  
								 {					  			    		
									 if(C111.firstName != null)					  			    	
									 {								    		
										C111.firstName = null;												 			    		
										 
										C111.lastName = null;
											    			 
										C111.address = null;					
						    			
										C111.phoneNumber =  null;					   					
						    			
										System.out.println("You canceled the seat successfully.");			      
						    		
										System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
						      			    		
										String enterType1 = bufRead.readLine();			     
						    		
										int continueCanceling = Integer.parseInt(enterType);						   			        
						    			
										if(continueCanceling == 1)			        			    			
										{				     			    			
											System.out.println("Next seat:");			         			    			
										}  
						         			    			
										else			         			    			
										{				      			    			
											System.out.println("Thanks for using the programme.");				     			    			
											full++;			         			    		
										}			       										    		
									 }								    	 
								 }								    	
								 else 								    	
								 {								    	
									 System.out.println("This seat hasn't been reserved yet");					 
						    	 }		
								 
								 if(cancelSeat.equals("C2"))					  
						    	 {					  
						    		 if(C222.firstName != null)					 
						    		 {					  
						    			 C222.firstName = null;
									 
						    			 C222.lastName = null;
									
						    			 C222.address = null;
									 
						    			 C222.phoneNumber =  null;
									 
						    			 System.out.println("You canceled the seat successfully.");
							          
						    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							          
						    			 String enterType1 = bufRead.readLine();
							          
						    			 int continueCanceling = Integer.parseInt(enterType);			
							   			           
						    			 if(continueCanceling == 1)			           
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
						    			 System.out.println("This seat hasn't been reserved yet");				
						    		 }					   
						    	 }
									    
						    	 if(cancelSeat.equals("D1"))					    
						    	 {					    
						    		 if(D111.firstName != null)					     
						    		 {					    
						    			 D111.firstName = null;
									    
						    			 D111.lastName = null;
									    
						    			 D111.address = null;
									    
						    			 D111.phoneNumber =  null;
									     
						    			 System.out.println("You canceled the seat successfully.");
								          
						    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
								        
						    			 String enterType1 = bufRead.readLine();
								       
						    			 int continueCanceling = Integer.parseInt(enterType);								   
								          
						    			 if(continueCanceling == 1)				          
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
						    			 System.out.println("This seat hasn't been reserved yet");					  
						    		 }					 
						    	 }
									
						    	 if(cancelSeat.equals("D2"))					 
						    	 {					 
						    		 if(D222.firstName != null)					
						    		 {					
						    			 D222.firstName = null;
									 
						    			 D222.lastName = null;
									 
						    			 D222.address = null;
									 
						    			 D222.phoneNumber =  null;
									 
						    			 System.out.println("You canceled the seat successfully.");
							          
						    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							          
						    			 String enterType1 = bufRead.readLine();
							          
						    			 int continueCanceling = Integer.parseInt(enterType);			
							   			          
						    			 if(continueCanceling == 1)			         
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
						    			 System.out.println("This seat hasn't been reserved yet");				
						    		 }				
						    	 }
									
						    	 if(cancelSeat.equals("E1"))				
						    	 {				
						    		 if(E111.firstName != null)				
						    		 {				
						    			 E111.firstName = null;
								
						    			 E111.lastName = null;
								
						    			 E111.address = null;
													 
						    			 E111.phoneNumber =  null;					 
									
						    			 System.out.println("You canceled the seat successfully.");
							       
						    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							     
						    			 String enterType1 = bufRead.readLine();
							    
						    			 int continueCanceling = Integer.parseInt(enterType);			
							   			           
						    			 if(continueCanceling == 1)			       
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
						    			 System.out.println("This seat hasn't been reserved yet");						    		
						    		 }					
						    	 }
								
						    	 if(cancelSeat.equals("E2"))					    
						    	 {					 		    		
						    		 if(E222.firstName != null)					
						    		 {					
						    			 E222.firstName = null;
									
						    			 E222.lastName = null;
									
						    			 E222.address = null;
									
						    			 E222.phoneNumber =  null;					
									 
						    			 System.out.println("You canceled the seat successfully.");		         
									 
						    			 System.out.println("Do you want to cancel another seat? Type 1 to continue canceling.");
							         
						    			 String enterType1 = bufRead.readLine();
							        
						    			 int continueCanceling = Integer.parseInt(enterType);			
							   			        
						    			 if(continueCanceling == 1)			        
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
		     }
	  }
     /**
     * Cancel a Flight
     */
     
 
      
      
      
      
      
 /**
     * Flight Print out (Take off time)
     */
 public void FlightTakeoff(flight1 A1, flight1 A2, flight1 B1, flight1 B2, flight1 C1, flight1 C2, flight1 D1, flight1 D2, flight1 E1, flight1 E2,flight2 A11, flight2 A22, flight2 B11, flight2 B22, flight2 C11, flight2 C22, flight2 D11, flight2 D22, flight2 E11, flight2 E22,flight3 A111, flight3 A222, flight3 B111, flight3 B222, flight3 C111, flight3 C222, flight3 D111, flight3 D222, flight3 E111, flight3 E222){
  //Prints passengers seats and who has it
    InputStreamReader inStream = new InputStreamReader(System.in);
   BufferedReader bufRead = new BufferedReader(inStream);
System.out.println("Which flight is taking off?");
   try{
   String takeoff = bufRead.readLine();
  int chooseTakeoff = Integer.parseInt(takeoff);
  if(chooseTakeoff==1){
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
  
  System.out.println("Note: This is FINAL no tickets will able to be sold past this point");}
  if(chooseTakeoff == 2)
  {
     System.out.println("The plane will now begin preparation in order to take off");
         System.out.println("Passengers attending the flight:");
  System.out.println("Seat A11: " + A11 + " Information: " + A11.firstName + A11.lastName + A11.address + A11.phoneNumber);
  System.out.println("Seat A22: " + A22 + " Information: " + A22.firstName + A22.lastName + A22.address + A22.phoneNumber);
  System.out.println("Seat B11: " + B11 + " Information: " + B11.firstName + B11.lastName + B11.address + B11.phoneNumber);
  System.out.println("Seat B22: " + B22 + " Information: " + B22.firstName + B22.lastName + B22.address + B22.phoneNumber);
  System.out.println("Seat C11: " + C11 + " Information: " + C11.firstName + C11.lastName + C11.address + C11.phoneNumber);
  System.out.println("Seat C22: " + C22 + " Information: " + C22.firstName + C22.lastName + C22.address + C22.phoneNumber);
  System.out.println("Seat D11: " + D11 + " Information: " + D11.firstName + D11.lastName + D11.address + D11.phoneNumber);
  System.out.println("Seat D22: " + D22 + " Information: " + D22.firstName + D22.lastName + D22.address + D22.phoneNumber);
  System.out.println("Seat E11: " + E11 + " Information: " + E11.firstName + E11.lastName + E11.address + E11.phoneNumber);
  System.out.println("Seat E22: " + E22 + " Information: " + E22.firstName + E22.lastName + E22.address + E22.phoneNumber);
  
  System.out.println("Note: This is FINAL no tickets will able to be sold past this point");}
   if(chooseTakeoff == 3)
   {
      System.out.println("The plane will now begin preparation in order to take off");
         System.out.println("Passengers attending the flight:");
  System.out.println("Seat A111: " + A111 + " Information: " + A111.firstName + A111.lastName + A111.address + A111.phoneNumber);
  System.out.println("Seat A222: " + A222 + " Information: " + A222.firstName + A222.lastName + A222.address + A222.phoneNumber);
  System.out.println("Seat B111: " + B111 + " Information: " + B111.firstName + B111.lastName + B111.address + B111.phoneNumber);
  System.out.println("Seat B222: " + B222 + " Information: " + B222.firstName + B222.lastName + B222.address + B222.phoneNumber);
  System.out.println("Seat C111: " + C111 + " Information: " + C111.firstName + C111.lastName + C111.address + C111.phoneNumber);
  System.out.println("Seat C222: " + C222 + " Information: " + C222.firstName + C222.lastName + C222.address + C222.phoneNumber);
  System.out.println("Seat D111: " + D111 + " Information: " + D111.firstName + D111.lastName + D111.address + D111.phoneNumber);
  System.out.println("Seat D222: " + D222 + " Information: " + D222.firstName + D222.lastName + D222.address + D222.phoneNumber);
  System.out.println("Seat E111: " + E111 + " Information: " + E111.firstName + E111.lastName + E111.address + E111.phoneNumber);
  System.out.println("Seat E222: " + E222 + " Information: " + E222.firstName + E222.lastName + E222.address + E222.phoneNumber);
  
  System.out.println("Note: This is FINAL no tickets will able to be sold past this point");}
   }
else{
  System.out.println("Invalid flight.");
}
       catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
       }
}
       /**
       * View the available seats for sale
       */
        public static void printSeating(flight1 A1, flight1 A2, flight1 B1, flight1 B2, flight1 C1, flight1 C2, flight1 D1, flight1 D2, flight1 E1, flight1 E2,flight2 A11, flight2 A22, flight2 B11, flight2 B22, flight2 C11, flight2 C22, flight2 D11, flight2 D22, flight2 E11, flight2 E22,flight3 A111, flight3 A222, flight3 B111, flight3 B222, flight3 C111, flight3 C222, flight3 D111, flight3 D222, flight3 E111, flight3 E222) {
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
   
  if(A11.firstName == null)
  {
   System.out.println("Seat A11 is avaliable.");
  }
  else
  {
   System.out.println("Seat A11 is not avaliable.");
  }
  
  if(A22.firstName == null)
  {
   System.out.println("Seat A22 is avaliable.");
  }
  else
  {
   System.out.println("Seat A22 is not avaliable.");
  }
  
  if(B11.firstName == null)
  {
   System.out.println("Seat B11 is avaliable.");
  }
  else
  {
   System.out.println("Seat B11 is not avaliable.");
  }
  
  if(B22.firstName == null)
  {
   System.out.println("Seat B22 is avaliable.");
  }
  else
  {
   System.out.println("Seat B22 is not avaliable.");
  }
  
  if(C11.firstName == null)
  {
   System.out.println("Seat C11 is avaliable.");
  }
  else
  {
   System.out.println("Seat C11 is not avaliable.");
  }
  
  if(C22.firstName == null)
  {
   System.out.println("Seat C22 is avaliable.");
  }
  else
  {
   System.out.println("Seat C22 is not avaliable.");
  }
  
  if(D11.firstName == null)
  {
   System.out.println("Seat D11 is avaliable.");
  }
  else
  {
   System.out.println("Seat D11 is not avaliable.");
  }
  
  if(D22.firstName == null)
  {
   System.out.println("Seat D22 is avaliable.");
  }
  else
  {
   System.out.println("Seat D22 is not avaliable.");
  }
  
  if(E11.firstName == null)
  {
   System.out.println("Seat E11 is avaliable.");
  }
  else
  {
   System.out.println("Seat E11 is not avaliable.");
  }
  
  if(E22.firstName == null)
  {
   System.out.println("Seat E22 is avaliable.");
  }
  else
  {
   System.out.println("Seat E22 is not avaliable.");
  }
    
  if(A111.firstName == null)
  {
   System.out.println("Seat A111 is avaliable.");
  }
  else
  {
   System.out.println("Seat A111 is not avaliable.");
  }
  
  if(A222.firstName == null)
  {
   System.out.println("Seat A222 is avaliable.");
  }
  else
  {
   System.out.println("Seat A222 is not avaliable.");
  }
  
  if(B111.firstName == null)
  {
   System.out.println("Seat B111 is avaliable.");
  }
  else
  {
   System.out.println("Seat B111 is not avaliable.");
  }
  
  if(B222.firstName == null)
  {
   System.out.println("Seat B222 is avaliable.");
  }
  else
  {
   System.out.println("Seat B222 is not avaliable.");
  }
  
  if(C111.firstName == null)
  {
   System.out.println("Seat C111 is avaliable.");
  }
  else
  {
   System.out.println("Seat C111 is not avaliable.");
  }
  
  if(C222.firstName == null)
  {
   System.out.println("Seat C222 is avaliable.");
  }
  else
  {
   System.out.println("Seat C222 is not avaliable.");
  }
  
  if(D111.firstName == null)
  {
   System.out.println("Seat D111 is avaliable.");
  }
  else
  {
   System.out.println("Seat D111 is not avaliable.");
  }
  
  if(D222.firstName == null)
  {
   System.out.println("Seat D222 is avaliable.");
  }
  else
  {
   System.out.println("Seat D222 is not avaliable.");
  }
  
  if(E111.firstName == null)
  {
   System.out.println("Seat E111 is avaliable.");
  }
  else
  {
   System.out.println("Seat E111 is not avaliable.");
  }
  
  if(E222.firstName == null)
  {
   System.out.println("Seat E222 is avaliable.");
  }
  else
  {
   System.out.println("Seat E222 is not avaliable.");
  }

}

