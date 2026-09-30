package ru.rutmiit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.rutmiit.model.CompanySummary;
import ru.rutmiit.services.CompanyService;

import java.util.stream.Collectors;

@Controller
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String home() {
        return "Система управления компаниями. Откройте /companies";
    }

    @GetMapping(value = "/companies", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String companies() {
        return companyService.allCompanies().stream()
                .map(this::formatCompany)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @GetMapping(value = "/companies/count", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String countCompanies() {
        return "Всего компаний: " + companyService.companyCount();
    }

    private String formatCompany(CompanySummary company) {
        return company.name() + " | " + company.town() + " | " + company.description();
    }
}