package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch3.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 通过使用ref标记可以将一个bean注入到另一个bean
 */
public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);

        ctx.close();
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
