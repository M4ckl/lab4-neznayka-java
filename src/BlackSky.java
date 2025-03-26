public class BlackSky implements ISky {
    private String color = "black";
    private String stars = "myriad sparkling stars";

    @Override
    public String getSkyColor() {
        return color;
    }

    @Override
    public String getStars() {
        return stars;
    }
}
