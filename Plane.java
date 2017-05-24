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
    //OPTION NEEDED TO ALLOW THE FLIGHT ATTENDANT TO CHOOSE BEWTEEN FLIGHTS!
	        InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
	     do {                          //Loop needed 
         System.out.println("1 = Flight#AC006 2 = Flight#AC023 3 = Flight#AC064");
         String Flight = bufRead.readLine();
         int choiceFlight =  Integer.parseInt(choiceFlight);
             } while(choiceFlight 
	//Next class -- add loops to allow flights a,b,c to lead to print menu();
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
          
          System.exit(0);
        }
        else
        {
          System.out.println("Invalid number, please type again.")
        }
    }while(choiceNumber != 5)
    
      
  */  }
  public void printMenu();
  {
 System.out.println(" Booking Menu "); 
 System.out.println("                ");
 System.out.println("Please press the corresponding numbers to perform a specific action");
 System.out.println("1. Make a reservation");
 System.out.println("2. Cancel a reserved seat");
 System.out.println("3. View the current availabe/reserved seats remaining");
 System.out.println("4. Cancel the flight");
 System.out.println("5. Quit"); //More options can be added
  }
  /**
     * Make a reservation
     */
    public void makeSeatReservation(String[][] seats) {
          // Enter Yi's code for reserving a seat ++  *(SeatIndex is not a actually variable)
        if (seatsIndex == seats.length) {
            System.out.println("All seats are full. Sorry, for the inconvenience...");
        } else {
		    int full = 0;
		while(full == 0){
			try {
				choiceSeat = bufRead.readLine();
				if(choiceSeat.equals("A1"))
			    {
					if(seats[0][0] == null)
					{	
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						  double phoneNumber = Double.parseDouble(phoneNumberString);
						   
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				
				if(choiceSeat.equals("A2"))
			    {
					if(seats[1][0] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("B1"))
			    {
					if(seats[0][1] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("B2"))
			    {
					if(seats[1][1] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("C1"))
			    {
					if(seats[0][2] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("C2"))
			    {
					if(seats[1][2] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("D1"))
			    {
					if(seats[0][3] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("D2"))
			    {
					if(seats[1][3] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("E1"))
			    {
					if(seats[0][4] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
				if(choiceSeat.equals("E2"))
			    {
					if(seats[1][4] == null)
					{
						System.out.println("In order to book this seat, please typy in your name, address and phone number.");
						
						System.out.println("First name:");
						   
						   String firstName =bufRead.readLine();
								    
						   System.out.println("Last name:");
						   
						   String lastName = bufRead.readLine();
								    
						   System.out.println("Address:");
						   String userAddress = bufRead.readLine();

						   System.out.println("Phone number:");
						   String phoneNumberString = bufRead.readLine();
						   double phoneNumber = Double.parseDouble(phoneNumberString);
						   full++;
					}
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    }
			
					
					else
					{
						System.out.println("The seat has been booked, please choose anthor seat.");
					}
			    
				
			
			
		}
		
			
			
				
		    
			
		
		    
				
			catch(IOException e){
				 System.out.println("Error Reading from File");
				 }
				 catch(NumberFormatException err) {
				 System.out.println("Error Converting Number");
				 }
		}
	}
}
     /**
     * Cancel a reservation
     */

    int getCancel() { //THIS METHOD ISNT COMPLETED!!! THIS IS JUST HOW THE METHOD WILL FUNCTION
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
	    int getFlightCancel(){
		    //Mikes beginning code 
		    
		    
		    
		    
		    
	    }
    }
  }
