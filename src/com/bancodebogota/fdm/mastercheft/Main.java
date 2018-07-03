/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.mastercheft;

/**
 *
 * @author Jamm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
//        program.AgregarIngredienteMain();
        program.AgregarCocina();
    }

//    public void AgregarIngredienteMain() {
//        Inventario inventario = new Inventario();
//        Ingrediente[] ingredientes = new Ingrediente[2];
//        Ingrediente ingrediente = new Ingrediente();
//        ingrediente.setCantidad(2);
//        ingrediente.setEstadoIngrediente("Solido");
//        ingrediente.setNombre("Salchichas");
//        ingrediente.setUnidadMedida("Unidad");
//        ingrediente.setTipoIngrediente("Proteina");
//        ingredientes[0] = ingrediente;
//        ingrediente = new Ingrediente();
//        ingrediente.setCantidad(1);
//        ingrediente.setEstadoIngrediente("Solido");
//        ingrediente.setNombre("Pan Perro");
//        ingrediente.setUnidadMedida("Unidad");
//        ingrediente.setTipoIngrediente("Grano");
//        ingredientes[1] = ingrediente;
//        inventario.agregarIngrediente(ingredientes);
//        
//    }
    public void AgregarCocina() {
        Cocina cocina = new Cocina();
        cocina.setDireccion("Calle falsa 123");
        cocina.setEspecialidad("Comida Rapida");
        cocina.setIdcocina(1);
        System.out.println(cocina.toString());

        Receta[] recetas = new Receta[2];
        Receta receta = new Receta();
        receta.setNombreReceta("Perro caliente");
        System.out.println(receta.toString());

        //Carga ingredientes receta Inicio
        Ingrediente[] ingredientes = new Ingrediente[2];
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Salchichas");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Proteina");
        ingredientes[0] = ingrediente;
        System.out.println(ingrediente.toString());

        ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Pan Perro");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Grano");
        ingredientes[1] = ingrediente;
        System.out.println(ingrediente.toString());

        //Carga ingredientes receta Inicio
        receta.setIngredientes(ingredientes);
        recetas[0] = receta;
        receta = new Receta();
        receta.setNombreReceta("hamburguesas");
        System.out.println(receta.toString());
        //Carga ingredientes receta Inicio

        ingredientes = new Ingrediente[2];
        ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Carne de hamburguesa");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Proteina");
        ingredientes[0] = ingrediente;
        System.out.println(ingrediente.toString());
        ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Pan hamburguesas");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Grano");
        ingredientes[1] = ingrediente;
        System.out.println(ingrediente.toString());
        //Carga ingredientes receta Inicio

        receta.setIngredientes(ingredientes);
        recetas[1] = receta;

        Inventario inventario = new Inventario();
        inventario.setIdinventario(1);
        System.out.println(inventario.toString());

        ingredientes = new Ingrediente[2];
        ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Salchichas");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Proteina");
        ingredientes[0] = ingrediente;
        System.out.println(ingrediente.toString());
        ingrediente = new Ingrediente();
        ingrediente.setCantidad(1);
        ingrediente.setEstadoIngrediente("Solido");
        ingrediente.setNombre("Pan Perro");
        ingrediente.setUnidadMedida("Unidad");
        ingrediente.setTipoIngrediente("Grano");
        ingredientes[1] = ingrediente;
        System.out.println(ingrediente.toString());
        inventario.setIngredientes(ingredientes);
        cocina.setRecetas(recetas);
        cocina.setIdinvetario(inventario);

        Pedido pedido = new Pedido();
        pedido.setIdPedido("001");
        pedido.setFecha("27/06/2018");

        Plato[] platos = new Plato[2];
        Plato plato = new Plato();
        plato.setNombre("Perro caliente");
        plato.setPorcion("Completa");
        plato.setValor(7000);
        platos[0] = plato;
        plato = new Plato();
        plato.setNombre("Pan hamburguesas");
        plato.setPorcion("Completa");
        plato.setValor(10000);
        platos[1] = plato;

        pedido.setPlatos(platos);
        pedido.setValorTotal(String.valueOf(platos[0].getValor() + platos[1].getValor()));
        System.out.println(pedido.toString());
        
        for (int i = 0; i < pedido.getPlatos().length; i++) {
            System.out.println(pedido.getPlatos()[i].toString());
         }
        for (Receta Ingredientesplato : cocina.getRecetas()) {         
            for (Ingrediente Ingrediente : cocina.getIdinvetario().getIngredientes()) {
                for (int i = 0; i < Ingredientesplato.getIngredientes().length ; i++) {
                    
                }
            }
            
            
        }
        
        
        }

}
