package com.example.ServiPeru.ServiPeru.Service;

import com.example.ServiPeru.ServiPeru.Model.Materiales;

import java.util.List;

public interface IServiceMaterial {
    List<Materiales> Listar();
    Materiales crear(int cod);


}
