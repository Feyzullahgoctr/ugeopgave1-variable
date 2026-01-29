
void main (){
    VariableBasics();
    Operators();
    Naming();

}


void VariableBasics() {

    // Opgave 1 Shopping cart
    double firstPrice = 25.50;
    double secondPrice = 15;
    double thirdPrice = 30;
    double subtotal = firstPrice + secondPrice + thirdPrice;
    double taxRate   = 25;
    double totalPriceVAT = subtotal + (subtotal * taxRate   / 100);
    System.out.println("subtotal : " + subtotal);
    System.out.println("Total Price + VAT : " + totalPriceVAT);

    // Opgave 2 Split restaurant bill
    double foodPrice = 450;
    double drinksPrice = 120;
    double tip = 50;
    int numberAfPerson = 4;
    double invoice = foodPrice + drinksPrice + tip;
    double totalPrPerson = invoice / numberAfPerson;
    System.out.println("Total per person : " + totalPrPerson);

    // Opgave 3 Discount calculation
    double totalPrice = 300;
    double discountRate = 20;
    double discountedPrice = totalPrice - (totalPrice * discountRate / 100);
    double taxPercent = 25;
    double finalAmount = discountedPrice + (discountedPrice * taxPercent / 100);
    System.out.println("Original Price : " + totalPrice);
    System.out.println("Price After Discount : " + discountedPrice);
    System.out.println("Final Price : " + finalAmount);

}

void Operators(){

    // Opgave 4 Party planning
    int numberOfGuest = 15;
    int numberOfCakes = 40;
    int cakesPrPerson = numberOfCakes / numberOfGuest;
    int leftoverCakes = numberOfCakes % numberOfGuest;
    System.out.println("Each guest gets " + cakesPrPerson + " cupcakes");
    System.out.println(leftoverCakes + " cupcakes left over");

    // Opgave 5 Build greeting message
    StringBuilder sb = new StringBuilder();
    String name = "Anna";
    int age = 25;
    sb.append("Hello, ");
    sb.append(name);
    sb.append("! ");
    sb.append("You are ");
    sb.append(age);
    sb.append(" years old.");
    System.out.println(sb.toString());

    // Opgave 6 Using +=
    int score = 100;
    System.out.println(score);
    score += 50;
    System.out.println(score);
    score += 25;

    // Opgave 7 Using -=
    int lifeHealth = 100;
    lifeHealth -= 15;
    System.out.println(lifeHealth);
    lifeHealth -= 20;
    System.out.println(lifeHealth);

    // Opgave 8 Using *=
    double price = 50;
    System.out.println(price);
    price *= 2;
    System.out.println(price);

    // Opgave 9 Increment og decrement med 1
    int counter = 10;
    System.out.println(counter);
    counter++;
    System.out.println(counter);
    counter--;
    System.out.println(counter);

    // Opgave 10 All compound operators
    int number = 10;
    number += 5;
    System.out.println(number);
    number -= 3;
    System.out.println(number);
    number++;
    System.out.println(number);
    number--;
    System.out.println(number);

}

void Naming(){

    // Opgave 11 E-commerce product
    String itemSale = "Laptop";
    double itemPrice = 7999.99;
    Boolean isInventory = true;
    int remainded = 15;
    double itemRabat = 10;
    String category = "Electronics";

    // Opgave 12 Karaktersystem
    String studentName = "Anna";
    int testPoint = 85;
    int studentPoint = 92;
    double finalPoint = 88.5;
    Boolean isPassed = true;

    // Opgave 13 Bookingsystem
    String guestName = "Peter Hansen";
    int guestRoomNumber = 204;
    int numberOfStays = 3;
    double priceNight = 899;
    Boolean hasBreakfast = true;
    double totalAmount = 2697;

    // Opgave 14 Fitness-tracker
    int numberOfSteps = 8547;
    int targetedStep = 10000;
    double distanceKm = 6.2;
    int caloriesBurned = 420;
    boolean isGoalAchieved = false;

    // Opgave 15 Bibliotekssystem
    String bookTitle = "Database";
    String authorName = "Daniel";
    String isbnNumber = "157-8-98745";
    int booksPage = 250;
    boolean isAvailable = true;
    String whoBorrower = "Feyzullah Goc";
    String dueDate = "2026-03-01";
    double fineAmount = 0;
    Boolean isBestseller = true;
    double bookRating = 4;

}

