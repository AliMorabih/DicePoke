# DicePoke

Here's a corrected version of your text:

The concept of my game is called "Dice Poker". The game is played by both humans and computers. The player places a bet on each round, and the computer rolls the dice. The player has a balance in their bank account that they can use to place their bets. In addition, the game gives the player a free £6 to start with.

Before the user starts playing the first round, an interface prompts the user to enter a name. The user must enter a name in order to start the game. The player is prompted to enter their bet amount. If the user enters a bet amount between £1 and £4, then the computer rolls the dice.

In order to win points, the dice must have a sequential number. If the player wins, they will earn double their bet amount. If the computer rolls identical numbers, the player will earn triple the points; this is the highest hand. If the player loses, they will lose their bet money.

The game will stop after a certain point. I added a loop that stops the game if the user plays 5 rounds or if the player runs out of money. At the end of the game, a message will be displayed, indicating the reason why the game ended



In conclusion, I believe that the program I have developed is easily extensible, as I have used five classes. If we want to add any new features to the game in the future, we can simply add new methods or even classes.

The program also allows for easy customization, such as changing the number of dice used in the game. This can be done by calling the random class, which generates pseudo-random numbers in Java. For our program, this method generates a random integer number from 1 to 6, which corresponds to the number of faces on each die.

Although implementing the number of rounds to play may not be easy, it is possible by creating a method that takes care of the rounds.

However, I acknowledge that the PokerDice class may have been overloaded, particularly with the checkWinner() method which has many lines of code. It would be better if I moved some of the code outside of this class and into separate functions or methods for better readability and maintainability.
