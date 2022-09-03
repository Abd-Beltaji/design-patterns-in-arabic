import { Flavour, Shape } from "./Cake"
import { CakeFactory } from "./CakeFactory"

const myChocolateCake = CakeFactory.makeCake(Flavour.Chocolate, Shape.Circular)
const myVanillaCake = CakeFactory.makeCake(Flavour.Vanilla, Shape.Rectangular)

console.log(
	`The shape of the ${myChocolateCake.shape} cake is ${myChocolateCake.shape}`
)
console.log(
	`The shape of the ${myVanillaCake.shape} cake is ${myVanillaCake.shape}`
)
