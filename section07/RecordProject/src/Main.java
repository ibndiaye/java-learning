public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300"+i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Jack";
                case 3 -> "Santan";
                case 4 -> "Dave";
                case 5 -> "Tariq";
                default -> "";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s.toString());
        }

        Student pojoStudent = new Student("S923006", "Max","05/11/1985",
                "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Ben","05/11/1985",
                "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+ ", java ocp exam 829");
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList()+
                ", his id is " + pojoStudent.getId() +
                " and is born on the " + pojoStudent.getDateOfBirth());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList()+
                ", his id is " + recordStudent.id() +
                " and is born on the " + recordStudent.dateOfBirth());
    }
}