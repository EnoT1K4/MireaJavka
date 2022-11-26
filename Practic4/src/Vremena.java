public enum Vremena {
        Autumn(10),
        Spring(15),
        Summer(20),
        Winter(-10);


        private final int Avg;

        Vremena(int avg) {
                this.Avg = avg;
        }


        public String perem() {
                switch (this) {
                        case Spring:
                                return("I love " + Spring + "\nAverage Temp is -> " + Avg);
                        case Summer:
                                return("I love " + Summer + "\nAverage Temp is -> " + Avg); // лето
                        case Autumn:
                                return("I love " + Autumn + "\nAverage Temp is -> " + Avg); // осень
                        default:
                                return("I love " + Winter + "\nAverage Temp is -> " + Avg); // зима

                }

        }

        public String getDesription() {
                switch (this) {
                        case Autumn:
                                return "Прохладно";

                        case Spring:
                                return "Не очень тепло";

                        case Summer:
                                return "Очень Тепло";

                        default:
                                return "Холодно";

                }
        }
}
