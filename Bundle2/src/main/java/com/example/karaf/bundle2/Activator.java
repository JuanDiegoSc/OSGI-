package com.example.karaf.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private Bundle2Service service;

    @Override
    public void start(BundleContext context) throws Exception {
        service = new Bundle2Service();
        service.start();
        System.out.println("Bundle1 Activator: Bundle iniciado.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        if (service != null) {
            service.stop();
        }
        System.out.println("Bundle1 Activator: Bundle detenido.");
    }
}
