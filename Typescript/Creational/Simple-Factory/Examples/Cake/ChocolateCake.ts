import { Cake, Flavour, Shape } from "./Cake"

export const ChocolateCake = class implements Cake {
	public flavour: Flavour = Flavour.Chocolate
	public shape: Shape
	constructor(shape: Shape) {
		this.shape = shape
	}
}
