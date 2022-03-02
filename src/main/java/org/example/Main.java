package org.example;

import org.example.service.Service;


public class Main {
    public static void main(String[] args) {
        Service service=new Service();

        service.openWebsite("http://www.google.com");
        service.fillSearchBox("Selenium Testing");
        service.search();
        service.clickSecondLink();
    }
}
