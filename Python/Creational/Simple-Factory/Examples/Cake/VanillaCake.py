from Cake import Cake, Shape, Flavour


class VanillaCake(Cake):
    def __init__(self, shape: Shape):
        self.shape = shape
        self.flavour = Flavour.Vanilla
