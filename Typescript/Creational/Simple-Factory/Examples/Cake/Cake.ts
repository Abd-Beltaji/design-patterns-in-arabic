export enum Flavour {
	Chocolate = "CHOCOLATE",
	Vanilla = "VANILLA"
}
export enum Shape {
	Irregular = -1,
	Circular = 0,
	Rectangular = 1
}
export interface Cake {
	flavour: Flavour
	shape: Shape
}
