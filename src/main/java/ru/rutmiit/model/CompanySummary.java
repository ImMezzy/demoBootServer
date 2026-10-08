package ru.rutmiit.model;

import java.math.BigDecimal;

public record CompanySummary(
        String name,
        String town,
        String description,
        BigDecimal budget
) {
}