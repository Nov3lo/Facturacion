package com.tuempresa.facturacion.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(extendsView="super.DEFAULT",
members="factura{ factura }"
		)
@View( name="SinClienteNiFactura", // Una vista llamada SinClienteNiFactura
members=                       // que no incluye cliente ni factura
    "anyo, numero, fecha;" +   // Ideal para ser usada desde Factura
    "detalles;" +
    "observaciones"
)
public class Pedido extends DocumentoComercial {

	@ManyToOne
	 @ReferenceView("SinClienteNiPedidos") // Esta vista se usa para visualizar factura
	private Factura factura; 
}
