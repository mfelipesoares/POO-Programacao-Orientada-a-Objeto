package Pizza;

//AbstractFactory
/*
 * PizzaFactory: Interface abstrata que define os m�todos 
 * para criar pizzas vegetarianas e n�o vegetarianas.
 */

/* Interface PizzaFactory: Define os m�todos para criar os produtos abstratos
 * (Pizza e PizzaVeg). 
 */

abstract class PizzaFactory {
	abstract PizzaVeg criarPizzaVeg();
	abstract Pizza criarPizza();
}