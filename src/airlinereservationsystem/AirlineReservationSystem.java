package airlinereservationsystem;
import java.util.Scanner;
public class AirlineReservationSystem {

    public static void main(String[] args) {
        // declaration for input. <name> sc <name>
        Scanner sc = new Scanner(System.in);
        
        int[] arrayBCS = new int[5]; // array for business class smoke
        int bcsCount = 0; // var count for business class smoke
        int[] arrayBCNS = new int[5]; // array for business class non smoke
        int bcnsCount = 0; // var count for business class non smoke
        
        int[] arrayES = new int[5]; // array for economy  smoke
        int esCount = 0; // var count for economy  smoke
        int[] arrayENS = new int[5]; // array for economy non smoke
        int ensCount = 0; // var count for economy non smoke
        
        boolean exit = false; // loop flag
        
        // system loops
        while(exit == false){        
            if(bcsCount + bcnsCount + esCount + ensCount != 20){
               System.out.println(" ");
               System.out.println("Airline Reservatiion System");
               System.out.println("[1]Business Class Ticket");
               System.out.println("[2]Economy Ticket");
               System.out.print("Ticktet Option:");
               int ticketOption = sc.nextInt();
               
               // condition 1
               if(ticketOption == 1){
                   if(bcsCount + bcnsCount  != 10){
                        System.out.println(" ");
                        System.out.println("Business Class Ticket");
                        System.out.println("[1]Smokeing Seat");
                        System.out.println("[2]Non-Smokeing Seat");
                        System.out.print("Choose Seat Option:");
                        int businessClassOption = sc.nextInt();
                        
                        // option1
                        if(businessClassOption == 1){
                            if(bcsCount != 5 ){
                                if(arrayBCS[bcsCount] != 1){
                                arrayBCS[bcsCount] = 1;
                                bcsCount += 1;
                                System.out.print("<System>Business Class Ticket assign for Smoke seat #");
                                System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else{
                                    //
                                }   

                            }
                            else{
                                System.out.print("<System>Tickets are full would you like to transfer to another seat? (Y/N) -");
                                char transferOptionA1 = sc.next().charAt(0);
                                if(transferOptionA1 == 'y' || transferOptionA1 == 'Y'){
                                    arrayBCNS[bcnsCount] = 1;
                                    bcnsCount += 1;
                                    System.out.print("<System>Business Class Ticket assign for Non Smoke seat #");
                                    System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else if(transferOptionA1 == 'n' || transferOptionA1 == 'N'){
                                     System.out.println("<Sysyem>Exit program...");
                                     exit = true;
                                }
                                else{
                                    System.out.println("<System>Invalid Choice!");
                                    System.out.println("<System>Ruturn to Ticket Option...");
                                    exit = false;
                                }
                            }
                        }
                        
                        // option2
                        else if(businessClassOption == 2){
                            if(bcnsCount != 5){
                                if(arrayBCNS[bcnsCount] != 1){
                                   arrayBCNS[bcnsCount] = 1;
                                   bcnsCount += 1;
                                   System.out.print("<System>Business Class Ticket assign for Non Smoke seat #");
                                    System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else{
                                    //
                                }
                            }
                            else{
                                System.out.print("<System>Tickets are full would you like to transfer to another seat? (Y/N) -");
                                char transferOptionA2 = sc.next().charAt(0);
                                if(transferOptionA2 == 'y' || transferOptionA2 == 'Y'){
                                    arrayBCS[bcsCount] = 1;
                                    bcsCount += 1;
                                    System.out.print("<System>Business Class Ticket assign for  Smoke seat #");
                                    System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else if(transferOptionA2 == 'n' || transferOptionA2 == 'N'){
                                     System.out.println("<Sysyem>Exit program...");
                                     exit = true;
                                }
                                else{
                                    System.out.println("<System>Invalid Choice!");
                                    System.out.println("<System>Ruturn to Ticket Option...");
                                    exit = false;
                                }
                            }
                                
                        }
                        //end option
                        else{
                            System.out.println("<System>Invalid Choice!");
                            System.out.println("<System>Ruturn to Ticket Option...");
                            exit = false;
                        }
                   }
                   else{
                       
                        System.out.print("<System>All seats are taken in Business Class would you like to change ticket accomodation? (Y/N) -");
                        char transferOutA = sc.next().charAt(0);
                        if(transferOutA == 'y' || transferOutA == 'Y'){
                            System.out.println("Return to Ticket Option...");
                            exit = false; 
                        }
                        else if(transferOutA == 'n' || transferOutA == 'N'){
                            System.out.println("<System>Exit program...");
                            exit = true; 
                                    
                        }
                        else{
                            System.out.println("<System>Invalid Choice!");
                            System.out.println("<System>Ruturn to Ticket Option...");
                            exit = false;
                        }
      
                   }
               }
               
               // condition 2
               else if(ticketOption == 2){
                   if(esCount + ensCount  != 10){
                        System.out.println(" ");
                        System.out.println("Business Class Ticket");
                        System.out.println("[1]Smokeing Seat");
                        System.out.println("[2]Non-Smokeing Seat");
                        System.out.print("Choose Seat Option:");
                        int economyOption = sc.nextInt();
                        
                        //option 1
                        if(economyOption == 1){
                            if(esCount != 5 ){
                                if(arrayES[esCount] != 1){
                                arrayES[esCount] = 1;
                                esCount += 1;
                                System.out.print("<System>Economy Ticket assign for Smoke seat #");
                                System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else{
                                    //
                                }   

                            }
                            else{
                                System.out.print("<System>Tickets are full would you like to transfer to another seat? (Y/N) -");
                                char transferOptionB1 = sc.next().charAt(0);
                                if(transferOptionB1 == 'y' || transferOptionB1 == 'Y'){
                                    arrayENS[ensCount] = 1;
                                    ensCount += 1;
                                    System.out.print("<System>Business Class Ticket assign for Non Smoke seat #");
                                    System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else if(transferOptionB1 == 'n' || transferOptionB1 == 'N'){
                                     System.out.println("<Sysyem>Exit program...");
                                     exit = true;
                                }
                                else{
                                    System.out.println("<System>Invalid Choice!");
                                    System.out.println("<System>Ruturn to Ticket Option...");
                                    exit = false;
                                }
                            }
                        }
                        // opton 2
                        else if(economyOption == 2){
                                if(ensCount != 5 ){
                                    if(arrayENS[ensCount] != 1){
                                        arrayENS[ensCount] = 1;
                                        ensCount += 1;
                                        System.out.print("<System>Economy Ticket assign for Non Smoke seat #");
                                        System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                    }
                                else{
                                    //
                                }   

                            }
                            else{
                                System.out.print("<System>Tickets are full would you like to transfer to another seat? (Y/N) -");
                                char transferOptionB2 = sc.next().charAt(0);
                                if(transferOptionB2 == 'y' || transferOptionB2 == 'Y'){
                                    arrayES[esCount] = 1;
                                    esCount += 1;
                                    System.out.print("<System>Economy Ticket assign for  Smoke seat #");
                                    System.out.println(bcsCount + bcnsCount + esCount + ensCount);
                                }
                                else if(transferOptionB2 == 'n' || transferOptionB2 == 'N'){
                                     System.out.println("<System>Exit program...");
                                     exit = true;
                                }
                                else{
                                    System.out.println("<System>Invalid Choice!");
                                    System.out.println("<System>Ruturn to Ticket Option...");
                                    exit = false;
                                }
                            }
                        }
                        //end option
                        else{
                            System.out.println("<System>Invalid Choice!");
                            System.out.println("<System>Ruturn to Ticket Option...");
                            exit = false;
                        }
                    }
                   else{
                       
                   }
                        
               }
               
               // end condition
               else{
                    System.out.println("<System>Invalid Option!");
                    System.out.println("<System>Ruturn to Ticket Option...");
                    exit = false;
               }
            }
            else{
                System.out.println("All seats are taken"); 
                exit = true; 
            }
        }
        
    }
    
}
