package ru.rutmiit.catalog;

import org.springframework.stereotype.Repository;
import ru.rutmiit.model.CompanySummary;

import java.util.List;

@Repository
public class InMemoryCompanyCatalog implements CompanyCatalog {

    private final List<CompanySummary> companies = List.of(
            new CompanySummary("Orbit Systems", "Москва", "Орбитальные системы Москвы"),
            new CompanySummary("Northwind Labs", "Казань", "Лабы Казани"),
            new CompanySummary("Metropolitan", "СПб", "Метрополитен Санкт-Петербурга")
    );

    @Override
    public List<CompanySummary> findAll() {
        return companies;
    }
}