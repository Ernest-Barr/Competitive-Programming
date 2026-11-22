#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string p1, p2;
    cin >> p1 >> p2;

    const auto rps = [&](const string& player1, const string& player2) -> bool {
        if (player1 == "paper" && player2 == "rock") return true;
        if (player1 == "scissors" && player2 == "paper") return true;
        if (player1 == "rock" && player2 == "scissors") return true;
        return false;
    };

    cout << (rps(p1, p2)   ? "Player 1"
             : rps(p2, p1) ? "Player 2"
                           : "Draw")
         << "\n";
}
