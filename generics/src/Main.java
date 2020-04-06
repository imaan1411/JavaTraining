public class Main {
    public static void main(String[] args) {
        FootballPlayer sonja = new FootballPlayer("Sonja");
        BaseballPlayer iman = new BaseballPlayer("Iman");
        SoccerPlayer laurin = new SoccerPlayer("Laurin");

        Team crows = new Team("Crows");
        crows.addPlayer(sonja);
        crows.addPlayer(iman);
        crows.addPlayer(laurin);


    }
}
