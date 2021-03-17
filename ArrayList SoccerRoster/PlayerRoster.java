import java.util.Scanner;
import java.util.ArrayList;

public class PlayerRoster {
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String args[]) {
      /* Declare and create an ArrayList containing Player elements called myTeam.
       */
		ArrayList<Player> myTeam = new ArrayList<Player>();
		initializeRoster(myTeam);
		menu(myTeam);
        
      System.out.println("End of PlayerRoster run.");
	}
	
	public static void initializeRoster(ArrayList<Player> team) {		
      /* Complete this method so that it initializes the ArrayList using keyboard input.
        
         Here are the prompts/messages:
         System.out.print("Enter player name (hit enter to quit): ");
         System.out.print("Enter " +  + "'s jersey number: ");
         System.out.print("Enter " +  + "'s rating: ");
         System.out.println("\n" +  + " players were entered.");
      */
         
         boolean enterPressed = false;
         do {
            Player person = new Player();
            System.out.print("Enter player name (hit enter to quit): ");
            String playerName = scnr.nextLine();
            person.setName(playerName);
            if (!person.getName().equals("")) {
               System.out.print("Enter " + person.getName() + "'s jersey number: ");
               int jerseyNum = scnr.nextInt();
               person.setJerseyNum(jerseyNum);
               
               System.out.println("Enter " + person.getName() + "'s rating: ");
               int playerRating = scnr.nextInt();
               scnr.nextLine();
               person.setRating(playerRating);
               team.add(person);
            }
            else {
               enterPressed = true;
            }
         } while (!enterPressed);
      System.out.println("\n" + team.size() + " players were entered.");
   }
	
	public static void outputRoster(ArrayList<Player> team) {
      /* Complete this method so that it outputs the team roster to the screen.
        
         Here are the prompts/messages:
         System.out.println("Team is: ");
    	   System.out.println("End of team.");
      */
      System.out.println("Team is: ");
      for (int i = 0; i < team.size(); i++) {
         System.out.println("\t" + team.get(i).getName() + " has jersey number " + team.get(i).getJerseyNum() + " and rating " + team.get(i).getRating());
      }
      System.out.println("End of team.");
	}
	
	public static void updateRating(ArrayList<Player> team) {
      /* Complete this method so that it updates the rating of a player
         identified by their jersey number.
           
         Here are the prompts/messages:
         System.out.print("Enter a new rating for player: ");
         System.out.println("There is no player with jersey number: " + playerJersey);
      */
		System.out.print("Enter a jersey number: ");
		Integer playerJersey = scnr.nextInt();
      boolean found = false;
      for (int i = 0; i < team.size(); i++) {
         if (team.get(i).getJerseyNum() == playerJersey) {
            found = true;
            if (found) {
               System.out.print("Enter a new rating for player: "); 
               Integer playerRating = scnr.nextInt();
               team.get(i).setRating(playerRating);
            }
         }
      }
      if (!found) {
         System.out.println("There is no player with jersey number: " + playerJersey);
      }
	}
	
	public static void outputHighRated(ArrayList<Player> team) {
      /* Complete this method so that it outputs all the players with
         a rating above the user entered rating.
           
         Here is the message:
         System.out.println("\nPlayers above rating " + highRating + ":");
      */
		System.out.print("Enter the rating: ");
		int highRating = scnr.nextInt();
      System.out.println("\nPlayers above rating " + highRating + ":");
      
      for (int i = 0; i < team.size(); i++) {
         if (team.get(i).getRating() > highRating) {
            System.out.println("\t" + team.get(i).getName() + " has jersey number " + team.get(i).getJerseyNum() + " and rating " + team.get(i).getRating());
         }
      }
	}
	
	public static void replacePlayer(ArrayList<Player> team) {
      /* Complete this method so that it replaces a player on the team
         with another player. Be sure to handle the following situations:
         - user entered name is not in the roster
         - user entered jersey number already used by another player
           
         Here are the prompts/messages:
         System.out.println("Enter the new player's name: ");
         System.out.println("Player: " + toReplace + " not in the roster.");
         System.out.print("Enter jersey number for " +  + ": ");
         System.out.println("Jersey number " +  + " is already taken by player " +  + "\nTry again.");
         System.out.print("Enter rating for new player " +  + ": ");
      */
      System.out.println("Enter player's name: ");
		String toReplace = scnr.next();
      boolean found = false;
      
      for (int i = 0; i < team.size(); i++) {
         if (team.get(i).getName().equals(toReplace)) {
            found = true;
            System.out.println("Enter the new player's name: ");
            String newName = scnr.next();
            team.get(i).setName(newName);
            System.out.print("Enter jersey number for " + newName + ": ");
            int newNum = scnr.nextInt();
            boolean jerseyFound = false;
            
            while(!jerseyFound) {
               int j = 0;
               while (j < team.size() && !jerseyFound) {
                  if (team.get(j).getJerseyNum().equals(Integer.valueOf(newNum))) {
                     System.out.println("Jersey number " + newNum + " is already taken by player " + team.get(j).getName() + "\nTry again.");
                     System.out.print("Enter jersey number for " + newName + ": ");
                     newNum = scnr.nextInt(); 
                     j++;
                  }
                  else {
                     jerseyFound = true;
                  }
               }
               
            }
            team.get(i).setJerseyNum(newNum);
            System.out.print("Enter rating for new player " + ": ");
            int newRating = scnr.nextInt();
            team.get(i).setRating(newRating);
         }
      }
      if (!found) {
         System.out.println("Player: " + toReplace + " not in the roster.");
      }
      
	}
	
	public static void menu(ArrayList<Player> team) {
        /* This method is complete. Do not modify it.
        */
		char menuOp;
		do {
			System.out.println("\nMENU");
			System.out.println("u - Update player rating");
			System.out.println("h - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
	  
			System.out.println("\nChoose an option:");
			menuOp = scnr.next().toUpperCase().charAt(0);

			if (menuOp != 'Q')
				switch (menuOp) {
					case 'U' :	updateRating(team);
								break;
					case 'H' :	outputHighRated(team);
								break;
					case 'R' :	replacePlayer(team);
								break;
					case 'O' :	outputRoster(team);
								break;
					default	 :	System.out.println("Illegal menu item.");
								break;
				}
		} while (menuOp != 'Q');
	}	
}