import java.io.*;
public class Plane{ 
  public int FULL_PLANE = 10; //Maximum seats
  String[][] seats = new String[2][5];
  public static void main(String[] args){
     /*   do {
            printMainMenu();
            int choice = add buffer();       // Gives the user a choice in a menu
             {
            case 1:
                makeSeatReservation(seats);
                break;
            case 2:
                cancel(seats);
                break;
           // case 3:
              //  printSeatingChart(seats);
             //   break;
            case 4:
                done = true;
                break;
            }
 
        } while ();
 
  */  }
   /**
     * Make a reservation
     */
    public void makeSeatReservation(String[][] seats) {
          // index of first empty seat (Yi's code needed)
        if (seatIndex == seats.length) {
            System.out.println("All seats are full. Sorry, for the inconvenience...");
        } else {
            //Enter Mikes's code for Information
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
