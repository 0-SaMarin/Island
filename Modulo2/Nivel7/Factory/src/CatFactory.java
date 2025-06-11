public class CatFactory {
    static Cat getCatByKey(String key) {
        Cat cat;
        switch (key) {
            case "simba":
                cat = new MaleCat("Simba");
                break;
            case "fluffy":
                cat = new FemaleCat("Fluffy");
                break;
            case "bella":
                cat = new FemaleCat("Bella");
                break;
            default:
                cat = new Cat(key);
                break;
        }
        return cat;
    }
}
