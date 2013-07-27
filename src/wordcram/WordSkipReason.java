package wordcram;

public enum WordSkipReason {
	
	/**
     * Skip Reason: the Word was skipped because {@link WordCram#maxNumberOfWordsToDraw(int)}
     * was set to some value, and the Word came in over that limit.
     * It's really about the Word's rank, its position in the list once the words are
     * sorted by weight: if its rank is greater than the value passed to maxNumberOfWordsToDraw(),
     * then it'll be skipped, and this will be the reason code.
     */
	WAS_OVER_MAX_NUMBER_OF_WORDS("number of maximum words reached"),
	
	/**
     * Skip Reason: the Word's shape was too small. WordCram will only render
     * words so small, for performance reasons. You can set the minimum Word shape
     * size via {@link WordCram#minShapeSize(int)}.
     */
    SHAPE_WAS_TOO_SMALL("shape too small"),
    
    /**
     * Skip Reason: WordCram tried placing the Word, but it couldn't find a clear
     * spot. The {@link WordNudger} nudged it around a bunch (according to
     * {@link WordCram#maxAttemptsToPlaceWord(int)}, if it was set), but there was just no room.
     */
    NO_SPACE("no space");

    String reason;

    WordSkipReason(String reason) {
        this.reason = reason;
    }

    public String toString() {
        return reason;
    }
}
