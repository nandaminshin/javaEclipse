package OOP2Assignment;

public class Demo {

    public static void main(String[] args) {
        
        int i = 0;

        //Section A
        Teacher [] tObj = new Teacher[3];

        tObj[0] = new Teacher("Lecturer", "Department of PHYSICS", 300000 , "U Hla", "05/YMP(N)065575", "Yangon", "09-787756332");

        tObj[1] = new Teacher("Tutor", "Department of CYBER SECURITY AND FORENSIS", 400000 , "U Tun Tun", "12/KMT(N)146772", "Yangon", "09-794338861");

        tObj[2] = new Teacher("Professor", "Department of ARTIFICIAL INTELLIGENCE AND NAUTRALL LANGUAGE PROCESSING", 500000 , "U Kyaw Kyaw", "05/MYN(N)246777", "Yangon", "09-2130177");

        //Section B (For user input whil program is running , comment section A and uncomment this section B)
        // for(i = 0 ; i < tObj.length ; i++) {
        //     tObj[i].setTeacherIfo();
        // }

        //Showing all daata befor promotion and transfer.
        for(i = 0 ; i < tObj.length ; i++) {
            tObj[i].showTeacherInfo();
            System.out.println("_____________________________________");
        }

        //promote
        tObj[1].promote("Professor", 500000);

        //transfer
        tObj[1].transfer("Department of BUSINESS INFORMATION TECHNOLOGY");

        //Showing all data after promotion and transfer
        System.out.println("............................................................");
        System.out.println("After Promotion and Transfer");
        System.out.println("............................................................");
        for(i = 0 ; i < tObj.length ; i++) {
            tObj[i].showTeacherInfo();
            System.out.println("_____________________________________");
        }

        System.out.println(" :_) ");

    }
}
