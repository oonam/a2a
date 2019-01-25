package com.snowcost.snowcostv0100.controller;

import com.snowcost.snowcostv0100.entity.Accomodation2;
import com.snowcost.snowcostv0100.service.Accomodation2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Accomodation2Controller {

  private Accomodation2Service service;

  public Accomodation2Controller(Accomodation2Service service) {
    this.service = service;
  }

  @GetMapping("/")
  public String main(Model model) {
    model.addAttribute("accomodation", new Accomodation2());
    return "main";
  }

  @PostMapping("/add")
  public String addAccomodation(@ModelAttribute Accomodation2 accomodation) {
    service.addAccomodation(accomodation);
    return "redirect:/" + accomodation.getId();
  }

  @GetMapping("/{id}")
  public String sumDetails(@PathVariable Long id, Model model) {
    model.addAttribute("accomodation", service.getAccomodationById(id));
    model.addAttribute("multiplyAccomodation", service.multiplyAccomodationCosts(id));
    model.addAttribute("multiplySkiTicket", service.multiplySkiTicket(id));
    model.addAttribute("fuelCalc", service.fuelCalculator(id));
    model.addAttribute("sum", service.sumPrices(id));
    return "main";
  }
}
