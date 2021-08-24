class Army {

    public static void createArmy() {
        // Create all objects here
        Unit u1 = new Unit("Gaius");
        Unit u2 = new Unit("George");
        Unit u3 = new Unit("Jusis");
        Unit u4 = new Unit("Machias");
        Unit u5 = new Unit("Crow");

        Knight k1 = new Knight("Rean");
        Knight k2 = new Knight("Lloyd");
        Knight k3 = new Knight("Rufus");

        General g1 = new General("Cassius");

        Doctor d1 = new Doctor("Linde");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}