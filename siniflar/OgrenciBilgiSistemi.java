/*
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }

}

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void addVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3){
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.c1.verbalNote = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.c2.verbalNote = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            c3.verbalNote = verbalNote3;
        }
    }
    double calcNote(){
        return (this.c1.note * 0.8 + this.c1.verbalNote * 0.2) +
                (this.c2.note * 0.8 + this.c2.verbalNote * 0.2) +
                (this.c3.note * 0.8 + this.c3.verbalNote * 0.2);
    }
    void isPass() {
        this.average = calcNote()/ 3.0;
        if(this.average > 55){
            System.out.println("====================================");
            System.out.println("Sinifi basarili sekilde gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("====================================");
            System.out.println("Sinifta kaldiniz. ");
            this.isPass = false;
        }
        printNote();
    }
    void printNote () {

        System.out.println(this.c1.name + " Notu :" + this.c1.note);
        System.out.println(this.c1.name + " Sozlu Notu: " + this.c1.verbalNote);
        System.out.println(this.c2.name + " Notu :" + this.c2.note);
        System.out.println(this.c2.name + " Sozlu Notu: " + this.c2.verbalNote);
        System.out.println(this.c3.name + " Notu :" + this.c3.note);
        System.out.println(this.c3.name + " Sozlu Notu: " + this.c3.verbalNote);
        System.out.println("Ortalamaniz : " + this.average);
    }
}

public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String branch,String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adi : " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bolumu : " + this.branch);
    }


}


public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t2);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "123", "4",tarih, fizik, biyo);
        s1.addBulkExamNote(40, 40, 50);
        s1.addVerbalNote(40,60,90);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,70);
        s2.addVerbalNote(50,60,60);
        s2.isPass();
    }
}
