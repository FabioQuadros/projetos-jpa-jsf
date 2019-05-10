package br.com.modelo.entidade;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Jogador.class)
public abstract class Jogador_ {

	public static volatile SingularAttribute<Jogador, Calendar> dataNasc;
	public static volatile SingularAttribute<Jogador, String> posicao;
	public static volatile SingularAttribute<Jogador, String> nome;
	public static volatile SingularAttribute<Jogador, Long> id;
	public static volatile SingularAttribute<Jogador, Time> time;

}

