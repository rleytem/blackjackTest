public class Card {
    public String suit;
    public String number;
    public String value;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
        switch (number) {
            case "Jack":
                this.value = "10";
                break;
            case "Queen":
                this.value = "10";
                break;
            case "King":
                this.value = "10";
                break;
            case "Ace":
                this.value = "1";
                break;
            default:
                this.value = number;
                break;
        }
    }

    @Override
    public String toString() {
        return number + " of " + suit;
    }
}
