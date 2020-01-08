package com.example.alejandroruizponce1.chekinscanner;


import java.io.Serializable;

public class MrzRange implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 0-based index of first character in the range.
         */
        public final int column;
        /**
         * 0-based index of a character after last character in the range.
         */
        public final int columnTo;
        /**
         * 0-based row.
         */
        public final int row;

        /**
         * Creates new MRZ range object.
         * @param column 0-based index of first character in the range.
         * @param columnTo 0-based index of a character after last character in the range.
         * @param row 0-based row.
         */
        public MrzRange(int column, int columnTo, int row) {
            if (column > columnTo) {
                throw new IllegalArgumentException("Parameter column: invalid value " + column + ": must be less than " + columnTo);
            }
            this.column = column;
            this.columnTo = columnTo;
            this.row = row;
        }

        @Override
        public String toString() {
            return "" + column + "-" + columnTo + "," + row;
        }

        /**
         * Returns length of this range.
         * @return number of characters, which this range covers.
         */
        public int length() {
            return columnTo - column;
        }
    }

