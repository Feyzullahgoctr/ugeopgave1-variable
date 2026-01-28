
void main (){
    VariableBasics();
    Operators();

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

}

