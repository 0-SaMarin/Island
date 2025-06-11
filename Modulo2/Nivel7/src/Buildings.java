public class Buildings {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        // change null to a Building or School object
        return new School();
    }

    public static Building getBuilding() {
        // change null to a Building or School object
        return new Building();
    }

    static class School extends Building{
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /* escribe aquí tu código */ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
