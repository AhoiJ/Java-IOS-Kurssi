import javax.swing.*;
import java.util.List;

public class Menu implements Runnable {
   List<Teams> teams;

    Menu(List<Teams> teams) {
        this.teams = teams;
    }

    @Override
    public void run() {

        String choice;
        do {
            choice = JOptionPane.showInputDialog(null, "1. Tulosta data \n" +
                    " 2. Poista data \n 3. Poistu sovelluksesta");

            if (choice.equals("1")) {

            //    if (!teams.isEmpty()) {

                    for (Teams e : teams) {
                        System.out.println(" ID: " + e.getid() + " Name: " + e.getName() +
                                " team abbreviation: " + e.getTeamAbbreviation() +
                                " team name : " + e.getTeamName());
                    }
              //  } else
                //    System.out.println(" No Data! ");
            }
            if (choice.equals("2")) {



            }
        } while (!choice.equals("3"));

    }
}


