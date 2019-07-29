package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Performers.xml");
        Performer p = ctx.getBean("SHIVAM",Performer.class);
        p.perform();
        
        System.out.println();
        p = ctx.getBean("SHUKLA",Performer.class);
        p.perform();
        
        System.out.println();
        p = ctx.getBean("SHIV",Performer.class);
        p.perform();
        
        
        System.out.println();
        p = ctx.getBean("SHIVOM",Performer.class);
        p.perform();
        
        /*ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
        
        cfgCtx.close();*/
    }
}
