package com.finx.{{cookiecutter.service_package}}.core.{{ cookiecutter.domain_package }}.services;

import com.finx.{{cookiecutter.service_package}}.api.Create{{ cookiecutter.entity }}Cmd;
import com.finx.{{cookiecutter.service_package}}.core.{{ cookiecutter.entity.lower() }}.domain.{{ cookiecutter.entity }};
import com.finx.{{cookiecutter.service_package}}.db.{{ cookiecutter.entity }}Repository;

public class {{ cookiecutter.entity }}Service {

    private {{ cookiecutter.entity }}Repository {{ cookiecutter.entity.lower() }}Repository;

    public {{ cookiecutter.entity }}Service({{ cookiecutter.entity }}Repository {{ cookiecutter.entity.lower() }}Repository) {
        this.{{ cookiecutter.entity.lower() }}Repository = {{ cookiecutter.entity.lower() }}Repository;
    }

    public {{ cookiecutter.entity }} create(Create{{ cookiecutter.entity }}Cmd cmd) {
        var {{ cookiecutter.entity.lower() }} = new {{ cookiecutter.entity }}(cmd.getName());
        var created = this.{{ cookiecutter.entity.lower() }}Repository.save({{ cookiecutter.entity.lower() }});
        return created;
    }
}
