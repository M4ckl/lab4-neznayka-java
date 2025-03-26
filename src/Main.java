
public class Main {
    public static void main(String[] args) {

        APerson znajka = new APerson("Znayka", "Friend");

        znajka.checkProtectionOfEquipment();

        APerson fuksia = new APerson("Fuchsia", "Friend");
        APerson seledochka = new APerson("s" +
                "Selyodochka", "Friend");
        APerson zvezdochkin = new APerson("Zvezdochkin", "Professor");
        APerson others = new APerson("Other", "Other");

        znajka.seeAbout();
        znajka.changeLocation();
        fuksia.changeLocation();
        seledochka.changeLocation();
        zvezdochkin.changeLocation();
        others.changeLocation();

        ACosmicThings earth = new Earth("Earth", 100);
        ACosmicThings moon = new Moon("Moon", 27);


        earth.lookLike();
        moon.lookLike();

        moon.conditionOfBrightness();

        //проверяем на ошибку
        try {
            znajka.checkTruth(earth, moon);
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }


        ISky sky = new BlackSky();
        Cosmos space = new Cosmos(sky);

        // Анонимный класс
        ISky anotherSky = new ISky() {
            private String color = "violet";
            private String stars = "Millions of twinkling stars";

            @Override
            public String getSkyColor() {
                return color;
            }

            @Override
            public String getStars() {
                return stars;
            }
        };

        // Локальный класс
        class DisplayText {
            void display() {
                System.out.printf("As soon as Znayka and his companions exited the cave, they saw above them the %s sky with %s and a huge shining %s earth.\n",
                        space.getSkyColor(), space.getStars(), EForm.FULLCIRCLE);
                System.out.printf("They also saw another sky with %s and a %s disco-shaped Earth.\n", anotherSky.getSkyColor(), EForm.FULLCIRCLE);
            }
        }
        DisplayText displayText = new DisplayText();
        displayText.display();
    }
}
