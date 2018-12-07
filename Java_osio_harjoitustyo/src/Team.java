public class Team {

    private String id;
    private String name;
    private String abbreviation;
    private String teamName;

    public Team(String id, String name, String abbreviation, String teamName) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.teamName = teamName;
    }

    public String getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeamAbbreviation() {
        return abbreviation;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Team: {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", team abbreviation='" + abbreviation + '\'' +
                ", team name=" + teamName + '\'' +
                '}';
    }
}
