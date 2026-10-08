package ru.rutmiit.catalog;

import org.springframework.stereotype.Repository;
import ru.rutmiit.model.CompanySummary;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class InMemoryCompanyCatalog implements CompanyCatalog {

    private final List<CompanySummary> companies = List.of(
            new CompanySummary(
                    "Orbit Systems",
                    "Москва",
                    "Разрабатывает корпоративные веб-приложения.",
                    new BigDecimal("1500000.00")
            ),
            new CompanySummary(
                    "Northwind Labs",
                    "Казань",
                    "Создаёт инструменты анализа данных.",
                    new BigDecimal("950000.00")
            ),
            new CompanySummary(
                    "<script>alert('unsafe')</script>",
                    "Тестовый город",
                    "Проверка безопасного вывода.",
                    new BigDecimal("1.00")
            )
    );

    @Override
    public List<CompanySummary> findAll() {
        return companies;
    }
}
