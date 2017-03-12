package com.example.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] locations = { "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine", "rmi://seattle.mightygumball.com/gumballmachine" };
        GumballMonitor[] monitors = new GumballMonitor[locations.length];
        for (int i = 0; i < locations.length; i++) {
            GumballMachineRemote gumballMachineRemote;
            try {
                gumballMachineRemote = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(gumballMachineRemote);
                System.out.println(monitors[i]);
            } catch (MalformedURLException | RemoteException | NotBoundException e) {
                e.printStackTrace();
            }
        }
        for (GumballMonitor gumballMonitor : monitors) {
            gumballMonitor.report();
        }
    }

}
