from Cake import Flavour, Shape
from ChocolateCake import ChocolateCake
from VanillaCake import VanillaCake


class CakeFactory:
    def createCake(flavour: Flavour, shape: Shape):
        if flavour == Flavour.Chocolate:
            return ChocolateCake(shape)
        elif flavour == Flavour.Vanilla:
            return VanillaCake(shape)
