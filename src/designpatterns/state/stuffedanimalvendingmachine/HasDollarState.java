package designpatterns.state.stuffedanimalvendingmachine;

public class HasDollarState implements State {
	DollarStuffedAnimalVendingMachine stuffedAnimalMachine;

	public HasDollarState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
		this.stuffedAnimalMachine = stuffedAnimalMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println("You can't insert another " + coin.desc);
	}

	public void ejectCoin() {
		System.out.println("Quarter returned");
		stuffedAnimalMachine.setState(stuffedAnimalMachine.getNoDollarState());
	}

	public void dispense() {
		stuffedAnimalMachine.setState(stuffedAnimalMachine.getSoldState());
		stuffedAnimalMachine.dispense();
	}

	public void refill() {
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}
