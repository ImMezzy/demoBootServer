package ru.rutmiit.web;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.rutmiit.services.exceptions.CompanyNotFoundException;

@ControllerAdvice
public class CompanyErrorHandler {

    @ExceptionHandler(CompanyNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String companyNotFound(CompanyNotFoundException exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "error/company-not-found";
    }
}
