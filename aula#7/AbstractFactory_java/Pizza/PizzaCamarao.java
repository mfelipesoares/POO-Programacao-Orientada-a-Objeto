package Pizza;

//ConcreteProductB1
class PizzaCamarao implements Pizza {

 @Override
 public void servir(PizzaVeg pizzaVeg) {
     System.out.println(getClass().getSimpleName() + " � servida com camar�o na " + pizzaVeg.getClass().getSimpleName());
 }
}