// This carries the smallest value, plus how many of the three inputs share it

public record SmallestResult(int value, int occurrences) {
    public boolean isTie() {
        return occurrences > 1;
    }
}
