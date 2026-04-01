public class PaymentProcessor {

    private PaymentService paymentService;
    private LoggerService loggerService;

    public PaymentProcessor(PaymentService paymentService, LoggerService loggerService) {
        this.paymentService = paymentService;
        this.loggerService = loggerService;
    }

    public void pay(double amount) {
        paymentService.pay(amount);
        loggerService.log("Paid: " + amount);
    }
}