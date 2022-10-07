public class Main {
    
    public static void main(String[] args) {
        //Create 3 new horses
        Horse horse1 = new Horse("Horse 1", 2000);
        Horse horse2 = new Horse("Horse 2", 2003);
        Horse horse3 = new Horse("Horse 3", 2005);
        //Print each horse
        System.out.println(horse1.toString());
        System.out.println(horse2.toString());
        System.out.println(horse3.toString());
    }
}
