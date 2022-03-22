public class Main {
    public static void main(String args[]){
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном предсатвлении: ");
        b.show(123);
        System.out.println("\n87987 в двоичнгм коде: ");
        i.show(87987);
        System.out.println("\nМладшие 8 битов числа 87987 в двоичном представление: ");
        b.show(87987);
    }
}
