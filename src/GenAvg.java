public class GenAvg {
    /**
     * Create a class called `GenAvg` that generates an array of 50 random integers,
     * then calculates and prints their average. Make sure to create `GenAvg.md` in
     * the docs folder and answer our reflection prompts there as well.
     * 
     * @param args
     */
    public void gen() {
        int[] rands = new int[50];
        double sum = 0.0;
        for (int i = 0; i < 50; i++) {
            int n = (int) (Math.random() * 10);
            rands[i] = n;
            sum += n;
        }
        System.out.println("The average is: " + (sum / 50));
    }

    public static void main(String[] args) {
        new GenAvg().gen();
    }
}
