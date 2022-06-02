import ru.netology.sqr.services.SQRService;

public class Main {

    public static void main(String[] args) {
        int minLimit = 150;
        int maxLimit = 300;

        SQRService service = new SQRService();
        System.out.println("Количество чисел: " + service.calcSQR(minLimit, maxLimit));

    }
}
