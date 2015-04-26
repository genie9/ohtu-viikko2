package ohtu;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private final Map<Integer, String> names;
    private final String player1Name;
    private final String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        names = new HashMap() {
            {
                put(0, "Love");
                put(1, "Fifteen");
                put(2, "Thirty");
                put(3, "Forty");
            }
        };
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        String score = "";
        if (m_score1 == m_score2) {
            score = even(m_score1);
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            score = advantageOrWin(m_score1, m_score2);
        } else {
            score = names.get(m_score1) + "-" + names.get(m_score2);
        }
        return score;
    }

    private String advantageOrWin(int m_score1, int m_score2) {
        int delta = m_score1 - m_score2;
        if (delta == 1) {
            return "Advantage player1";
        } else if (delta == -1) {
            return "Advantage player2";
        } else if (delta >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private String even(int m_score1) {
        if (m_score1 > 3) {
            return "Deuce";
        } else {
            return names.get(m_score1) + "-All";
        }
    }
}
