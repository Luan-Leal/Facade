package org.example;

public class Aluno {

    public boolean formar() {
        return AlunoFacade.verificarPendenciasFormatura(this);
    }
}
