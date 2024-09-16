public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №4 \n");

        //Task 1
        int ageMan = 20;
        int ageWoman = 17;
        //Term 1
        if (ageMan >= 18) {
            System.out.println("Задание №1: \nЕсли возраст человека равен " +ageMan + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " +ageMan + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Term 2
        if (ageWoman >= 18) {
            System.out.println("Если возраст человека равен " +ageWoman + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " +ageWoman + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


        //Task 2
        int coldDay = 2;
        int warmDay = 15;
        //Term 1
        if (coldDay >=5) {
            System.out.println("На улице " + coldDay + " градусов, можно идти без шапки.");
        } else {
            System.out.println("\nЗадача №2: \nНа улице " + coldDay + " градуса, нужно надеть шапку.");
        }
        //Term 2
        if (warmDay >=5) {
            System.out.println("На улице " + warmDay + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + warmDay + " градусов, нужно надеть шапку.");
        }


        //Task 3
        int highSpeed = 70;
        int normalSpeed = 60;
        //Term 1
        if (highSpeed > 60) {
            System.out.println("\nЗадача №3: \nЕсли скорость " + highSpeed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + highSpeed + " км/ч, то можно ездить спокойно.");
        }
        //Term 2
        if (normalSpeed > 60) {
            System.out.println("Если скорость " + normalSpeed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + normalSpeed + " км/ч, то можно ездить спокойно.");
        }


        //Task 4
        int child = 4;
        int schoolBoy = 12;
        int student = 21;
        int worker = 25;
        //Term 1
        if (child >= 2 && child <=6) {
            System.out.println("\nЗадача №4: \nЕсли возраст человека равен " + child + ", то ему нужно ходить в детский сад.");
        }
        //Term 2
        if (schoolBoy >= 7 && schoolBoy <=17) {
            System.out.println("Если возраст человека равен " + schoolBoy + ", то ему нужно ходить в школу.");
        }
        //Term 3
        if (student >= 18 && student <=24) {
            System.out.println("Если возраст человека равен " + student + ", то ему нужно ходить в университет.");
        }
        //Term 4
        if (worker > 24) {
            System.out.println("Если возраст человека равен " + worker + ", то ему нужно ходить на работу.");
        }


        //Task 5
        int childAge1 = 3;
        int childAge2 = 10;
        int childAge3 = 15;
        // Term 1
        if (childAge1 > 5 && childAge1 < 14) {
            System.out.println("Если возраст ребенка равен " + childAge1 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("\nЗадача №5: \nЕсли возраст ребенка равен " + childAge1 + ", то ему нельзя кататься на аттракционе.");
        }
        // Term 2
        if (childAge2 > 14) {
            System.out.println("Если возраст ребенка равен " + childAge2 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge2 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        // Term 3
        if (childAge3 > 14 && childAge3 > 5) {
            System.out.println("Если возраст ребенка равен " + childAge3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge3 + ", то ему кататься на аттракционе в сопровождении взрослого.");
        }


        //Task 6
        int trainSeats = 120;
        int seatingPlaces = 60;
        int standingPlaces = trainSeats - seatingPlaces;
        //Is not terms (empty train)
        if (trainSeats <= 120 && trainSeats > 0 && seatingPlaces <= 60 && seatingPlaces > 0 && standingPlaces <= (trainSeats - seatingPlaces) && standingPlaces > 0) {
            System.out.println("\nЗадача №6: \nВ вагоне свободно " + trainSeats + " мест, из них свободно " + seatingPlaces + " сидячих и " + standingPlaces + " стоячих мест.");
        } else {
            System.out.println("В вагоне свободных мест нет");
        }
        //Train with people (Full train)
        int seatingPeople = 60;
        int standingPeople = 60;
        trainSeats = 120 - (seatingPeople + standingPeople);
        seatingPlaces = 60 - seatingPeople;
        standingPlaces = standingPlaces - standingPeople;
        if (trainSeats <= 120 && trainSeats > 0 && seatingPlaces <= 60 && seatingPlaces > 0 && standingPlaces <= (trainSeats - seatingPlaces) && standingPlaces > 0) {
            System.out.println("В вагоне свободно " + trainSeats + " мест, из них свободно " + seatingPlaces + " сидячих и " + standingPlaces + " стоячих мест.");
        } else {
            System.out.println("В вагоне свободных мест нет");
        }


        //Task 7
        int one = 5;
        int two = 10;
        int three = 15;
        //Example 1
        if (three > one && three > two) {
            System.out.println("\nЗадача №7: \nПример 1: Наибольшее число среди переменных это three = " + three);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число среди переменных это two = " + two);
        } else if (one > two && one > three) {
            System.out.println("Наибольшее число среди переменных это one = " + one);
        }
        //Example 2
        two = two + 50;
        if (three > one && three > two) {
            System.out.println("Наибольшее число среди переменных это three = " + three);
        } else if (two > one && two > three) {
            System.out.println("Пример 2: Наибольшее число среди переменных это two = " + two);
        } else if (one > two && one > three) {
            System.out.println("Наибольшее число среди переменных это one = " + one);
        }
        //Example 3
        two = two - 50;
        one = one + 50;
        if (three > one && three > two) {
            System.out.println("Наибольшее число среди переменных это three = " + three);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число среди переменных это two = " + two);
        } else if (one > two && one > three) {
            System.out.println("Пример 3: Наибольшее число среди переменных это one = " + one);
        }

    }
}