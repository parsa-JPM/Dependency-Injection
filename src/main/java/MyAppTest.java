import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyAppTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        //mock injector with anonymous class
        injector = new MessageServiceInjector() {
            public Consumer getConsumer() {

                return new EmailConsumer(new MessageService() {

                    public void sendMessage(String recp, String Msg) {
                        System.out.println("name : " + recp + "\n" + Msg);
                    }

                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.proccessMessage("hish", "parsa");
    }

    @After
    public void tear() {
        injector = null;
    }
}
