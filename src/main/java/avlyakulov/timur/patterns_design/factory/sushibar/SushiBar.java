package avlyakulov.timur.patterns_design.factory.sushibar;

public class SushiBar {
    private final SushiSetFactory sushiSetFactory;

    public SushiBar(SushiSetFactory sushiSetFactory) {
        this.sushiSetFactory = sushiSetFactory;
    }

    public SushiSet makeOrder(SushiSetType type) {
        SushiSet sushiSet = sushiSetFactory.createSushiSet(type);

        sushiSet.cutFish();
        sushiSet.wrapFishWithRice();
        sushiSet.bringSetToTable();

        System.out.println("Here is your sushi set");
        return sushiSet;
    }
}
