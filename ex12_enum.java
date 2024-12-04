public class ex12_enum {
    enum Grade {
        A(4.0, "Genius"),
        B(3.0, "Very good"),
        C(2.0, "Good"),
        D(1.0, "Not bad"),
        F(0.0, "Fail");// let attribute

        /**
         * @return
         */
        // double getPoint() {
        // return switch (this) {
        // case A -> 4.00;
        // case B -> 3.00;
        // case C -> 2.00;
        // case D -> 1.00;
        // case F -> 0.00;
        // };
        // }
        private Grade(double p, String comment) {
            this.point = p;
            this.description = comment;
        }

        public final double point;
        public final String description;
    }

    public static void main(String[] args) {
        for (Grade items : Grade.values()) {
            System.out.println("Grade is : " + items + ", Points is : " + items.point + ", " + items.description);
        }
        // for (Grade items : Grade.values()) {
        // System.out.println("Grade is : " + items + ", Points is : " +
        // items.getPoint());
        // }
    }
}
