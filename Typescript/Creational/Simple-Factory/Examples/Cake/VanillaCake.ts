import { Cake, Flavour, Shape } from "./Cake"

export const VanillaCake = class implements Cake {
	public flavour: Flavour = Flavour.Vanilla
	public shape: Shape
	constructor(shape: Shape) {
		this.shape = shape
	}
}
