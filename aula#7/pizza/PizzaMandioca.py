from abc import ABCMeta, abstractmethod
from PizzaVeg import PizzaVeg

# ProdutoConcreto
class PizzaMandioca(PizzaVeg):

    def preparar(self):
        print(f'Preparando {type(self).__name__}')
