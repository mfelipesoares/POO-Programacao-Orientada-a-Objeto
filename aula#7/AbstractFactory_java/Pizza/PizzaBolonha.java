package Pizza;

//ConcreteProductB2
class PizzaBolonha implements Pizza {

 @Override
 public void servir(PizzaVeg pizzaVeg) {
     System.out.println(getClass().getSimpleName() + " � servida com bolonha na " + pizzaVeg.getClass().getSimpleName());
 }
}