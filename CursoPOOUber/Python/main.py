from matplotlib.style import use
from numpy import var
from car import Car
from account import Account
from user import User
from driver import Driver

if __name__ == '__main__':
  print('Hola mundo')

  car = Car("AMS234", Account("Andres Herrera","ANDA876"))
  print(vars(car))
  print(vars(car.driver))
  