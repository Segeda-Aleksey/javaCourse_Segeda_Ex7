abstract class Person {

    private Season winter = Season.WINTER;
    private Season spring = Season.SPRING;
    private Season summer = Season.SUMMER;
    private Season autumn = Season.AUTUMN;

    public Season getWinter() {
        return winter;
    }

    public void setWinter(Season winter) {
        this.winter = winter;
    }

    public Season getSpring() {
        return spring;
    }

    public void setSpring(Season spring) {
        this.spring = spring;
    }

    public Season getSummer() {
        return summer;
    }

    public void setSummer(Season summer) {
        this.summer = summer;
    }

    public Season getAutumn() {
        return autumn;
    }

    public void setAutumn(Season autumn) {
        this.autumn = autumn;
    }
}
