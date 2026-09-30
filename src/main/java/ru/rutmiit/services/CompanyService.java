package ru.rutmiit.services;

import ru.rutmiit.model.CompanySummary;

import java.util.List;

public interface CompanyService {

    List<CompanySummary> allCompanies();

    int companyCount();
}