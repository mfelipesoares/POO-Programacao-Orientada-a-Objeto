package Pizza;

/*
 * PizzaBrasileira e PizzaItaliana: F�bricas concretas que implementam
 * a cria��o de pizzas espec�ficas.
 */

//ConcreteFactory B
class PizzaItaliana extends PizzaFactory {

 @Override
 public PizzaVeg criarPizzaVeg() {
     return new PizzaBrocolli();
 }

 @Override
 public Pizza criarPizza() {
     return new PizzaBolonha();
 }
}

