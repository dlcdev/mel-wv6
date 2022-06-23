package pratica01;

public class Temperature {
    public static void main(String[] args) {
        int HIGHER_TEMP = 0;
        int LOWER_TEMP = 0;
        String LOWER_CIT = "";
        String HIGHER_CIT = "";

        String cit[] = {
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
        int temperature[][] = {
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

        for (int i = 0; i < temperature.length ; i++) {

            if (temperature[i][0] <= LOWER_TEMP) {
                LOWER_TEMP = temperature[i][0];
                LOWER_CIT = cit[i];
            }

            if (temperature[i][1] >= HIGHER_TEMP){
                HIGHER_TEMP = temperature[i][1];
                HIGHER_CIT = cit[i];
            }

        }

        System.out.printf("\nCit: %s Lower temperature equals: %s", LOWER_CIT, LOWER_TEMP);
        System.out.printf("\nCit: %s Higher temperature equals: %s", HIGHER_CIT, HIGHER_TEMP);

    }
}
