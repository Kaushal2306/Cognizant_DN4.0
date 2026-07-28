import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 82 },
        { name: "Shubman Gill", score: 68 },
        { name: "KL Rahul", score: 74 },
        { name: "Hardik Pandya", score: 60 },
        { name: "Ravindra Jadeja", score: 88 },
        { name: "Ravichandran Ashwin", score: 55 },
        { name: "Jasprit Bumrah", score: 72 },
        { name: "Mohammed Shami", score: 64 },
        { name: "Mohammed Siraj", score: 78 },
        { name: "Kuldeep Yadav", score: 69 }
    ];
    const playersBelow70 = players.filter(player => player.score < 70);

    return (
    <div>
        <h2>List of Players</h2>

        {players.map((player, index) => (
            <p key={index}>
                {player.name} - {player.score}
            </p>
        ))}

        <h2>Players with Scores Below 70</h2>

        {playersBelow70.map((player, index) => (
            <p key={index}>
                {player.name} - {player.score}
            </p>
        ))}
    </div>
);
}

export default ListofPlayers;