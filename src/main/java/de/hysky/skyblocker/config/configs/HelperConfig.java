package de.hysky.skyblocker.config.configs;

import dev.isxander.yacl3.config.v2.api.SerialEntry;

public class HelperConfig {

    @SerialEntry
    public boolean enableNewYearCakesHelper = true;

    @SerialEntry
    public MythologicalRitual mythologicalRitual = new MythologicalRitual();

    @SerialEntry
    public Experiments experiments = new Experiments();

    @SerialEntry
    public Fishing fishing = new Fishing();

    @SerialEntry
    public FairySouls fairySouls = new FairySouls();

    public static class MythologicalRitual {
        @SerialEntry
        public boolean enableMythologicalRitualHelper = true;
    }

    public static class Experiments {
        @SerialEntry
        public boolean enableChronomatronSolver = true;

        @SerialEntry
        public boolean enableSuperpairsSolver = true;

        @SerialEntry
        public boolean enableUltrasequencerSolver = true;
    }

    public static class Fishing {
        @SerialEntry
        public boolean enableFishingHelper = true;

        @SerialEntry
        public boolean enableFishingTimer = false;

        @SerialEntry
        public boolean changeTimerColor = true;

        @SerialEntry
        public float fishingTimerScale = 1f;

        @SerialEntry
        public boolean hideOtherPlayersRods = false;
    }

    public static class FairySouls {
        @SerialEntry
        public boolean enableFairySoulsHelper = false;

        @SerialEntry
        public boolean highlightFoundSouls = true;

        @SerialEntry
        public boolean highlightOnlyNearbySouls = false;
    }
}
