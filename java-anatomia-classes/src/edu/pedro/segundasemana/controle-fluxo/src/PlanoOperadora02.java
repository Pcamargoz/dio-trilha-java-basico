public class PlanoOperadora02{
    public static void main(String[] args) {
        String plano = "T"; //M /T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M" : {
                System.out.println("Whats e instagram grátis");
                break;
            }
            case "B" : {
                System.out.println("100 Minutos de ligação");
                break;
            }
        }
    }
}