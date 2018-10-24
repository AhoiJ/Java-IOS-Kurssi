public class Teams {

    private int id;
    private String name;
    private String abbreviation;
    private String teamName;

    public Teams(int id, String name, String abbreviation, String teamName) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.teamName = teamName;
    }

    public int getid() {
        return id;
    }

    public void setTeamId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamAbbreviation() {
        return abbreviation;
    }

    public void setTeamAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    @Override
    public String toString() {
        return "Teams: {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", team abbreviation='" + abbreviation + '\'' +
                ", team name=" + teamName + '\'' +
                '}';
    }
}
