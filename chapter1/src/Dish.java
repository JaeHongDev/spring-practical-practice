public class Dish {
    private String name;
    public Dish(String s) {
        this.name = s;
    }


    public static Object deliver(Dish dish) {
        return new Dish(dish);
    }
}
