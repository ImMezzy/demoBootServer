package ru.rutmiit.catalog;

import ru.rutmiit.model.CompanySummary;

import java.util.List;

public interface CompanyCatalog {

    List<CompanySummary> findAll();
}