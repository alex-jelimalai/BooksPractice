package org.foo.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Example implements BundleActivator {
	public void start(BundleContext bc) {
		System.out.println("Hello world");
	}	
	public void stop(BundleContext bc) {
		System.out.println("Goodbye world");  
	}
	
}