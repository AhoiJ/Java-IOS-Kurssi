import javax.swing.*;
import java.util.List;

public class Menu implements Runnable {

  private List<Team> teams; // initialize variable

    // Gets value from function call in Main
    public void setTeamsList(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public void run() {
        String choice; // initialize variable

        // Checks user input and reacts to it.
        do {
            choice = JOptionPane.showInputDialog(null, "1. Tulosta data \n" +
                    " 2. Poista data \n 3. Poistu sovelluksesta");

            if (choice.equals("1")) {
                try {
                    if (!teams.isEmpty()) {
                        // prints out contents of teams list variable
                        for (Team e : teams) {
                            System.out.println(" ID: " + e.getid() + " Name: " + e.getName() +
                                    " Team abbreviation: " + e.getTeamAbbreviation() +
                                    " Team name : " + e.getTeamName());
                        }
                    } else
                        System.out.println(" No Data! "); // if teams list is empty /
                    // has been emptied by user, prints no data

                    // if teams list is null, handles that
                }catch (NullPointerException e){
                    System.out.println(e);
                }
            }
            if (choice.equals("2")) {
                try{
                    teams.clear(); // empties teams list variable

                    // if teams list is null, handles that
                }catch(NullPointerException y){
                    System.out.println(y);
                }
            }
        } while (!choice.equals("3")); // loops menu until player chooses to terminate program
    }
}


