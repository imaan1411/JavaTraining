import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer sonja = new FootballPlayer("Sonja");
        BaseballPlayer iman = new BaseballPlayer("Iman");
        SoccerPlayer laurin = new SoccerPlayer("Laurin");

        Team<FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(sonja);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(iman);

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Player Team");
        soccerTeam.addPlayer(laurin);

        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addPlayer(new SoccerPlayer("hallo"));
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");

        barcelona.matchResult(realMadrid, 1, 0);

        realMadrid.matchResult(barcelona, 3, 3);


        System.out.println("Ranking");

        System.out.println(realMadrid.getName() + ": " + realMadrid.ranking());
        System.out.println(barcelona.getName() + ": " + barcelona.ranking());
        System.out.println(crows.getName() + ": " + crows.ranking());


        LeagueTable<FootballPlayer, Team<SoccerPlayer>> leagueTable = new LeagueTable<>();
        leagueTable.addTeam(realMadrid);
        leagueTable.addTeam(barcelona);

        leagueTable.showLeagueTable();


    }
}
