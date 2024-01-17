package poly.pra.send;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("메일 발송합니다: "+message);

    }
}
