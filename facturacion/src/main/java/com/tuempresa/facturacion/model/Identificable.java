package com.tuempresa.facturacion.model;

import javax.persistence.*;

import org.hibernate.annotations.*;

import lombok.*;


@MappedSuperclass
@Getter @Setter
public class Identificable {
	
	@Id
	@GeneratedValue(generator = "system-uuid" )
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length=32)
	String Oid;

}
