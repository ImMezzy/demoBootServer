package ru.rutmiit.services.exceptions;

public class CompanyNotFoundException extends RuntimeException {

    public CompanyNotFoundException(String companyName) {
        super("Компания с названием '" + companyName + "' не найдена");
    }
}
