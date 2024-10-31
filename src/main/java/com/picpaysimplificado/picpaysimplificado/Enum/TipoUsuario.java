package com.picpaysimplificado.picpaysimplificado.Enum;

public enum TipoUsuario {
    USUARIO("usuario"),
    LOJISTA("lojista");

    private String tipoUsuario;

    TipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario(){
        return tipoUsuario;
    }
}
