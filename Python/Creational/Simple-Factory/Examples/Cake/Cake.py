from enum import Enum


class Flavour(Enum):
    Chocolate = "CHOCOLATE",
    Vanilla = "VANILLA"


class Shape(Enum):
    Irregular = -1
    Circular = 0
    Rectangular = 1


class Cake:
    flavour: Flavour
    shape: Shape

    def __init__():
        pass
