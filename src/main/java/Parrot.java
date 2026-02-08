public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }


    @Override
    public String toString() {
        return "I'm a parrot";
    }
}
