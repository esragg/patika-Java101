/* Boks Maçı
Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

Ödev
Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz. */

package siniflar.boks_maci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int starter = 50;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge <=100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasari blokladi.");
            System.out.println("-------------------------------------");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
    double Start(){
        double randomStarter = Math.random() * 50;
        return randomStarter;
    }
}
package siniflar.boks_maci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("========= YENI ROUND =========");
                if (this.f1.Start() > this.f2.Start()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                System.out.println(this.f2.name + " Saglik : " + this.f2.health);

            }
        } else{
            System.out.println("Sporcularin sikletleri uymuyor.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin() {
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi !");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi !");
            return true;
        }
        return false;
    }
}
package siniflar.boks_maci;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 100, 30);
        Fighter f2 = new Fighter("B", 20, 85, 85, 40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
