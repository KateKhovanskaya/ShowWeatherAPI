package org.example;

import org.example.presenter.Presenter;
import org.example.ui.DesktopUI;
import org.example.ui.View;
import org.example.weatherApi.Service;
import org.example.weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        Service service = new WeatherService();
        Presenter presenter = new Presenter(view, service);

        view.start();
    }
}