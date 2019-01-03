public class TennisGame {
    private static String score = "";
    private static final char Love = 0;
    private static final char Fifteen = 1;
    private static final char Thirty = 2;
    private static final char Forty = 3;

    private void DeuceScore(int playerScore){
        switch (playerScore)
        {
            case Love:
                score = "Love-All";
                break;
            case Fifteen:
                score = "Fifteen-All";
                break;
            case Thirty:
                score = "Thirty-All";
                break;
            case Forty:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
    }

    private void WinScore(int player1Score, int player2Score,String player1Name, String player2Name){
        int Result = player1Score-player2Score;
        if (Result==1) score ="Advantage "+player1Name;
        else if (Result ==-1) score ="Advantage "+player2Name;
        else if (Result>=2) score = "Win for "+player1Name;
        else score ="Win for "+player2Name;
    }

    private void Score(int player1Score, int player2Score){
        for (int player=1; player<3; player++)
        {
            int tempScore = 0;
            if (player==1) tempScore = player1Score;
            else { score+="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case Love:
                    score+="Love";
                    break;
                case Fifteen:
                    score+="Fifteen";
                    break;
                case Thirty:
                    score+="Thirty";
                    break;
                case Forty:
                    score+="Forty";
                    break;
            }
        }
    }

    public String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

        if (player1Score==player2Score)
        {
            DeuceScore(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            WinScore(player1Score, player2Score, player1Name,  player2Name);
        }
        else
        {
            Score(player1Score,player2Score);
        }
        return score;
    }
}
