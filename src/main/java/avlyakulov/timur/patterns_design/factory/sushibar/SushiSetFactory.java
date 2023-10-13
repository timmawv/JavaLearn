package avlyakulov.timur.patterns_design.factory.sushibar;

public class SushiSetFactory {
    public SushiSet createSushiSet(SushiSetType type) {
        switch (type) {
            case FILADELFIA -> {
                return new SushiSetFiladelfia();
            }
            case NAGAMA -> {
                return new SushiSetNagama();
            }
            case NOKUDO -> {
                return new SushiSetNokudo();
            }
            case NOBASHI -> {
                return new SushiSetNobashi();
            }
            case SIGACU -> {
                return new SushiSetSigacu();
            }
            default -> {
                return null;
            }
        }
    }
}
