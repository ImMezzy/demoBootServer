package ru.rutmiit.services;

import org.springframework.stereotype.Service;
import ru.rutmiit.catalog.CompanyCatalog;
import ru.rutmiit.model.CompanySummary;

import java.util.Comparator;
import java.util.List;

@Service
public class DefaultCompanyService implements CompanyService {

    private final CompanyCatalog companyCatalog;

    public DefaultCompanyService(CompanyCatalog companyCatalog) {
        this.companyCatalog = companyCatalog;
    }

    @Override
    public List<CompanySummary> allCompanies() {
        return companyCatalog.findAll().stream().sorted(Comparator.comparing(CompanySummary::name)).toList();
    }

    @Override
    public int companyCount() {
        return companyCatalog.findAll().size();
    }
}