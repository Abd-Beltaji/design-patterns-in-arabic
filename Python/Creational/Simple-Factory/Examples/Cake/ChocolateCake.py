from Cake import Cake, Shape, Flavour


class ChocolateCake(Cake):
    def __init__(self, shape: Shape):
        self.shape = shape
        self.flavour = Flavour.Chocolate
