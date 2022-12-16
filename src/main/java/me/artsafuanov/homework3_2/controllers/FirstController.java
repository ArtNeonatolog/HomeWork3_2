package me.artsafuanov.homework3_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String appStart () {
        return "Приложение запущено";
    }

    @GetMapping ("/info")
    public String appInfo () {
        return "Имя ученика - Артем;" + System.lineSeparator() +
                "Название проекта - HomeWork3;" + System.lineSeparator() +
                "Дата создания проекта - 10.12.2022 г.;" + System.lineSeparator() +
                "Описание проекта - хороший, но можно лучше";

    }
}

