package com.rhcloud.vegetagpsraspberry.service;

import java.io.IOException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rhcloud.vegetagpsraspberry.model.Localizacao;

@Path("/GpsService")
public class GpsService {
	//como chamar -> http://localhost:8080/gps1/GpsService/addLocalizacao?id=thiago&latitude=w&longitude=7&data=teste
	@GET
	@Path("/addLocalizacao")
	@Produces(MediaType.APPLICATION_JSON)
	public Response adicionarLocalizacao(
			@QueryParam("id") 		String 	id,
			@QueryParam("latitude") 	String 	latitude,
			@QueryParam("longitude")	String 	longitude,
			@QueryParam("data")		String 	data) 
	throws IOException{
		//sempre cria um novo objeto
		Localizacao localizacao = new Localizacao();
		String output = "ID: "+id+"\n Latitude: "+latitude+"\n Longitude: "+longitude+" \n Data: "+data;
		//configura o objeto
		localizacao.setLatitude(latitude);
		localizacao.setLongitude(longitude);
		localizacao.setData(data);
		
		return Response.status(200).entity(output).build();
	}
	
	//como chamar -> http://localhost:8080/gps1/GpsService/sretertert
	@GET
	@Path("/{param}")
	public Response adicionarLocalizacao1(@PathParam("param") String param){
		
		String output = "Teste";
		
		return Response.status(200).entity(output).build();
	}
	
}
