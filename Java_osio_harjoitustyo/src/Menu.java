import javax.swing.*;
import java.util.List;

public class Menu implements Runnable {

  private List<Team> teams;


    public void setTeamsList(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public void run() {

        String choice;
        do {
            choice = JOptionPane.showInputDialog(null, "1. Tulosta data \n" +
                    " 2. Poista data \n 3. Poistu sovelluksesta");

            if (choice.equals("1")) {
                try {
                    if (!teams.isEmpty()) {

                        for (Team e : teams) {
                            System.out.println(" ID: " + e.getid() + " Name: " + e.getName() +
                                    " Team abbreviation: " + e.getTeamAbbreviation() +
                                    " Team name : " + e.getTeamName());
                        }
                    } else
                        System.out.println(" No Data! ");
                }catch (NullPointerException e){
                    System.out.println(e);
                }


            }
            if (choice.equals("2")) {
                try{
                    teams.clear();
                }catch(NullPointerException y){
                    System.out.println(y);
                }

            }
        } while (!choice.equals("3"));

    }
}


