package com.example.proxy.remote;

import java.rmi.RemoteException;

public class GumballMonitor {

    private GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineRemote.getLocation());
            System.out.println("Current inventory: " + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
