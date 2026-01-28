
void main (){
    VariableBasics();

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
    System.out.println("totalPriceVAT : " + totalPriceVAT);

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
    System.out.println("Oprindelige Pris : " + totalPrice);
    System.out.println("Prisen Efter Rabat : " + discountedPrice);
    System.out.println("Endelige Pris : " + finalAmount);

}

void Operators(){

    // Opgave 4 Party planning


}

