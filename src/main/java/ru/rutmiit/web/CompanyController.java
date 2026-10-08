package ru.rutmiit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rutmiit.services.CompanyService;

@Controller
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public String allCompanies(Model model) {
        model.addAttribute("companyInfos", companyService.allCompanies());
        return "company-all";
    }

    @GetMapping("/{companyName}")
    public String companyDetails(
            @PathVariable String companyName,
            Model model
    ) {
        model.addAttribute(
                "companyDetails",
                companyService.companyDetails(companyName)
        );
        return "company-details";
    }
}
