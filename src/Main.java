
public class Main {
    public static void main(String[] args) {

        APerson znajka = new APerson("Знайка", "Друг");

        znajka.checkProtectionOfEquipment();

        APerson fuksia = new APerson("Фуксия", "Друг");
        APerson seledochka = new APerson("Селедочка", "Друг");
        APerson zvezdochkin = new APerson("Звездочкин", "Проффесор");
        APerson others = new APerson("Другие", "Другие");

        znajka.seeAbout();
        znajka.changeLocation();
        fuksia.changeLocation();
        seledochka.changeLocation();
        zvezdochkin.changeLocation();
        others.changeLocation();

        ACosmicThings earth = new Earth("Земля", 100);
        ACosmicThings moon = new Moon("Луна", 27);


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
            private String color = "фиолетовый";
            private String stars = "миллионы мерцающих звезд";

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
                System.out.printf("Как только Знайка и его спутники вышли из пещеры, они увидели над собой %s небо с %s и огромный сияющий %s земля.\n",
                        space.getSkyColor(), space.getStars(), EForm.ПОЛНЫЙКРУГ);
                System.out.printf("Они также увидели другое небо с %s и %s дискообразной Землей.\n", anotherSky.getSkyColor(), EForm.ПОЛНЫЙКРУГ);
            }
        }
        DisplayText displayText = new DisplayText();
        displayText.display();
    }
}
