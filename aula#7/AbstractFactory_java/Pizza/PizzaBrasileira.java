package Pizza;

/*
 * PizzaBrasileira e PizzaItaliana: F�bricas concretas que implementam
 * a cria��o de pizzas espec�ficas.
 */
//ConcreteFactory A
class PizzaBrasileira extends PizzaFactory {

 @Override
 public PizzaVeg criarPizzaVeg() {
     return new PizzaMandioca();
 }

 @Override
 public Pizza criarPizza() {
     return new PizzaCamarao();
 }
}
