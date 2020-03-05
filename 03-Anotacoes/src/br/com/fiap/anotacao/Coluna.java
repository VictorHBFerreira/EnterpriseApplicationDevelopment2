package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Manter a anota��o at� a execu��o do c�digo
@Retention(RetentionPolicy.RUNTIME)
//Determina o escopo da anota��o (onde pode ser usada)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Coluna {

	String nome();
	
	boolean unique() default false;
	
}