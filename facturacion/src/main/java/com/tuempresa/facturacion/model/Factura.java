package com.tuempresa.facturacion.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(extendsView ="super.DEFAULT",
 members = "pedidos{ pedidos }"
        )
@View( name="SinClienteNiPedidos", // Una vista llamada SinClienteNiPedidos
members=                       // que no incluye cliente ni pedidos
    "anyo, numero, fecha;" +   // Ideal para usarse desde Pedido
    "detalles;" +
    "observaciones"
)
public class Factura  extends DocumentoComercial{

	
	@OneToMany(mappedBy = "factura")
	@CollectionView("SinClienteNiFactura")
	private Collection<Pedido> pedidos;
	
}
