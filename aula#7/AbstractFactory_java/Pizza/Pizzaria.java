package Pizza;

class Pizzaria {

    public void fazerPizzas() {
        PizzaFactory[] factories = {new PizzaBrasileira(), new PizzaItaliana()};
        
        for (PizzaFactory factory : factories) {
            Pizza pizza = factory.criarPizza();
            PizzaVeg pizzaVeg = factory.criarPizzaVeg();
            pizzaVeg.preparar();
            pizza.servir(pizzaVeg);
        }
    }

    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        pizzaria.fazerPizzas();
    }
}