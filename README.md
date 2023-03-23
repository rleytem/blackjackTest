# blackjackTest
My personal attempt at recreating the gambling casino card game Blackjack, in Java


My first attempt with the knowledge I had so far. I did not use any examples or look up code from others. Truthfully I wanted it to be messy and gross and later improve upon it after I learned more and gained more skills. I want to track how far I've come with my programming skills.

General Overview:
//////////////////

The program has two classes, Card and Main. Card houses the Card object and creates the general blueprint for card objects simulating a 52 card deck. Everything else happens in the main class.

//CARD CLASS
public member variables so we can grab them in Main methods. We do not care for proper encapsulation because there shouldn't be any private data types or issues with them being public. Will explore this later when I revisit this project to see if proper encapsulation can help this program or be more industry preferred ways of writing code.

Card has three member variables, all Strings, suit, number and value. Originally I intended value to be an int as well but when I was writing the constructor I had an issues with the Ace cards being both potentially a 1 or 11. For starting and testing purposes, we made them Strings and chose to value ACE as "1" for now.

Constructor takes in two parameters, suit and number. We pass the suit and number directly into the instance variable. I used a switch expression to cut down on code writing. If number (remember, its a STRING) is equal to Jack, Queen, King, the instance variable value is set to 10. Otherwise if it's an ACE, its set to 1, finally in all other cases (default case) we set it to whatever the value of number is. (e.g. "3" is passed in as "3")

//Example, Seven of Diamonds
//this.suit = "Diamonds", this. number = "7", this.value = number;

(IDEA? Could we write a getter in Card class that would return the parsed value already to make the code in main cleaner?)

In the Main class we will parse value from String to Int.

Finally there is an overridden toString method neatly print the card as it would be if spoken. (3 of Clubs) etc.

//MAIN
importing: ArrayList, Collections and List from java.util

immediately call 52 new objects, each representing a playing card of suit and number.
There is most certainly a better way to do this. Havent thought about it yet. Will look into later as we improve our skills. Also may not be that big of deal in the meantime as there are no more than 52 cards in a deck of playing cards. And we are not constantly creating new card objects.

afterwards, put all the cards into a "freshDeck"
originally I tried to do this as a Stack and realized that it may not play nicely. Will look back into making it a stack but players have ArrayLists.

again, most certainly a better way to do this, but I then add all 52 cards into freshDeck

Shuffle the deck using collection.shuffle

initialize a dealer hand and a player hand of ArrayLists.

I created a method to deal with card draws, it can be utilized by player and dealer.

drawCard method takes in two parameters, first: whomever's hand is being drawn to, second whatever deck we're pulling cards from.
first, we add to the players hand by getting whatever the first value of the freshDeck list.
We then remove that card from freshDeck because we don't want it to come back again.

we then call the drawCard method four times. once for the player and once for the dealer, then again for the player and again for the dealer.

We print the players hand using the toString method we overrode in Card and we do the same with Dealer.

finally we print out the values of the hands along with the remaining cards in the deck.

The second method I wrote is handValue.
handValue takes in one parameter, the list of which hand were checking.

it first sets hasAce to false to signify whether or not we need to check the values later if it's an ace or not.
initializes an integer, total to zero to hold the total value for the hand
for loop for as long as the player/dealer has cards (this way we can go beyond just two cards, should a player or dealer hit)
temp integer that parses the value from the card in hand.
add that temp integer to total
if it's an ace, turn the flag true

outside the for loop:
if hasAce is true, print out a statement saying we do have an ace
return total


//KNOWN ISSUES:
Obviously its not finished, but the Ace functionality is not accurate as we cannot use it as an 11 or a 1.
We cannot hit, fold, double down, split yet.
Dealer cannot check if they have 21 first
Player cannot add insurance
Player has no money
