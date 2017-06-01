import java.io.*;
publice class USERinfoinput{
  InputStreamReader inStream = new InputStreamReader(System.in);
 BufferedReader bufRead = new BufferedReader(inStream); 
  try{
   System.out.println("Wlecome fly by night airline pls enter your personal information befor the payment. \n first name and last name:");
   
   String userName =bufRead.readLine();
   
   System.out.println("please enter your address");
   String useraddress = bufRead.readLine();

   System.out.println("please enter your phone number so we can contecet you after.");
   String userphonenbString = bufReas.readLine();
   double phonenumber = Double.parseDouble(userphonenbString);

   System.our.println("you have compl);
   
   
  }
  chach(IOException err)
 {
 System.out.println("Error reading line");
 }
 catch(NumberFormatException err) {
 System.out.println("enter the wrong tryp of number,try again");
 } 
    
}
