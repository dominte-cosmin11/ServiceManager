package com.example.nouproiectdam.controller;

import ch.qos.logback.core.model.Model;
import com.example.nouproiectdam.classes.Payments;
import com.example.nouproiectdam.classes.Inregistration;
import com.example.nouproiectdam.classes.Appointment;
import com.example.nouproiectdam.entities.EmployeeEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @GetMapping("")
    public List<EmployeeEntity> getEmployees(){

        EmployeeEntity firstEmployee= new EmployeeEntity(1, "Bianca", "Moldovan", "bianca.moldovan0604", "06.04.2002");

        EmployeeEntity secondEmployee= new EmployeeEntity(2, "Lidia", "Antaluta", "lidia.anta", "01.04.2001");
        return List.of(firstEmployee, secondEmployee);
    }
    @RequestMapping("/inregistration")
    public String inregistration (Model model) {
        // Simulăm datele pe care doriți să le afișați
        List<Inregistration> inregistrations = new ArrayList<>();
        inregistrations.add(new Inregistration("1", "John Doe", "Manager"));
        inregistrations.add(new Inregistration("2", "Jane Smith", "Programator"));

        ModelAndView modelAndView = new ModelAndView("employees/Inregistrate");
        modelAndView.addObject("inregistrations", inregistrations);

        return "employees/inregistration";
    }
    @RequestMapping("/payments")
    public ModelAndView payments() {
        // Simulați datele pentru plăți
        List<Payments> payments = new ArrayList<>();
        payments.add(new Payments("1", "1234-5678-9012-3456", "12/25", "123", "100.00"));
        payments.add(new Payments("2", "9876-5432-1098-7654", "11/24", "456", "75.50"));

        ModelAndView modelAndView = new ModelAndView("employees/payments");
        modelAndView.addObject("payments", payments);

        return new ModelAndView("employees/payments");
    }

    @RequestMapping("/seeAppointments")
    public ModelAndView seeAppointments() {
        // Simulați datele pentru programări
        List<Appointment> appointments = new ArrayList<>();


        ModelAndView modelAndView = new ModelAndView("employees/appointments");
        modelAndView.addObject("appointments", appointments);

        return new ModelAndView("employees/appointments");
    }
    @RequestMapping("/error")
    public String handleError() {
        // faceți ceva, cum ar fi jurnalizarea
        return "404-not found";
    }
}






















