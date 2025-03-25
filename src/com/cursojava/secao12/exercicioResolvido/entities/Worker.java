package com.cursojava.secao12.exercicioResolvido.entities;

import com.cursojava.secao12.exercicioResolvido.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament; // Composição de Objetos

    private List<HourContract>contracts = new ArrayList<>(); // Composição tem muitos, não inclui no construtor.

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

//    O setContracts() -> Ele recebera outra lista, e essa outra lista vai ser atribuida pra lista de Contracts.
//    Não pode acontecer); Não se troca lista por outra lista.

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){

            cal.setTime(c.getDate()); // Data do meu contrato, e defini a data do calendario.
            int c_year = cal.get(Calendar.YEAR); // Ano daquela data - c
            int c_month = 1 + cal.get(Calendar.MONTH); // Mes daquela data - c

            if (year == c_year && month == c_month){
                sum+=c.totalValue();
            }
        }
        return sum;
    }
}
