package daelim.java_ch02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        /*TransportationWalk transportationWalk*/

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
        transportationWalk.move();

        ctx.close();
    }
}
