package management.people.people_management_api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum State {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapa"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceara"),
    DF("Distrito Federal"),
    ES("Espirito Santo"),
    GO("Goias"),
    MA("Maranhao"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Para"),
    PB("Paraiba"),
    PR("Parana"),
    PE("Pernambuco"),
    PI("Piaui"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondonia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("Sao Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    private final String description;
}
