import java.io.*;
public class Plane{ 
  public int FULL_PLANE = 10; //Maximum seats
  String[][] seats = new String[2][5];
  /*Plane's seats will resemble
   * | [A1] [B1] [C1] [D1] [E1] |
   * | [A2] [B2] [C2] [D2] [E2] |
   */
  public static void main(String[] args){
    //OPTION NEEDED TO ALLOW THE FLIGHT ATTENDANT TO CHOOSE BEWTEEN FLIGHTS!
    InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(inStream);
    
    do{
        printMenu();
        String enterType = bufRead.readLine();
			  int choiceNumber = Integer.parseInt(enterType);
        if(choiceNumber = 1)
        {
         makeSeatReservation(seats);
        }
      
        eles if(choiceNumber == 2)
        {
          cancel(seats);
        }
      
        else if(choiceNumber == 3)
        {
          printSeating(seats);
        }
      
        else if(choiceNumber == 4)
        {
          
          System.exit(0);
        }
       
        else
        {
          System.out.println("Invalid number, please type again.")
        }
    }while(choiceNumber != 4)
    
      
      
      
 
  */  }
  public void printMenu();
  {
 System.out.println(" Booking Menu "); 
 System.out.println("                ");
 System.out.println("Please press the corresponding numbers to perform a specific action");
 System.out.println("1. Make a reservation");
 System.out.println("2. Cancel a reserved seat");
 System.out.println("3. View the current availabe/reserved seats remaining");
 System.out.println("4. Quit"); //More options can be added
  }
  /**
     * Make a reservation
     */
    public void makeSeatReservation(String[][] seats) {
          // Enter Yi's code for reserving a seat ++ Seat Index is a temp variable that will get replaced
        if (seatIndex == seats.length) {
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

    int getCancel() {
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
    }
  }
