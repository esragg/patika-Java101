/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
Örnek :

Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0 */
package siniflar;

public class Employee {
    String name;
    double salary;
    int workHours; // Haftalik calisma saati
    int hireYear; //ise baslangic yili

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        if (this.salary < 0)
            return 0;
        else
            return this.salary * 0.03;
    }
    double bonus() {
        if (this.workHours > 40) {
            return (workHours - 40) * 30;
        } else
            return 0;
    }

    double raiseSalary(){
        int workedYear = 2021 - this.hireYear;
        if(workedYear > 0 && workedYear <= 9){
            return  this.salary * 0.05;
        } else if(workedYear > 9 && workedYear <= 19)
            return this.salary * 0.10;
            else
                return this.salary * 0.15;
    }
    public String toString() {
        double totalSalaryWithTax = this.salary - tax() + bonus();
        double totalSalaryWithoutTaxAndBonus = this.salary + raiseSalary();
        return "Adi : " + this.name +  "\n"+
                "Maasi: " + this.salary + "\n"+
                "Calisma Saati: " + this.workHours + "\n"+
                "Baslangic Yili: " + this.hireYear +"\n"+
                "Vergi : " + tax() +"\n"+
                "Bonus : " + bonus() + "\n"+
                "Maas Artisi : " + raiseSalary() +"\n"+
                "Vergi ve Bonuslar ile birlikte maas: " +totalSalaryWithTax +"\n"+
                "Toplam maas : " +  totalSalaryWithoutTaxAndBonus;

    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 45,1985);
        System.out.println(employee.toString());
    }
}

