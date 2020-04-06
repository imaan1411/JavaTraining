import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<U extends Player, T extends Team> {

    private List<T> teams = new ArrayList<>();

    public List<T> getTeams() {
        return teams;
    }

    public void addTeam(T team) {
        if (!teams.contains(team)) {
            teams.add(team);
        }
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        System.out.println("new Ranking");
        for (T t : teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
