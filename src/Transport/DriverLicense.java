package Transport;
public enum DriverLicense {
        A("Категория A"),
        B("Категория B"),
        C("Категория C"),
        D("Категория D");
        String category;
        DriverLicense(String category){
                this.category = category;
        }

        public String getCategory() {
                return category;
        }

        /**
         * Returns the name of this enum constant, as contained in the
         * declaration.  This method may be overridden, though it typically
         * isn't necessary or desirable.  An enum type should override this
         * method when a more "programmer-friendly" string form exists.
         *
         * @return the name of this enum constant
         */
        @Override
        public String toString() {
                return getCategory();
        }
}
