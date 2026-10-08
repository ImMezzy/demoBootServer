package ru.rutmiit.services;

import org.springframework.stereotype.Service;
import ru.rutmiit.catalog.CompanyCatalog;
import ru.rutmiit.model.CompanySummary;
import ru.rutmiit.services.exceptions.CompanyNotFoundException;

import java.util.List;

@Service
public class DefaultCompanyService implements CompanyService {

    private final CompanyCatalog companyCatalog;

    public DefaultCompanyService(CompanyCatalog companyCatalog) {
        this.companyCatalog = companyCatalog;
    }

    @Override
    public List<CompanySummary> allCompanies() {
        return companyCatalog.findAll();
    }

    @Override
    public CompanySummary companyDetails(String companyName) {
        return companyCatalog.findAll().stream()
                .filter(company -> company.name().equals(companyName))
                .findFirst()
                .orElseThrow(() -> new CompanyNotFoundException(companyName));
    }
}
