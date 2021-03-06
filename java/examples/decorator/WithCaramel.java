package net.adrianlehmann.swt_revision.patterns.variation_patterns.decorator;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class WithCaramel extends IceCreamDecorater {
    public WithCaramel(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getFlavor() {
        return super.getFlavor() + ", Caramel";
    }
}
