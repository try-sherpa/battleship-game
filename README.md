# Terminal Battleship
- Play a game of battleship (with modified game rules) against a basic AI in the terminal.

## Rules:

### Fleet Size
- First you will be prompted with board size. The height and width of the board can be between 6 and 15 cells inclusive.
- The total fleet size may not exceed the smaller board dimension, but must have at least one of each boat type. Therefore, for a board of size 8x11, there should be no more than 8 total boats. Fleet size and boat types will be identical between players.
- There are Carriers (size 6), Battleships (size 5), Destroyers (size 4) and Submarines (size 3). If someone wanted 1 of each ship, they would input '1 1 1 1' when prompted in the terminal. 

### Number of Shots
- For each turn, each player launches one missile per non-sunk boat remaining in their fleet. For example, if you currently have 3 remaining ships in your fleet, you would launch 3 missiles. At the same point in time, if your opponent had 5 ships remaining, they would be able to launch 5 missiles.

### Shooting Order
- Both players select their shots (target locations), and the shots are exchanged simultaneously. Information about hits is then exchanged, surviving ships are updated, and the process is repeated until one (or both) players have no more surviving ships. Importantly, this means some games will end in ties!

- The steps for a shooting stage of a game of terminal battleship are outlined below:
1. Both Players shoot their shots
2. Both Players receive the incoming shots that their opponent fired
3. Both Players update their ships accordingly, and communicate which of the incoming shots hit
4. Repeat

# Have fun!

This template includes several additional tools:
1. Gradle Build Automation
1. JaCoCo for Test Coverage
1. CheckStyle for Code Style Checks
