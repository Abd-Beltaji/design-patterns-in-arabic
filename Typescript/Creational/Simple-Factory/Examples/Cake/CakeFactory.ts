import { Flavour, Shape } from "./Cake"
import { ChocolateCake } from "./ChocolateCake"
import { VanillaCake } from "./VanillaCake"

export class CakeFactory {
	static makeCake = (cakeFlavour: Flavour, cakeShape: Shape) => {
		switch (cakeFlavour) {
			case Flavour.Chocolate:
				return new ChocolateCake(cakeShape)
			case Flavour.Vanilla:
				return new VanillaCake(cakeShape)
		}
	}
}
