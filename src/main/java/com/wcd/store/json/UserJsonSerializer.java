package com.wcd.store.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.wcd.store.user.entity.User;

import java.io.IOException;

public class UserJsonSerializer extends JsonSerializer<User> {

	@Override
	public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializers)
			throws IOException {
		jsonGenerator.writeStartObject();
		if(user != null) {
			jsonGenerator.writeNumberField("id", user.getId());
			jsonGenerator.writeStringField("firstname", user.getFirstname());
		}
		jsonGenerator.writeEndObject();
	}

}
