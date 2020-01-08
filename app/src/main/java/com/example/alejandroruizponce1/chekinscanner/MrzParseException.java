package com.example.alejandroruizponce1.chekinscanner;

public class MrzParseException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    /**
     * The MRZ string being parsed.
     */
    public final String mrz;
    /**
     * Range containing problematic characters.
     */
    public final MrzRange range;
    /**
     * Expected MRZ format.
     */
    public final MrzFormat format;

    public MrzParseException(String message, String mrz, MrzRange range, MrzFormat format) {
        super("Failed to parse MRZ " + format + " " + mrz + " at " + range + ": " + message);
        this.mrz = mrz;
        this.format = format;
        this.range = range;
    }
}
