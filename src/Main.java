
public class Main {

    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        System.out.println(myCar.condition);
        System.out.println(myCar.currentPrice);
        System.out.println(myCar.license);
        System.out.println(myCar.minSpeed);
        System.out.println(myCar.weight);
        
        Car companyCar = new Car(150, 30, 2000, false, "ERF-456", 'B', 3500, 60000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        System.out.println(companyCar.condition);
        System.out.println(companyCar.currentPrice);
        System.out.println(companyCar.license);
        System.out.println(companyCar.minSpeed);
        System.out.println(companyCar.weight);
                        
    }
    
}
