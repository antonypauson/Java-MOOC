import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

//csv has homeTeam, visitingTeam, homeTeamScore, visitingTeamScore
//we created two Lists for winners and losers
//as the team with most points per match is the winner, we can add it to the lists.

public class SportsStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        ArrayList<String> winners = new ArrayList<>(); //list for winners
        ArrayList<String> losers = new ArrayList<>(); //list for losers

        int count = 0;
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();

                String[] myArray = row.split(",");

                String team1 = myArray[0]; //home team
                String team2 = myArray[1]; //visiting team

                int team1Score = Integer.parseInt(myArray[2]); //the 3rd value is home team score
                int team2Score = Integer.parseInt(myArray[3]); //the last value is second team score

                if (team1Score > team2Score) {
                    winners.add(team1);
                    losers.add(team2);
                } else {
                    winners.add(team2);
                    losers.add(team1);
                }

                if (teamName.equals(team1) || teamName.equals(team2)) {
                    count++; //counter for calculating the number of games for a team
                }
//                System.out.println(team1 + " " + team2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Games: " + count);
        int noOfWins = 0;
        int noOfLoss = 0;
//        System.out.println(winners);
//        System.out.println(losers);

        for (String winner : winners) {
            if (winner.equals(teamName)) {
                noOfWins++;
            }
        }

        for (String loser : losers) {
            if (loser.equals(teamName)) {
                noOfLoss++;
            }
        }

        System.out.println("Wins:" + noOfWins);
        System.out.println("Losses: " + noOfLoss);
    }
}
