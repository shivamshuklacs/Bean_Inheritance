package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: SHIVAM SHUKLA
 * Creation Date: 29th Jul'19 03:44 PM
 * Modified Date: 29th Jul'19 03:44 PM
 * Version: 3.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent an Instrumentalist of Zensar Idol Competition.
 * It also show bean life cycle in Spring Framework.
 */
public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware{

	private String song;
	private Instrument instrument;
	private String beanName;
	
	// for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}

	// for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	//business logic of Instrumentalist
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Patriotic "+ beanName+" is playing "+song);
		instrument.play();
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("bean name is set");
}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Core IoC Container BeanFactory is set");
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Specialized IoC Container ApplicationContext is set");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//Instrument.tune();
		System.out.println("afterProperties Satisfied");
	}
	public void tuneInstrument() {
		instrument.tune();
		System.out.println("Custom init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//instrument.clean();
		System.out.println("Destroy method is called");
	}
	
	public void cleanInstrument() {
		instrument.clean();
		System.out.println("Custom destroy method");
	}
}
