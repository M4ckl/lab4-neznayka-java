public class BlackSky implements ISky {
    private String color = "черный";
    private String stars = "мириады сверкающих звезд";

    @Override
    public String getSkyColor() {
        return color;
    }

    @Override
    public String getStars() {
        return stars;
    }
}
