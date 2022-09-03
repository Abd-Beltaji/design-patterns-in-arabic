from Cake import Flavour, Shape
from CakeFactory import CakeFactory

my_chocolate_cake = CakeFactory.createCake(Flavour.Chocolate, Shape.Circular)
my_vanilla_cake = CakeFactory.createCake(Flavour.Vanilla, Shape.Rectangular)

print(
    f'The shape of the {my_chocolate_cake.shape} cake is {my_chocolate_cake.shape}')
print(
    f'The shape of the {my_vanilla_cake.shape} cake is {my_vanilla_cake.shape}')
