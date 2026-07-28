import React from "react";

function IndianPlayers() {

    const players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Shubman Gill",
        "KL Rahul",
        "Hardik Pandya",
        "Ravindra Jadeja"
    ];

    // ES6 Destructuring
    const [odd1, even1, odd2, even2, odd3, even3] = players;

    // Two separate arrays
    const T20Players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Suryakumar Yadav"
    ];

    const RanjiTrophyPlayers = [
        "Cheteshwar Pujara",
        "Hanuma Vihari",
        "Mayank Agarwal"
    ];

    // Merge arrays using Spread Operator
    const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <p>{odd1}</p>
            <p>{odd2}</p>
            <p>{odd3}</p>

            <h2>Even Team Players</h2>
            <p>{even1}</p>
            <p>{even2}</p>
            <p>{even3}</p>

            <h2>Merged Players</h2>
            {mergedPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}
        </div>
    );
}

export default IndianPlayers;