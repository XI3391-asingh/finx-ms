package com.finx.{{cookiecutter.service_package}}.core.{{ cookiecutter.domain_package }}.domain;

import java.util.UUID;

public class {{ cookiecutter.entity }} {

    private UUID id;
    private String name;

    public {{ cookiecutter.entity }}() {
    }

    public {{ cookiecutter.entity }}(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
