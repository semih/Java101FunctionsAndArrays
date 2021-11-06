package main.java;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0]="PAZARTESİ";
        daysOfWeek[1]="SALI";
        daysOfWeek[2]="ÇARŞAMBA";
        daysOfWeek[3]="PERŞEMBE";
        daysOfWeek[4]="CUMA";
        daysOfWeek[5]="CUMARTESİ";
        daysOfWeek[6]="PAZAR";

        // Tanımlama, oluşturma ve ilk değer atamanın aynı anda yapılması.
        String[] preDefinedDaysOfWeek = {"PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA", "CUMARTESİ", "PAZAR"};

        for (int index = 0; index < preDefinedDaysOfWeek.length; index++) {
            System.out.format("Haftanın %d inci günü = %s %n", index + 1, preDefinedDaysOfWeek[index]);
        }

        System.out.println("****");

        int dayNumber = 1;
        for (String day : daysOfWeek) {
            System.out.format("Haftanın %d inci günü = %s %n", dayNumber++, day);
        }

        System.out.println("****");

        char[] a1 = {'s','o','l','v','i','a'};
        System.out.println(a1[3]);

    }
}
