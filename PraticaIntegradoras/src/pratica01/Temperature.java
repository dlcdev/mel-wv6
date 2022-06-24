package pratica01;

public class Temperature {
    public static void main(String[] args) {
        int higherTemp = 0;
        int lowerTemp = 0;
        String lowerCit = "";
        String higherCit = "";

        String[] cit = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };
        int[][] temperature = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35},
        };

        for (int i = 0; i < temperature.length; i++) {

            if (temperature[i][0] <= lowerTemp) {
                lowerTemp = temperature[i][0];
                lowerCit = cit[i];
            }

            if (temperature[i][1] >= higherTemp) {
                higherTemp = temperature[i][1];
                higherCit = cit[i];
            }

        }

        System.out.printf("\nCit: %s Lower temperature equals: %s", lowerCit, lowerTemp);
        System.out.printf("\nCit: %s Higher temperature equals: %s", higherCit, higherTemp);

    }
}
